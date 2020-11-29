package global.sesoc.seworld.application.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import global.sesoc.seworld.dao.*;
import global.sesoc.seworld.dto.*;
import global.sesoc.seworld.util.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SE World Review Controller
 * <p>
 * 유저 리뷰 관련 컨트롤러
 *
 * @author youngbinkim
 * @version 0.1
 */
@Controller
@RequiredArgsConstructor
public class BoardController {

    private final ObjectMapper mapper;

    private final BoardRepository boardRepository;

    private final BoardFileRepository boardFileRepository;

    private final BoardReplyRepository boardReplyRepository;

    private final ExhibitionRepository exhibitionRepository;

    private final MemberRepository memberRepository;

    private final String uploadPath = "resources/userUploadedFile/attachments";

    // 리뷰 게시판 페이지로 이동
    @GetMapping(value = "/reviews")
    public String getReviews() {
        return "board/reviewBoard";
    }

    // 리뷰 게시판 테이블 정보 전달
    @PostMapping(value = "/reviewsAjax", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getReviewsByAsync(final int start, final int length, @RequestParam(value = "search[value]") final String searchText) {
        final int totalCount = boardRepository.getTotalList();
        final List<Board> boards = boardRepository.viewAllReviews(start, length, searchText);
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
        final int totalCount = boardRepository.getTotalList();
        final List<Board> boards = boardRepository.viewAllQuestions(start, length, searchText);
        try {
            return createJson(boards, totalCount);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private String createJson(List<Board> boards, int totalCount) throws JsonProcessingException {
        TableWrapper wrapper = new TableWrapper(boards, totalCount, totalCount);
        return mapper.writeValueAsString(wrapper);
    }

    // 게시글 읽기
    @GetMapping(value = "/readArticle")
    public String readArticle(String boardId, Model model) {
        Board articleDetail = boardRepository.viewBoardDetail(boardId);
        Exhibition exbhibitionForArticle = exhibitionRepository.showExhibitionDetail(articleDetail.getExhibitionId());
        List<BoardReply> replyList = new ArrayList<>();

        int countR = boardReplyRepository.countBoardReply(boardId);
        model.addAttribute("countNum", countR);
        replyList = boardReplyRepository.boardReplyOfOneboard(boardId);
        model.addAttribute("replyList", replyList);

        Member articleAuthor = memberRepository.selectOneMember(articleDetail.getMemberId());
        String articleFileId = boardFileRepository.getBoardFileIdByBoardId(boardId);
        if (articleFileId != null) {
            BoardFile articleAttachement = boardFileRepository.selectOneBoardFile(articleFileId);
            model.addAttribute("articleAttachement", articleAttachement);
        }
        List<BoardReply> replies = boardReplyRepository.getBoardRepliesList();
        List<Board> RelatedArticles = boardRepository.getAuthosRecentReviews(articleDetail.getMemberId());
        if (RelatedArticles != null) {
            model.addAttribute("RelatedArticles", RelatedArticles);
            List<BoardReply> repliesOfOtherArticle = boardReplyRepository.getBoardRepliesList();
            Map<String, Integer> replyListCount = new HashMap<>();
            for (int i = 0; i < RelatedArticles.size(); i++) {
                int counter = 0;
                for (int j = 0; j < replies.size(); j++) {
                    if (RelatedArticles.get(i).getBoardId().equals(repliesOfOtherArticle.get(j).getBoardId())) {
                        counter += 1;
                    }
                }
                replyListCount.put(RelatedArticles.get(i).getBoardId(), counter);
            }
            model.addAttribute("replyListCount", replyListCount);
        }
        int replyCount = 0;
        for (BoardReply br : replies) {
            if (br.getBoardId().equals(boardId)) {
                replyCount += 1;
            }
        }

        int numofHeart = 0;
        numofHeart = (int) (Math.random() * 5) + 1;

        model.addAttribute("numofHeart", numofHeart);
        model.addAttribute("articleAuthor", articleAuthor);
        model.addAttribute("articleDetail", articleDetail);
        model.addAttribute("exbhibitionForArticle", exbhibitionForArticle);
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
    public String writeReview(Board board, MultipartFile uploadFile, HttpSession session) {
        String userid = (String) session.getAttribute("loginId");
        board.setMemberId(userid);

        boardRepository.insertBoard(board);

        if (!uploadFile.isEmpty()) {
            String originalfile = uploadFile.getOriginalFilename();
            String savedfile = FileService.saveFile(uploadFile, uploadPath);
            BoardFile boardFile = new BoardFile();
            boardFile.setBoardId(boardRepository.getBoardId(userid));
            boardFile.setOgFilename(originalfile);
            boardFile.setSvFilename(savedfile);
            boardFile.setFileSize(uploadFile.getSize());
            boardFileRepository.insertOneBoardFile(boardFile);
        }

        if (board.getCategory().equals("question")) {
            return "redirect:/questions";
        } else {
            return "redirect:/reviews";
        }
    }

    // 게시물 수정 페이지 이동
    @GetMapping(value = "/updateArticle")
    public String updateReview(String boardId, Model model) {
        Board original = boardRepository.viewBoardDetail(boardId);
        Exhibition selectedExhibition = exhibitionRepository.showExhibitionDetail(original.getExhibitionId());
        String boardFileId = boardFileRepository.getBoardFileIdByBoardId(boardId);
        BoardFile originalFile = boardFileRepository.selectOneBoardFile(boardFileId);
        if (originalFile != null) {
            model.addAttribute("originalFile", originalFile);
        }
        model.addAttribute("original", original);
        model.addAttribute("selectedExhibition", selectedExhibition);
        return "board/updateArticle";
    }

    // 게시물 수정 입력
    @PostMapping(value = "/updateArticle")
    public String updateReview(Board board, MultipartFile uploadFile, HttpSession session, String deleteFile) {
        String userid = (String) session.getAttribute("loginId");
        String boardId = boardRepository.getBoardId(userid);
        board.setMemberId(userid);
        boardRepository.updateBoard(board);
        String oldFileId = boardFileRepository.getBoardFileIdByBoardId(boardId);
        BoardFile oldBoardFile = boardFileRepository.selectOneBoardFile(oldFileId);

        if (deleteFile != null && deleteFile.equals("deletefile")) {
            String savedfile = oldBoardFile.getSvFilename();
            String fullpath = uploadPath + "/" + savedfile;
            FileService.deleteFile(fullpath);
            boardFileRepository.deleteOneBoardFile(boardId);
        } else if (oldBoardFile != null && !uploadFile.isEmpty()) {
            String originalfile = uploadFile.getOriginalFilename();
            String savedfile = FileService.saveFile(uploadFile, uploadPath);
            BoardFile newBoardFile = new BoardFile();
            newBoardFile.setBoardId(boardId);
            newBoardFile.setOgFilename(originalfile);
            newBoardFile.setSvFilename(savedfile);
            newBoardFile.setFileSize(uploadFile.getSize());
            boardFileRepository.insertOneBoardFile(newBoardFile);
        }

        if (board.getCategory().equals("question")) {
            return "redirect:/questions";
        } else {
            return "redirect:/reviews";
        }
    }

    // 게시물 삭제하기
    @GetMapping(value = "/deleteArticle")
    public String deleteReview(String boardId) {
        boardRepository.deleteBoard(boardId);
        return "redirect:/reviews";
    }

    // 게시물 첨부 파일 다운로드
    @GetMapping(value = "/downloadFile")
    public void downloadFile(final String boardId, final HttpServletResponse response) {
        final String boardFileId = boardFileRepository.getBoardFileIdByBoardId(boardId);
        final BoardFile originalFile = boardFileRepository.selectOneBoardFile(boardFileId);
        final String originalFileOgFilename = originalFile.getOgFilename();
        final String fileSavedPath = uploadPath + "/" + originalFile.getSvFilename();
        try (InputStream input = new BufferedInputStream(new FileInputStream(fileSavedPath));
             OutputStream output = new BufferedOutputStream(response.getOutputStream())) {
            response.setHeader("Content-Disposition",
                    " attachment;filename=" + URLEncoder.encode(originalFileOgFilename, "UTF-8"));
            input.transferTo(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostMapping(value = "/insertArticleComment")
    public @ResponseBody
    Map<String, Object> insertComment(@RequestBody BoardReply boardReply) {
        boardReplyRepository.insertOneBoardReply(boardReply);
        List<BoardReply> replies = boardReplyRepository.boardReplyOfOneboard(boardReply.getBoardId());
        int repliesCount = boardReplyRepository.countBoardReply(boardReply.getBoardId());

        Map<String, Object> result = new HashMap<>();
        result.put("replies", replies);
        result.put("repliesCount", repliesCount);
        return result;
    }

    @GetMapping(value = "/googleView")
    public String googleview() {
        return "exhibition/googleView";
    }


}
