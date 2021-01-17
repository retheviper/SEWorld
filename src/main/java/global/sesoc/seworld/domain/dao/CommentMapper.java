package global.sesoc.seworld.domain.dao;

import java.util.List;

import global.sesoc.seworld.domain.dto.Comment;

public interface CommentMapper {

	 List<Comment> selectAllCommentsFromExhibition(String exhibitionId);

	 Comment selectOneComment(Comment comment);

	 int insertComment(Comment comment);

	 int deleteComment(Comment comment);

	 int updateComment(Comment comment);
}
