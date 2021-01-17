package global.sesoc.seworld.domain.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.domain.dto.Followship;

@Repository
@RequiredArgsConstructor
public class FollowshipRepository {

	private final SqlSession sqlSession;

	public Followship selectFollowship(final Followship followship) {
		return sqlSession.getMapper(FollowshipMapper.class).selectFollowship(followship);
	}

	public int insertFollowship(final Followship followship) {
		return sqlSession.getMapper(FollowshipMapper.class).insertFollowship(followship);
	}

	public int deleteFollowship(final Followship followship) {
		return sqlSession.getMapper(FollowshipMapper.class).deleteFollowship(followship);
	}
}
