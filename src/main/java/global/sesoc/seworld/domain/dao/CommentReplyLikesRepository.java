package global.sesoc.seworld.domain.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.domain.dto.CommentReplyLikes;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CommentReplyLikesRepository {

	private final SqlSession sqlSession;

	public CommentReplyLikes selectCommentReplyLikes(final CommentReplyLikes commentReplyLikes) {
		return sqlSession.getMapper(CommentReplyLikesMapper.class).selectCommentReplyLikes(commentReplyLikes);
	}

	public int insertCommentReplyLikes(final CommentReplyLikes commentReplyLikes) {
		return sqlSession.getMapper(CommentReplyLikesMapper.class).insertCommentReplyLikes(commentReplyLikes);
	}

	public int deleteCommentReplyLikes(final CommentReplyLikes commentReplyLikes) {
		return sqlSession.getMapper(CommentReplyLikesMapper.class).deleteCommentReplyLikes(commentReplyLikes);
	}
}
