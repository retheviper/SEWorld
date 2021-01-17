package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Board;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final SqlSession sqlSession;

    public int getTotalList() {
        return sqlSession.getMapper(BoardMapper.class).getTotalList();
    }

    public List<Board> viewAllReviews(final int start, final int length, final String searchText) {
        return sqlSession.getMapper(BoardMapper.class).viewAllReviews(searchText, new RowBounds(start, length));
    }

    public List<Board> viewAllQuestions(final int start, final int length, final String searchText) {
        return sqlSession.getMapper(BoardMapper.class).viewAllQuestions(searchText, new RowBounds(start, length));
    }

    public List<Board> getRecentReviews() {
        return sqlSession.getMapper(BoardMapper.class).getRecentReviews();
    }

    public List<Board> getAuthosRecentReviews(final String author) {
        return sqlSession.getMapper(BoardMapper.class).getAuthorsRecentReviews(author);
    }

    public Board viewBoardDetail(final String boardId) {
        return sqlSession.getMapper(BoardMapper.class).viewBoardDetail(boardId);
    }

    public String getBoardId(final String memberId) {
        return sqlSession.getMapper(BoardMapper.class).getBoardId(memberId);
    }

    public int insertBoard(final Board board) {
        return sqlSession.getMapper(BoardMapper.class).insertBoard(board);
    }

    public int updateBoard(final Board board) {
        return sqlSession.getMapper(BoardMapper.class).updateBoard(board);
    }

    public int deleteBoard(final String boardId) {
        return sqlSession.getMapper(BoardMapper.class).deleteBoard(boardId);
    }
}
