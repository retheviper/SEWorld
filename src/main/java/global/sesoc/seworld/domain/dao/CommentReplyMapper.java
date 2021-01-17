package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Comment;
import global.sesoc.seworld.domain.dto.CommentReply;

import java.util.List;

public interface CommentReplyMapper {

    /**
     * 한 코멘트에 대한 모든 댓글을 조회한다.
     *
     * @param exhibitionId
     * @return 코멘트 객체로 조회한 모든 코멘트 댓글 리스트
     */
    List<CommentReply> selectAllCommentReplies(Comment comment);

    /**
     * 코멘트 댓글 ID로 검색하여 한 코멘트 댓글을 조회한다.
     *
     * @param commentReplyId
     * @return 하나의 CommentReply 객체
     */
    CommentReply selectOneCommentReply(String commentReplyId);

    /**
     * 사용자가 새로운 코멘트 댓글을 입력한다.
     *
     * @param commentReply
     * @return 0:입력실패, 1:입력성공
     */
    int insertOneCommentReply(CommentReply commentReply);

    /**
     * 사용자가 입력한 코멘트 댓글을 삭제한다.
     *
     * @param commentReply
     * @return 0:삭제실패, 1:삭제성공
     */
    int deleteOneCommentReply(CommentReply commentReply);

    /**
     * 사용자가 입력한 코멘트 댓글을 수정한다.
     *
     * @param commentReply
     * @return 0:수정실패, 1:수정성공
     */
    int updateOneCommentReply(CommentReply commentReply);
}
