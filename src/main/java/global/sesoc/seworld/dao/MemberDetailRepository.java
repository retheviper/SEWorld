package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.Board;
import global.sesoc.seworld.dto.Comment;
import global.sesoc.seworld.dto.MemberDetail;
import global.sesoc.seworld.dto.Wishing;

@Repository
public class MemberDetailRepository {
	@Autowired
	SqlSession sqlSession;

	public MemberDetail viewMemberDetail(String memberId) {
		MemberDetailMapper memberDetailMapper = sqlSession.getMapper(MemberDetailMapper.class);
		return memberDetailMapper.viewMemberDetail(memberId);
	}

	public List<Wishing> myWishings(String memberId) {
		MemberDetailMapper memberDetailMapper = sqlSession.getMapper(MemberDetailMapper.class);
		return memberDetailMapper.myWishings(memberId);
	}

	public List<Comment> myComments(String memberId) {
		MemberDetailMapper memberDetailMapper = sqlSession.getMapper(MemberDetailMapper.class);
		return memberDetailMapper.myComments(memberId);
	}

	public List<Board> myReviews(String memberId) {
		MemberDetailMapper memberDetailMapper = sqlSession.getMapper(MemberDetailMapper.class);
		return memberDetailMapper.myReviews(memberId);
	}
}
