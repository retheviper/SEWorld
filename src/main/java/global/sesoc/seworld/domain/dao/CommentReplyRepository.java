package global.sesoc.seworld.domain.dao;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.domain.dto.Comment;
import global.sesoc.seworld.domain.dto.CommentReply;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CommentReplyRepository {

	private final SqlSession sqlSession;

	public List<CommentReply> selectAllCommentReplies(final Comment comment) {
		return sqlSession.getMapper(CommentReplyMapper.class).selectAllCommentReplies(comment);
	}

	public CommentReply selectOneCommentReply(final String commentReplyId) {
		return sqlSession.getMapper(CommentReplyMapper.class).selectOneCommentReply(commentReplyId);
	}

	public int insertOneCommentReply(final CommentReply commentReply) {
		return sqlSession.getMapper(CommentReplyMapper.class).insertOneCommentReply(commentReply);
	}

	public int deleteOneCommentReply(final CommentReply commentReply) {
		return sqlSession.getMapper(CommentReplyMapper.class).deleteOneCommentReply(commentReply);
	}

	public int updateOneCommentReply(final CommentReply commentReply) {
		return sqlSession.getMapper(CommentReplyMapper.class).updateOneCommentReply(commentReply);
	}
}
