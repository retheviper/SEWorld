package global.sesoc.seworld.dao;

import java.util.List;

import global.sesoc.seworld.dto.Comment;

public interface CommentMapper {
	public abstract List<Comment> selectAllCommentsFromExhibition(String exhibitionId);

	public abstract Comment selectOneComment(Comment comment);

	public abstract int insertComment(Comment comment);

	public abstract int deleteComment(Comment comment);

	public abstract int updateComment(Comment comment);
}
