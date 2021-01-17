package global.sesoc.seworld.domain.dao;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.domain.dto.Board;
import global.sesoc.seworld.domain.dto.Comment;
import global.sesoc.seworld.domain.dto.MemberDetail;
import global.sesoc.seworld.domain.dto.Wishing;

@Repository
@RequiredArgsConstructor
public class MemberDetailRepository {

	private final SqlSession sqlSession;

	public MemberDetail viewMemberDetail(final String memberId) {
		return sqlSession.getMapper(MemberDetailMapper.class).viewMemberDetail(memberId);
	}

	public List<Wishing> myWishings(final String memberId) {
		return sqlSession.getMapper(MemberDetailMapper.class).myWishings(memberId);
	}

	public List<Comment> myComments(final String memberId) {
		return sqlSession.getMapper(MemberDetailMapper.class).myComments(memberId);
	}

	public List<Board> myReviews(final String memberId) {
		return sqlSession.getMapper(MemberDetailMapper.class).myReviews(memberId);
	}
}
