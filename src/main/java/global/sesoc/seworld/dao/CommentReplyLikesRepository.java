package global.sesoc.seworld.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.dto.CommentReplyLikes;

public class CommentReplyLikesRepository {
	@Autowired
	SqlSession sqlSession;

	public CommentReplyLikes selectCommentReplyLikes(CommentReplyLikes commentReplyLikes) {
		CommentReplyLikesMapper commentReplyLikesMapper = sqlSession.getMapper(CommentReplyLikesMapper.class);
		return commentReplyLikesMapper.selectCommentReplyLikes(commentReplyLikes);
	}

	public int insertCommentReplyLikes(CommentReplyLikes commentReplyLikes) {
		CommentReplyLikesMapper commentReplyLikesMapper = sqlSession.getMapper(CommentReplyLikesMapper.class);
		return commentReplyLikesMapper.insertCommentReplyLikes(commentReplyLikes);
	}

	public int deleteCommentReplyLikes(CommentReplyLikes commentReplyLikes) {
		CommentReplyLikesMapper commentReplyLikesMapper = sqlSession.getMapper(CommentReplyLikesMapper.class);
		return commentReplyLikesMapper.deleteCommentReplyLikes(commentReplyLikes);
	}
}
