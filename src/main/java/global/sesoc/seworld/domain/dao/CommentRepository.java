package global.sesoc.seworld.domain.dao;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.domain.dto.Comment;

@Repository
@RequiredArgsConstructor
public class CommentRepository {

	private final SqlSession sqlSession;

	public List<Comment> selectAllCommentsFromExhibition(final String exhibitionId) {
		return sqlSession.getMapper(CommentMapper.class).selectAllCommentsFromExhibition(exhibitionId);
	}

	public Comment selectOneComment(final Comment comment) {
		return sqlSession.getMapper(CommentMapper.class).selectOneComment(comment);
	}

	public int insertComment(final Comment comment) {
		return sqlSession.getMapper(CommentMapper.class).insertComment(comment);
	}

	public int deleteComment(final Comment comment) {
		return sqlSession.getMapper(CommentMapper.class).deleteComment(comment);
	}

	public int updateComment(final Comment comment) {
		return sqlSession.getMapper(CommentMapper.class).updateComment(comment);
	}
}
