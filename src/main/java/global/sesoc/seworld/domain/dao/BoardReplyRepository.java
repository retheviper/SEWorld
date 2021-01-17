package global.sesoc.seworld.domain.dao;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.domain.dto.BoardReply;

@Repository
@RequiredArgsConstructor
public class BoardReplyRepository {

	private final SqlSession sqlSession;

	public List<BoardReply> selectAllBoardReplies(final String boardId) {
		return sqlSession.getMapper(BoardReplyMapper.class).selectAllBoardReplies(boardId);
	}

	public BoardReply selectOneBoardReply(final String boardReplyId) {
		return sqlSession.getMapper(BoardReplyMapper.class).selectOneBoardReply(boardReplyId);
	}

	public int insertOneBoardReply(final BoardReply boardReply) {
		return sqlSession.getMapper(BoardReplyMapper.class).insertOneBoardReply(boardReply);
	}

	public int deleteOneBoardReply(final BoardReply boardReply) {
		return sqlSession.getMapper(BoardReplyMapper.class).deleteOneBoardReply(boardReply);
	}

	public int updateOneBoardReply(final BoardReply boardReply) {
		return sqlSession.getMapper(BoardReplyMapper.class).updateOneBoardReply(boardReply);
	}

	public String getBoardReplyId(final String boardId) {
		return sqlSession.getMapper(BoardReplyMapper.class).getBoardReplyId(boardId);
	}

	public List<BoardReply> getBoardRepliesList(){
		return sqlSession.getMapper(BoardReplyMapper.class).getBoardRepliesList();
	}

	public List<BoardReply> boardReplyOfOneboard(final String boardId){
		return sqlSession.getMapper(BoardReplyMapper.class).boardReplyOfOneboard(boardId);
	}

	public int countBoardReply(final String boardId) {
		return sqlSession.getMapper(BoardReplyMapper.class).countBoardReply(boardId);
	}
	
}
