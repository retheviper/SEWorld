package global.sesoc.seworld.domain.dao;

import java.util.List;

import global.sesoc.seworld.domain.dto.Board;
import global.sesoc.seworld.domain.dto.Comment;
import global.sesoc.seworld.domain.dto.MemberDetail;
import global.sesoc.seworld.domain.dto.Wishing;

public interface MemberDetailMapper {

	 MemberDetail viewMemberDetail(String memberId);

	 List<Wishing> myWishings(String memberId);

	 List<Comment> myComments(String memberId);

	 List<Board> myReviews(String memberId);
}
