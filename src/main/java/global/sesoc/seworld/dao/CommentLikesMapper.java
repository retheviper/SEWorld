package global.sesoc.seworld.dao;

import global.sesoc.seworld.dto.CommentLikes;

public interface CommentLikesMapper {
	/**
	 * 
	 * @param commentLikes
	 * @return
	 */
	public abstract CommentLikes selectCommentLikes(CommentLikes commentLikes);

	/**
	 * 
	 * @param commentLikes
	 * @return
	 */
	public abstract int insertCommentLikes(CommentLikes commentLikes);

	/**
	 * 
	 * @param commentLikes
	 * @return
	 */
	public abstract int deleteCommentLikes(CommentLikes commentLikes);
}
