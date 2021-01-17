package global.sesoc.seworld.application.controller;

import global.sesoc.seworld.domain.dao.CommentRepository;
import global.sesoc.seworld.domain.dao.ExhibitionDetailRepository;
import global.sesoc.seworld.domain.dao.LikingRepository;
import global.sesoc.seworld.domain.dao.WishingRepository;
import global.sesoc.seworld.domain.dto.Comment;
import global.sesoc.seworld.domain.dto.ExhibitionDetail;
import global.sesoc.seworld.domain.dto.Liking;
import global.sesoc.seworld.domain.dto.Wishing;
import global.sesoc.seworld.util.SessionAttributeSupplier;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@Transactional
@RequiredArgsConstructor
public class ExhibitionDetailController {

    private final ExhibitionDetailRepository exbtDetailRepository;

    private final CommentRepository commentRepository;

    private final LikingRepository likingRepository;

    private final WishingRepository wishingRepository;

    @RequestMapping(value = "/getExbtDetail", method = RequestMethod.POST)
    public @ResponseBody
    ExhibitionDetail getExbtDetail(final String exhibitionId, final HttpSession session) {
        log.info("[/getExbtDetail]");
        final String userId = SessionAttributeSupplier.getLoginId(session);
        final ExhibitionDetail exbtDetail = new ExhibitionDetail();
        exbtDetail.setExhibitionId(exhibitionId);
        exbtDetail.setMemberId(userId);
        return exbtDetailRepository.viewExhibitionDetail(exbtDetail);
    }

    @RequestMapping(value = "/insertWishing", method = RequestMethod.POST)
    public @ResponseBody
    Integer insertWishing(final String exhibitionId, final HttpSession session) {
        log.info("[/insertWishing]");
        final String userId = SessionAttributeSupplier.getLoginId(session);
        final Wishing wishing = createWishing(exhibitionId, userId);
        if (wishingRepository.selectOneWishing(wishing) != null) {
            return wishingRepository.updateWishingInserted(wishing);
        }
        return wishingRepository.insertOneWishing(wishing);
    }

    @RequestMapping(value = "/deleteWishing", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteWishing(final String exhibitionId, final HttpSession session) {
        log.info("[/insertWishing]");
        final String userId = SessionAttributeSupplier.getLoginId(session);
        return wishingRepository.updateWishingDeleted(createWishing(exhibitionId, userId));
    }

    @RequestMapping(value = "/insertLiking", method = RequestMethod.POST)
    public @ResponseBody
    Integer insertLiking(final String exhibitionId, final HttpSession session) {
        log.info("[/insertLiking]");
        final String userId = SessionAttributeSupplier.getLoginId(session);
        final Liking liking = createLinking(exhibitionId, userId);
        if (likingRepository.selectOneLiking(liking) != null) {
            return likingRepository.updateLikingInserted(liking);
        }
        return likingRepository.insertOneLiking(liking);
    }

    @RequestMapping(value = "/deleteLiking", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteLiking(final String exhibitionId, final HttpSession session) {
        log.info("[/deleteLiking]");
        final String userId = SessionAttributeSupplier.getLoginId(session);
        return likingRepository.updateLikingDeleted(createLinking(exhibitionId, userId));
    }

    @RequestMapping(value = "/insertComment", method = RequestMethod.POST)
    public @ResponseBody
    Integer insertComment(@RequestBody final Comment comment, final HttpSession session) {
        log.info("[/insertComment]");
        comment.setMemberId(SessionAttributeSupplier.getLoginId(session));
        return commentRepository.insertComment(comment);
    }

    @RequestMapping(value = "/deleteComment", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteComment(final String exhibitionId, final HttpSession session) {
        log.info("[/deleteComment]");
        final Comment comment = new Comment();
        comment.setExhibitionId(exhibitionId);
        comment.setMemberId(SessionAttributeSupplier.getLoginId(session));
        return commentRepository.deleteComment(comment);
    }

    @RequestMapping(value = "/updateComment", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateComment(@RequestBody final Comment comment, final HttpSession session) {
        log.info("[/updateComment]");
        comment.setMemberId(SessionAttributeSupplier.getLoginId(session));
        return commentRepository.updateComment(comment);
    }

    private Wishing createWishing(final String exhibitionId, final String userId) {
        final Wishing wishing = new Wishing();
        wishing.setExhibitionId(exhibitionId);
        wishing.setMemberId(userId);
        return wishing;
    }

    private Liking createLinking(final String exhibitionId, final String userId) {
        final Liking liking = new Liking();
        liking.setExhibitionId(exhibitionId);
        liking.setMemberId(userId);
        return liking;
    }
}
