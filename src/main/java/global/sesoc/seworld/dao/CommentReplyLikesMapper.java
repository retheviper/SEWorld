package global.sesoc.seworld.dao;

import global.sesoc.seworld.dto.CommentReplyLikes;

public interface CommentReplyLikesMapper {
	/**
	 * 
	 * @param commentReplyLikes
	 * @return
	 */
	public abstract CommentReplyLikes selectCommentReplyLikes(CommentReplyLikes commentReplyLikes);

	/**
	 * 
	 * @param commentReplyLikes
	 * @return
	 */
	public abstract int insertCommentReplyLikes(CommentReplyLikes commentReplyLikes);

	/**
	 * 
	 * @param commentReplyLikes
	 * @return
	 */
	public abstract int deleteCommentReplyLikes(CommentReplyLikes commentReplyLikes);
}
