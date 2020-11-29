package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import global.sesoc.seworld.dto.Board;

public interface BoardMapper {

	public int getTotalList();

	public List<String> getTotalCountry();

	public List<Board> viewAllReviews(String searchText, RowBounds rb);

	public List<Board> viewAllQuestions(String searchText, RowBounds rb);

	public List<Board> getRecentReviews();
	
	public List<Board> getAuthorsRecentReviews(String Author);

	public Board viewBoardDetail(String boardId);

	public String getBoardId(String memberId);

	public int insertBoard(Board board);

	public int updateBoard(Board board);

	public int deleteBoard(String boardId);

}
