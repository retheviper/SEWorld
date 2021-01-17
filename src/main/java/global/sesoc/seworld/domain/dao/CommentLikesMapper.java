package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.CommentLikes;

public interface CommentLikesMapper {

	/**
	 * 
	 * @param commentLikes
	 * @return
	 */
	 CommentLikes selectCommentLikes(CommentLikes commentLikes);

	/**
	 * 
	 * @param commentLikes
	 * @return
	 */
	 int insertCommentLikes(CommentLikes commentLikes);

	/**
	 * 
	 * @param commentLikes
	 * @return
	 */
	 int deleteCommentLikes(CommentLikes commentLikes);
}
