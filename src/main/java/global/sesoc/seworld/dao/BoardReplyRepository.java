package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.BoardReply;

@Repository
public class BoardReplyRepository {
	@Autowired
	SqlSession sqlSession;

	public List<BoardReply> selectAllBoardReplies(String boardId) {
		BoardReplyMapper boardReplyMapper = sqlSession.getMapper(BoardReplyMapper.class);
		return boardReplyMapper.selectAllBoardReplies(boardId);
	}

	public BoardReply selectOneBoardReply(String boardReplyId) {
		BoardReplyMapper boardReplyMapper = sqlSession.getMapper(BoardReplyMapper.class);
		return boardReplyMapper.selectOneBoardReply(boardReplyId);
	}

	public int insertOneBoardReply(BoardReply boardReply) {
		BoardReplyMapper boardReplyMapper = sqlSession.getMapper(BoardReplyMapper.class);
		return boardReplyMapper.insertOneBoardReply(boardReply);
	}

	public int deleteOneBoardReply(BoardReply boardReply) {
		BoardReplyMapper boardReplyMapper = sqlSession.getMapper(BoardReplyMapper.class);
		return boardReplyMapper.deleteOneBoardReply(boardReply);
	}

	public int updateOneBoardReply(BoardReply boardReply) {
		BoardReplyMapper boardReplyMapper = sqlSession.getMapper(BoardReplyMapper.class);
		return boardReplyMapper.updateOneBoardReply(boardReply);
	}

	public String getBoardReplyId(String boardId) {
		BoardReplyMapper boardReplyMapper = sqlSession.getMapper(BoardReplyMapper.class);
		return boardReplyMapper.getBoardReplyId(boardId);
	}
	
	public List<BoardReply> getBoardRepliesList(){
		BoardReplyMapper boardReplyMapper = sqlSession.getMapper(BoardReplyMapper.class);
		return boardReplyMapper.getBoardRepliesList();
	}
	
	public List<BoardReply> boardReplyOfOneboard(String boardId){
		BoardReplyMapper boardReplyMapper = sqlSession.getMapper(BoardReplyMapper.class);
		return boardReplyMapper.boardReplyOfOneboard(boardId);
	}
	
	public int countBoardReply(String boardId) {
		BoardReplyMapper boardReplyMapper = sqlSession.getMapper(BoardReplyMapper.class);
		return boardReplyMapper.countBoardReply(boardId);
	}
	
}
