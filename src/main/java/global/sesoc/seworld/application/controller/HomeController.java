package global.sesoc.seworld.application.controller;

import global.sesoc.seworld.dao.BoardReplyRepository;
import global.sesoc.seworld.dao.BoardRepository;
import global.sesoc.seworld.dao.ExhibitionRepository;
import global.sesoc.seworld.dto.Board;
import global.sesoc.seworld.dto.BoardReply;
import global.sesoc.seworld.dto.Exhibition;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SE World Home Controller
 *
 * @author youngbinkim
 * @version 0.1
 */
@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ExhibitionRepository exhibitionRepository;

    private final BoardRepository boardRepository;

    private final BoardReplyRepository boardReplyRepository;

    // 메인 페이지로 이동
    @GetMapping
    public String home(Model model) {
        log.info("[/]");
        return mainPage(model);
    }

    @GetMapping(value = "/main")
    public String main(Model model) {
        log.info("[/main]");
        return mainPage(model);
    }

    private String mainPage(Model model) {
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
    @GetMapping(value = "/index")
    public String newMainPage() {
        log.info("[/oldIndex]");
        return "index";
    }

    @GetMapping(value = "/readArticle3")
    public String articlereading() {
        return "board/readArticle3";
    }

    @GetMapping(value = "/howtouse")
    public String howtouse() {
        return "howtouse";
    }

}
