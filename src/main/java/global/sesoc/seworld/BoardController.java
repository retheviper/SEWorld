package global.sesoc.seworld;

import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import global.sesoc.seworld.dao.BoardFileRepository;
import global.sesoc.seworld.dao.BoardReplyRepository;
import global.sesoc.seworld.dao.BoardRepository;
import global.sesoc.seworld.dao.ExhibitionRepository;
import global.sesoc.seworld.dao.MemberRepository;
import global.sesoc.seworld.dto.Board;
import global.sesoc.seworld.dto.BoardFile;
import global.sesoc.seworld.dto.BoardReply;
import global.sesoc.seworld.dto.Exhibition;
import global.sesoc.seworld.dto.Member;
import global.sesoc.seworld.dto.TableWrapperDTO;
import global.sesoc.seworld.util.FileService;

@Controller
public class BoardController {

	/*
	 * SE World Review Controller
	 * 
	 * 유저 리뷰 관련 컨트롤러
	 *
	 * @author youngbinkim
	 * 
	 * @version 0.1
	 */

	@Autowired
	BoardRepository boardRepository;

	@Autowired
	BoardFileRepository boardFileRepository;

	@Autowired
	BoardReplyRepository boardReplyRepository;

	@Autowired
	ExhibitionRepository exhibitionRepository;

	@Autowired
	MemberRepository memberRepository;

	final String uploadPath = "resources/userUploadedFile/attachments";

	// 리뷰 게시판 페이지로 이동
	@RequestMapping(value = "/reviews", method = RequestMethod.GET)
	public String reviews() {
		return "board/reviewBoard";
	}

	// 리뷰 게시판 테이블 정보 전달
	@RequestMapping(value = "/reviewsAjax", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String reviewsAjax(int start, int length, @RequestParam(value = "search[value]") String searchText) {
		int totalCount = boardRepository.getTotalList();
		List<Board> Boards = boardRepository.viewAllReviews(start, length, searchText);

		TableWrapperDTO wrapper = new TableWrapperDTO();
		wrapper.setAaData(Boards);
		wrapper.setiTotalRecords(totalCount);
		wrapper.setiTotalDisplayRecords(totalCount);

		Gson ojb = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

		return ojb.toJson(wrapper);
	}

	// 질문 게시판 페이지로 이동
	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public String questions() {
		return "board/questionBoard";
	}

	// 질문 게시판 테이블 정보 전달
	@RequestMapping(value = "/questionsAjax", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String questionsAjax(int start, int length, @RequestParam(value = "search[value]") String searchText) {
		int totalCount = boardRepository.getTotalList();
		List<Board> Boards = boardRepository.viewAllQuestions(start, length, searchText);

		TableWrapperDTO wrapper = new TableWrapperDTO();
		wrapper.setAaData(Boards);
		wrapper.setiTotalRecords(totalCount);
		wrapper.setiTotalDisplayRecords(totalCount);

		Gson ojb = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

		return ojb.toJson(wrapper);
	}

	// 게시글 읽기
	@RequestMapping(value = "/readArticle", method = RequestMethod.GET)
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
		
		int numofHeart=0;
		numofHeart = (int)(Math.random()*5)+1;
		
		model.addAttribute("numofHeart", numofHeart);
		model.addAttribute("articleAuthor", articleAuthor);
		model.addAttribute("articleDetail", articleDetail);
		model.addAttribute("exbhibitionForArticle", exbhibitionForArticle);
		model.addAttribute("replyCount", replyCount);
		return "board/readArticle";
	}

	// 게시물 쓰기 페이지 이동
	@RequestMapping(value = "/writeArticle", method = RequestMethod.GET)
	public String writeReview() {
		return "board/writeArticle";
	}

	// 게시물 입력
	@RequestMapping(value = "/writeArticle", method = RequestMethod.POST)
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
	@RequestMapping(value = "/updateArticle", method = RequestMethod.GET)
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
	@RequestMapping(value = "/updateArticle", method = RequestMethod.POST)
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
	@RequestMapping(value = "/deleteArticle", method = RequestMethod.GET)
	public String deleteReview(String boardId) {
		boardRepository.deleteBoard(boardId);
		return "redirect:/reviews";
	}

	// 게시물 첨부 파일 다운로드
	@RequestMapping(value = "/downloadFile", method = RequestMethod.GET)
	public String downloadFile(String boardId, HttpServletResponse response) {
		String boardFileId = boardFileRepository.getBoardFileIdByBoardId(boardId);
		BoardFile originalFile = boardFileRepository.selectOneBoardFile(boardFileId);
		String originalfile = originalFile.getOgFilename();
		String savedfile = originalFile.getSvFilename();
		String fullpath = uploadPath + "/" + savedfile;

		FileInputStream fis = null;
		ServletOutputStream sos = null;

		try {
			response.setHeader("Content-Disposition",
					" attachment;filename=" + URLEncoder.encode(originalfile, "UTF-8"));
			fis = new FileInputStream(fullpath);
			sos = response.getOutputStream();
			FileCopyUtils.copy(fis, sos);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				sos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

	@RequestMapping(value = "/insertArticleComment", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> insertComment(@RequestBody BoardReply boardReply) {
		boardReplyRepository.insertOneBoardReply(boardReply);
		List<BoardReply> replies = boardReplyRepository.boardReplyOfOneboard(boardReply.getBoardId());
		int repliesCount = boardReplyRepository.countBoardReply(boardReply.getBoardId());
		
		Map<String, Object> result = new HashMap<>();
		result.put("replies", replies);
		result.put("repliesCount", repliesCount);
		return result;
	}
	
	@RequestMapping(value = "/googleView", method = RequestMethod.GET)
	public String googleview() {
		return "exhibition/googleView";
	}


}
