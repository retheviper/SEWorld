package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.CommentReplyLikes;

public interface CommentReplyLikesMapper {

    /**
     * @param commentReplyLikes
     * @return
     */
    CommentReplyLikes selectCommentReplyLikes(CommentReplyLikes commentReplyLikes);

    /**
     * @param commentReplyLikes
     * @return
     */
    int insertCommentReplyLikes(CommentReplyLikes commentReplyLikes);

    /**
     * @param commentReplyLikes
     * @return
     */
    int deleteCommentReplyLikes(CommentReplyLikes commentReplyLikes);
}
