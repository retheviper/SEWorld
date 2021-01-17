package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.BoardFile;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardFileRepository {

    private final SqlSession sqlSession;

    public List<BoardFile> selectAllBoardFiles(final String boardId) {
        return sqlSession.getMapper(BoardFileMapper.class).selectAllBoardFiles(boardId);
    }

    public BoardFile selectOneBoardFile(String boardFileId) {
        return sqlSession.getMapper(BoardFileMapper.class).selectOneBoardFile(boardFileId);
    }

    public String getBoardFileIdByBoardId(String boardId) {
        return sqlSession.getMapper(BoardFileMapper.class).getBoardFileIdByBoardId(boardId);
    }

    public int insertOneBoardFile(BoardFile boardFile) {
        return sqlSession.getMapper(BoardFileMapper.class).insertOneBoardFile(boardFile);
    }

    public int deleteOneBoardFile(String boardFileId) {
        return sqlSession.getMapper(BoardFileMapper.class).deleteOneBoardFile(boardFileId);
    }

    public int updateOneBoardFile(BoardFile boardFile) {
        return sqlSession.getMapper(BoardFileMapper.class).updateOneBoardFile(boardFile);
    }
}
