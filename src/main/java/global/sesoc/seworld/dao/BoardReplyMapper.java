package global.sesoc.seworld.dao;

import java.util.List;

import global.sesoc.seworld.dto.BoardReply;

public interface BoardReplyMapper {
	/**
	 * 한 게시글에 대한 모든 댓글을 가져온다.
	 * 
	 * @param boardId
	 * @return 게시글 ID로 조회한 모든 댓글 리스트
	 */
	public abstract List<BoardReply> selectAllBoardReplies(String boardId);

	/**
	 * 게시글 댓글 ID로 검색해 하나의 댓글을 조회한다.
	 * 
	 * @param boardReplyId
	 * @return 하나의 BoardReply 객체
	 */
	public abstract BoardReply selectOneBoardReply(String boardReplyId);

	/**
	 * 게시글에 사용자가 새로운 댓글을 입력한다.
	 * 
	 * @param boardReply
	 * @return 0:입력실패, 1:입력성공
	 */
	public abstract int insertOneBoardReply(BoardReply boardReply);

	/**
	 * 게시글에 사용자가 입력한 댓글을 삭제한다.
	 * 
	 * @param boardReply
	 * @return 0:삭제실패, 1:삭제성공
	 */
	public abstract int deleteOneBoardReply(BoardReply boardReply);

	/**
	 * 게시글에 사용자가 입력한 댓글을 수정한다.
	 * 
	 * @param boardReply
	 * @return 0:수정실패, 1:수정성공
	 */
	public abstract int updateOneBoardReply(BoardReply boardReply);

	public abstract String getBoardReplyId(String boardId);

	public abstract List<BoardReply> getBoardRepliesList();
	
	
	public abstract List<BoardReply> boardReplyOfOneboard(String boardId);
	public abstract int countBoardReply(String boardId);
}
