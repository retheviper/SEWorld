package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.BoardFile;

@Repository
public class BoardFileRepository {
	@Autowired
	SqlSession sqlSession;

	public List<BoardFile> selectAllBoardFiles(String boardId) {
		BoardFileMapper boardFileMapper = sqlSession.getMapper(BoardFileMapper.class);
		return boardFileMapper.selectAllBoardFiles(boardId);
	}

	public BoardFile selectOneBoardFile(String boardFileId) {
		BoardFileMapper boardFileMapper = sqlSession.getMapper(BoardFileMapper.class);
		return boardFileMapper.selectOneBoardFile(boardFileId);
	}
	
	public String getBoardFileIdByBoardId(String boardId) {
		BoardFileMapper boardFileMapper = sqlSession.getMapper(BoardFileMapper.class);
		return boardFileMapper.getBoardFileIdByBoardId(boardId);
	}

	public int insertOneBoardFile(BoardFile boardFile) {
		BoardFileMapper boardFileMapper = sqlSession.getMapper(BoardFileMapper.class);
		return boardFileMapper.insertOneBoardFile(boardFile);
	}

	public int deleteOneBoardFile(String boardFileId) {
		BoardFileMapper boardFileMapper = sqlSession.getMapper(BoardFileMapper.class);
		return boardFileMapper.deleteOneBoardFile(boardFileId);
	}

	public int updateOneBoardFile(BoardFile boardFile) {
		BoardFileMapper boardFileMapper = sqlSession.getMapper(BoardFileMapper.class);
		return boardFileMapper.updateOneBoardFile(boardFile);
	}
}
