package global.sesoc.seworld.application.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import global.sesoc.seworld.domain.dao.*;
import global.sesoc.seworld.domain.dto.*;
import global.sesoc.seworld.util.FileService;
import global.sesoc.seworld.util.RedirectUtil;
import global.sesoc.seworld.util.SessionAttributeSupplier;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * SE World Review Controller
 * <p>
 * 유저 리뷰 관련 컨트롤러
 *
 * @author youngbinkim
 * @version 0.1
 */
@Controller
@Transactional
@RequiredArgsConstructor
public class BoardController {

    private final ObjectMapper mapper;

    private final BoardRepository boardRepository;

    private final BoardFileRepository boardFileRepository;

    private final BoardReplyRepository boardReplyRepository;

    private final ExhibitionRepository exhibitionRepository;

    private final MemberRepository memberRepository;

    private static final String UPLOAD_PATH = "resources/userUploadedFile/attachments";

    // 리뷰 게시판 페이지로 이동
    @GetMapping(value = "/reviews")
    public String getReviews() {
        return "board/reviewBoard";
    }

    // 리뷰 게시판 테이블 정보 전달
    @PostMapping(value = "/reviewsAjax", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getReviewsByAsync(final int start, final int length, @RequestParam(value = "search[value]") final String searchText) {
        final int totalCount = this.boardRepository.getTotalList();
        final List<Board> boards = this.boardRepository.viewAllReviews(start, length, searchText);
        try {
            return createJson(boards, totalCount);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    // 질문 게시판 페이지로 이동
    @GetMapping(value = "/questions")
    public String questions() {
        return "board/questionBoard";
    }

    // 질문 게시판 테이블 정보 전달
    @PostMapping(value = "/questionsAjax", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getQuestionsByAsync(final int start, final int length, @RequestParam(value = "search[value]") final String searchText) {
        final int totalCount = this.boardRepository.getTotalList();
        final List<Board> boards = this.boardRepository.viewAllQuestions(start, length, searchText);
        try {
            return createJson(boards, totalCount);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private String createJson(final List<Board> boards, final int totalCount) throws JsonProcessingException {
        return mapper.writeValueAsString(new TableWrapper(boards, totalCount, totalCount));
    }

    // 게시글 읽기
    @GetMapping(value = "/readArticle")
    public String readArticle(final String boardId, final Model model) {
        final Board articleDetail = this.boardRepository.viewBoardDetail(boardId);
        final Exhibition exhibitionForArticle = this.exhibitionRepository.showExhibitionDetail(articleDetail.getExhibitionId());

        final int countR = boardReplyRepository.countBoardReply(boardId);
        final List<BoardReply>
                replyList = boardReplyRepository.boardReplyOfOneboard(boardId);
        model.addAttribute("countNum", countR);
        model.addAttribute("replyList", replyList);

        final Member articleAuthor = memberRepository.selectOneMember(articleDetail.getMemberId());
        final String articleFileId = boardFileRepository.getBoardFileIdByBoardId(boardId);
        if (articleFileId != null) {
            final BoardFile articleAttachement = boardFileRepository.selectOneBoardFile(articleFileId);
            model.addAttribute("articleAttachement", articleAttachement);
        }
        final List<BoardReply> replies = boardReplyRepository.getBoardRepliesList();
        final List<Board> relatedArticles = this.boardRepository.getAuthosRecentReviews(articleDetail.getMemberId());
        if (relatedArticles != null && !relatedArticles.isEmpty()) {
            model.addAttribute("RelatedArticles", relatedArticles);
            final Map<String, Integer> replyListCount = new HashMap<>();
            for (var relatedArticle : relatedArticles) {
                replyListCount.put(relatedArticle.getBoardId(), (int) replies.stream().filter(repliesOfOtherArticle -> Objects.equals(relatedArticle.getBoardId(), repliesOfOtherArticle.getBoardId())).count());
            }
            model.addAttribute("replyListCount", replyListCount);
        }

        final int replyCount = (int) replies.stream().filter(br -> br.getBoardId().equals(boardId)).count();
        final int heartCount = (int) (Math.random() * 5) + 1;

        model.addAttribute("numofHeart", heartCount);
        model.addAttribute("articleAuthor", articleAuthor);
        model.addAttribute("articleDetail", articleDetail);
        model.addAttribute("exbhibitionForArticle", exhibitionForArticle);
        model.addAttribute("replyCount", replyCount);
        return "board/readArticle";
    }

    // 게시물 쓰기 페이지 이동
    @GetMapping(value = "/writeArticle")
    public String writeReview() {
        return "board/writeArticle";
    }

    // 게시물 입력
    @PostMapping(value = "/writeArticle")
    public String writeReview(final Board board, final MultipartFile uploadFile, final HttpSession session) {
        final String userId = SessionAttributeSupplier.getLoginId(session);
        board.setMemberId(userId);
        this.boardRepository.insertBoard(board);
        if (!uploadFile.isEmpty()) {
            saveFile(uploadFile, userId);
        }
        return returnBoardByCategory(board.getCategory());
    }

    // 게시물 수정 페이지 이동
    @GetMapping(value = "/updateArticle")
    public String updateReview(final String boardId, final Model model) {
        final Board original = this.boardRepository.viewBoardDetail(boardId);
        final Exhibition selectedExhibition = this.exhibitionRepository.showExhibitionDetail(original.getExhibitionId());
        final String boardFileId = boardFileRepository.getBoardFileIdByBoardId(boardId);
        final BoardFile originalFile = boardFileRepository.selectOneBoardFile(boardFileId);
        if (originalFile != null) {
            model.addAttribute("originalFile", originalFile);
        }
        model.addAttribute("original", original);
        model.addAttribute("selectedExhibition", selectedExhibition);
        return "board/updateArticle";
    }

    // 게시물 수정 입력
    @PostMapping(value = "/updateArticle")
    public String updateReview(final Board board, final MultipartFile uploadFile, final HttpSession session, final String deleteFile) {
        final String userId = SessionAttributeSupplier.getLoginId(session);
        final String boardId = this.boardRepository.getBoardId(userId);
        board.setMemberId(userId);
        this.boardRepository.updateBoard(board);
        final String oldFileId = boardFileRepository.getBoardFileIdByBoardId(boardId);
        final BoardFile oldBoardFile = boardFileRepository.selectOneBoardFile(oldFileId);

        if (deleteFile != null && deleteFile.strip().equals("deletefile")) {
            final String savedFile = oldBoardFile.getSvFilename();
            final String fullPath = UPLOAD_PATH + "/" + savedFile;
            FileService.deleteFile(fullPath);
            boardFileRepository.deleteOneBoardFile(boardId);
        } else if (oldBoardFile != null && !uploadFile.isEmpty()) {
            saveFile(uploadFile, userId);
        }

        return returnBoardByCategory(board.getCategory());
    }

    // 게시물 삭제하기
    @GetMapping(value = "/deleteArticle")
    public String deleteReview(final String boardId) {
        this.boardRepository.deleteBoard(boardId);
        return RedirectUtil.redirectTo("/reviews");
    }

    // 게시물 첨부 파일 다운로드
    @GetMapping(value = "/downloadFile")
    public void downloadFile(final String boardId, final HttpServletResponse response) {
        final String boardFileId = boardFileRepository.getBoardFileIdByBoardId(boardId);
        final BoardFile originalFile = boardFileRepository.selectOneBoardFile(boardFileId);
        final String originalFileOgFilename = originalFile.getOgFilename();
        final String fileSavedPath = UPLOAD_PATH + "/" + originalFile.getSvFilename();
        try (InputStream input = Files.newInputStream(Path.of(fileSavedPath));
             OutputStream output = response.getOutputStream()) {
            input.transferTo(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION,
                " attachment;filename=" + URLEncoder.encode(originalFileOgFilename, StandardCharsets.UTF_8));
    }

    @PostMapping(value = "/insertArticleComment")
    public @ResponseBody
    Map<String, Object> insertComment(@RequestBody final BoardReply boardReply) {
        boardReplyRepository.insertOneBoardReply(boardReply);
        final List<BoardReply> replies = boardReplyRepository.boardReplyOfOneboard(boardReply.getBoardId());
        final int repliesCount = boardReplyRepository.countBoardReply(boardReply.getBoardId());
        final Map<String, Object> result = Map.ofEntries(
                Map.entry("replies", replies),
                Map.entry("repliesCount", repliesCount)
        );
        return result;
    }

    @GetMapping(value = "/googleView")
    public String googleView() {
        return "exhibition/googleView";
    }

    private String returnBoardByCategory(final String category) {
        if (category.equals("question")) {
            return RedirectUtil.redirectTo("/questions");
        } else {
            return RedirectUtil.redirectTo("/reviews");
        }
    }

    private void saveFile(final MultipartFile uploadFile, final String userId) {
        final String originalFile = uploadFile.getOriginalFilename();
        final String savedFile = FileService.saveFile(uploadFile, UPLOAD_PATH);
        final BoardFile boardFile = new BoardFile();
        boardFile.setBoardId(this.boardRepository.getBoardId(userId));
        boardFile.setOgFilename(originalFile);
        boardFile.setSvFilename(savedFile);
        boardFile.setFileSize(uploadFile.getSize());
        boardFileRepository.insertOneBoardFile(boardFile);
    }
}
