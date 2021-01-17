package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.BoardFile;

import java.util.List;

public interface BoardFileMapper {

    /**
     * 게시글에 첨부된 모든 파일을 가져온다.
     *
     * @param boardId
     * @return 게시글 ID로 조회한 모든 파일 리스트
     */
    List<BoardFile> selectAllBoardFiles(String boardId);

    /**
     * 게시글 첨부파일 ID로 검색해 하나의 파일을 조회한다.
     *
     * @param boardFileId
     * @return 하나의 BoardFile 객체
     */
    BoardFile selectOneBoardFile(String boardFileId);

    /**
     * 게시글에 사용자가 새로운 파일을 첨부한다.
     *
     * @param boardId
     * @return 0:입력실패, 1:입력성공
     */

    public String getBoardFileIdByBoardId(String boardId);

    int insertOneBoardFile(BoardFile boardFile);

    /**
     * 게시글 첨부파일 ID로 검색해 사용자가 첨부한 파일을 삭제한다.
     *
     * @param boardFileId
     * @return 0:삭제실패, 1:삭제성공
     */
    int deleteOneBoardFile(String boardFileId);

    /**
     * 게시글에 사용자가 첨부한 파일을 수정한다.
     *
     * @param boardFile
     * @return 0:수정실패, 1:수정성공
     */
    int updateOneBoardFile(BoardFile boardFile);
}
