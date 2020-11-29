package global.sesoc.seworld.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.dto.CommentLikes;

public class CommentLikesRepository {
	@Autowired
	SqlSession sqlSession;

	public CommentLikes selectCommentLikes(CommentLikes commentLikes) {
		CommentLikesMapper commentLikesMapper = sqlSession.getMapper(CommentLikesMapper.class);
		return commentLikesMapper.selectCommentLikes(commentLikes);
	}

	public int insertCommentLikes(CommentLikes commentLikes) {
		CommentLikesMapper commentLikesMapper = sqlSession.getMapper(CommentLikesMapper.class);
		return commentLikesMapper.insertCommentLikes(commentLikes);
	}

	public int deleteCommentLikes(CommentLikes commentLikes) {
		CommentLikesMapper commentLikesMapper = sqlSession.getMapper(CommentLikesMapper.class);
		return commentLikesMapper.deleteCommentLikes(commentLikes);
	}
}
