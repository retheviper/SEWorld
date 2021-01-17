package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Board;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface BoardMapper {

    int getTotalList();

    List<String> getTotalCountry();

    List<Board> viewAllReviews(String searchText, RowBounds rb);

    List<Board> viewAllQuestions(String searchText, RowBounds rb);

    List<Board> getRecentReviews();

    List<Board> getAuthorsRecentReviews(String Author);

    Board viewBoardDetail(String boardId);

    String getBoardId(String memberId);

    int insertBoard(Board board);

    int updateBoard(Board board);

    int deleteBoard(String boardId);

}
