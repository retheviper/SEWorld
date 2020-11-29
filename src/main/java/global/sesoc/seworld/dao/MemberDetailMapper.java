package global.sesoc.seworld.dao;

import java.util.List;

import global.sesoc.seworld.dto.Board;
import global.sesoc.seworld.dto.Comment;
import global.sesoc.seworld.dto.MemberDetail;
import global.sesoc.seworld.dto.Wishing;

public interface MemberDetailMapper {
	public abstract MemberDetail viewMemberDetail(String memberId);

	public abstract List<Wishing> myWishings(String memberId);

	public abstract List<Comment> myComments(String memberId);

	public abstract List<Board> myReviews(String memberId);
}
