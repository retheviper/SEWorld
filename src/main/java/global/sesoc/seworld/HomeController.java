package global.sesoc.seworld;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.seworld.dao.BoardReplyRepository;
import global.sesoc.seworld.dao.BoardRepository;
import global.sesoc.seworld.dao.ExhibitionRepository;
import global.sesoc.seworld.dto.Board;
import global.sesoc.seworld.dto.BoardReply;
import global.sesoc.seworld.dto.Exhibition;

@Controller
public class HomeController {

	/**
	 * SE World Home Controller
	 * 
	 * @author youngbinkim
	 * @version 0.1
	 */

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	ExhibitionRepository exhibitionRepository;

	@Autowired
	BoardRepository boardRepository;

	@Autowired
	BoardReplyRepository boardReplyRepository;

	// 메인 페이지로 이동
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		// List<Exhibition> mapList = exhibitionRepository.getListForMap();
		// model.addAttribute("mapList", mapList);
		logger.info("[/]");
		List<Exhibition> recentExhibition = exhibitionRepository.getRecentExhibition();
		List<Board> recentReviews = boardRepository.getRecentReviews();
		List<BoardReply> replies = boardReplyRepository.getBoardRepliesList();
		Map<String, Integer> replyListCount = new HashMap<>();
		for (int i = 0; i < recentReviews.size(); i++) {
			int counter = 0;
			for (int j = 0; j < replies.size(); j++) {
				if (recentReviews.get(i).getBoardId().equals(replies.get(j).getBoardId())) {
					counter += 1;
				}
			}
			replyListCount.put(recentReviews.get(i).getBoardId(), counter);
		}
		model.addAttribute("recentExhibition", recentExhibition);
		model.addAttribute("recentReviews", recentReviews);
		model.addAttribute("replyListCount", replyListCount);
		return "main";
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Model model) {
		// List<Exhibition> mapList = exhibitionRepository.getListForMap();
		// model.addAttribute("mapList", mapList);
		logger.info("[/main]");
		List<Exhibition> recentExhibition = exhibitionRepository.getRecentExhibition();
		List<Board> recentReviews = boardRepository.getRecentReviews();
		List<BoardReply> replies = boardReplyRepository.getBoardRepliesList();
		Map<String, Integer> replyListCount = new HashMap<>();
		for (int i = 0; i < recentReviews.size(); i++) {
			int counter = 0;
			for (int j = 0; j < replies.size(); j++) {
				if (recentReviews.get(i).getBoardId().equals(replies.get(j).getBoardId())) {
					counter += 1;
				}
			}
			replyListCount.put(recentReviews.get(i).getBoardId(), counter);
		}
		model.addAttribute("recentExhibition", recentExhibition);
		model.addAttribute("recentReviews", recentReviews);
		model.addAttribute("replyListCount", replyListCount);
		return "main";
	}

	/* 예전 메인 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String newMainPage() {
		logger.info("[/oldIndex]");
		return "index";
	}

	@RequestMapping(value = "/readArticle3", method = RequestMethod.GET)
	public String articlereading() {
		return "board/readArticle3";
	}
	
	@RequestMapping(value = "/howtouse", method = RequestMethod.GET)
	public String howtouse() {
		return "howtouse";
	}

}
