package global.sesoc.seworld.application.controller;

import global.sesoc.seworld.dao.CommentRepository;
import global.sesoc.seworld.dao.ExhibitionDetailRepository;
import global.sesoc.seworld.dao.LikingRepository;
import global.sesoc.seworld.dao.WishingRepository;
import global.sesoc.seworld.dto.Comment;
import global.sesoc.seworld.dto.ExhibitionDetail;
import global.sesoc.seworld.dto.Liking;
import global.sesoc.seworld.dto.Wishing;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ExhibitionDetailController {

    private final ExhibitionDetailRepository exbtDetailRepository;

    private final CommentRepository commentRepository;

    private final LikingRepository likingRepository;

    private final WishingRepository wishingRepository;

    @RequestMapping(value = "/getExbtDetail", method = RequestMethod.POST)
    public @ResponseBody
    ExhibitionDetail getExbtDetail(String exhibitionId, HttpSession session) {
        log.info("[/getExbtDetail]");
        String loginId = (String) session.getAttribute("loginId");
        ExhibitionDetail exbtDetail = new ExhibitionDetail();
        exbtDetail.setExhibitionId(exhibitionId);
        exbtDetail.setMemberId(loginId);
        return exbtDetailRepository.viewExhibitionDetail(exbtDetail);
    }

    @RequestMapping(value = "/insertWishing", method = RequestMethod.POST)
    public @ResponseBody
    Integer insertWishing(String exhibitionId, HttpSession session) {
        log.info("[/insertWishing]");
        String loginId = (String) session.getAttribute("loginId");
        Wishing wishing = new Wishing();
        wishing.setExhibitionId(exhibitionId);
        wishing.setMemberId(loginId);
        if (wishingRepository.selectOneWishing(wishing) != null) {
            return wishingRepository.updateWishingInserted(wishing);
        }
        return wishingRepository.insertOneWishing(wishing);
    }

    @RequestMapping(value = "/deleteWishing", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteWishing(String exhibitionId, HttpSession session) {
        log.info("[/insertWishing]");
        String loginId = (String) session.getAttribute("loginId");
        Wishing wishing = new Wishing();
        wishing.setExhibitionId(exhibitionId);
        wishing.setMemberId(loginId);
        return wishingRepository.updateWishingDeleted(wishing);
    }

    @RequestMapping(value = "/insertLiking", method = RequestMethod.POST)
    public @ResponseBody
    Integer insertLiking(String exhibitionId, HttpSession session) {
        log.info("[/insertLiking]");
        String loginId = (String) session.getAttribute("loginId");
        Liking liking = new Liking();
        liking.setExhibitionId(exhibitionId);
        liking.setMemberId(loginId);
        if (likingRepository.selectOneLiking(liking) != null) {
            return likingRepository.updateLikingInserted(liking);
        }
        return likingRepository.insertOneLiking(liking);
    }

    @RequestMapping(value = "/deleteLiking", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteLiking(String exhibitionId, HttpSession session) {
        log.info("[/deleteLiking]");
        String loginId = (String) session.getAttribute("loginId");
        Liking liking = new Liking();
        liking.setExhibitionId(exhibitionId);
        liking.setMemberId(loginId);
        return likingRepository.updateLikingDeleted(liking);
    }

    @RequestMapping(value = "/insertComment", method = RequestMethod.POST)
    public @ResponseBody
    Integer insertComment(@RequestBody Comment comment, HttpSession session) {
        log.info("[/insertComment]");
        String loginId = (String) session.getAttribute("loginId");
        comment.setMemberId(loginId);
        return commentRepository.insertComment(comment);
    }

    @RequestMapping(value = "/deleteComment", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteComment(String exhibitionId, HttpSession session) {
        log.info("[/deleteComment]");
        String loginId = (String) session.getAttribute("loginId");
        Comment comment = new Comment();
        comment.setExhibitionId(exhibitionId);
        comment.setMemberId(loginId);
        return commentRepository.deleteComment(comment);
    }

    @RequestMapping(value = "/updateComment", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateComment(@RequestBody Comment comment, HttpSession session) {
        log.info("[/updateComment]");
        String loginId = (String) session.getAttribute("loginId");
        comment.setMemberId(loginId);
        return commentRepository.updateComment(comment);
    }
}
