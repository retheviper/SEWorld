package global.sesoc.seworld.domain.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.domain.dto.CommentLikes;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CommentLikesRepository {

	private final SqlSession sqlSession;

	public CommentLikes selectCommentLikes(final CommentLikes commentLikes) {
		return sqlSession.getMapper(CommentLikesMapper.class).selectCommentLikes(commentLikes);
	}

	public int insertCommentLikes(final CommentLikes commentLikes) {
		return sqlSession.getMapper(CommentLikesMapper.class).insertCommentLikes(commentLikes);
	}

	public int deleteCommentLikes(final CommentLikes commentLikes) {
		return sqlSession.getMapper(CommentLikesMapper.class).deleteCommentLikes(commentLikes);
	}
}
