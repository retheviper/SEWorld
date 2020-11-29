package global.sesoc.seworld.dao;

import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.Board;

@Repository
public class BoardRepository {
	@Autowired
	SqlSession sqlSession;

	public int getTotalList() {
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		int result = boardMapper.getTotalList();
		return result;
	}

	public List<Board> viewAllReviews(int start, int length, String searchText) {
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		RowBounds rb = new RowBounds(start, length);
		List<Board> result = boardMapper.viewAllReviews(searchText, rb);
		return result;
	}

	public List<Board> viewAllQuestions(int start, int length, String searchText) {
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		RowBounds rb = new RowBounds(start, length);
		List<Board> result = boardMapper.viewAllQuestions(searchText, rb);
		return result;
	}

	public List<Board> getRecentReviews() {
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		List<Board> result = boardMapper.getRecentReviews();
		return result;
	}
	
	public List<Board> getAuthosRecentReviews(String author){
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		List<Board> result = boardMapper.getAuthorsRecentReviews(author);
		return result;
	}

	public Board viewBoardDetail(String boardId) {
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		Board result = boardMapper.viewBoardDetail(boardId);
		return result;
	}

	public String getBoardId(String memberId) {
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		String result = boardMapper.getBoardId(memberId);
		return result;
	}

	public int insertBoard(Board board) {
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.insertBoard(board);
	}

	public int updateBoard(Board board) {
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.updateBoard(board);
	}

	public int deleteBoard(String boardId) {
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.deleteBoard(boardId);
	}
}
