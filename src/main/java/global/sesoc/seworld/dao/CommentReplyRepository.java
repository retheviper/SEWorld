package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.dto.Comment;
import global.sesoc.seworld.dto.CommentReply;

public class CommentReplyRepository {
	@Autowired
	SqlSession sqlSession;

	public List<CommentReply> selectAllCommentReplies(Comment comment) {
		CommentReplyMapper commentReplyMapper = sqlSession.getMapper(CommentReplyMapper.class);
		return commentReplyMapper.selectAllCommentReplies(comment);
	}

	public CommentReply selectOneCommentReply(String commentReplyId) {
		CommentReplyMapper commentReplyMapper = sqlSession.getMapper(CommentReplyMapper.class);
		return commentReplyMapper.selectOneCommentReply(commentReplyId);
	}

	public int insertOneCommentReply(CommentReply commentReply) {
		CommentReplyMapper commentReplyMapper = sqlSession.getMapper(CommentReplyMapper.class);
		return commentReplyMapper.insertOneCommentReply(commentReply);
	}

	public int deleteOneCommentReply(CommentReply commentReply) {
		CommentReplyMapper commentReplyMapper = sqlSession.getMapper(CommentReplyMapper.class);
		return commentReplyMapper.deleteOneCommentReply(commentReply);
	}

	public int updateOneCommentReply(CommentReply commentReply) {
		CommentReplyMapper commentReplyMapper = sqlSession.getMapper(CommentReplyMapper.class);
		return commentReplyMapper.updateOneCommentReply(commentReply);
	}
}
