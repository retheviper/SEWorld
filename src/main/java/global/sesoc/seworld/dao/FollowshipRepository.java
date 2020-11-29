package global.sesoc.seworld.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.Followship;

@Repository
public class FollowshipRepository {
	@Autowired
	SqlSession sqlSession;

	public Followship selectFollowship(Followship followship) {
		FollowshipMapper followshipMapper = sqlSession.getMapper(FollowshipMapper.class);
		return followshipMapper.selectFollowship(followship);
	}

	public int insertFollowship(Followship followship) {
		FollowshipMapper followshipMapper = sqlSession.getMapper(FollowshipMapper.class);
		return followshipMapper.insertFollowship(followship);
	}

	public int deleteFollowship(Followship followship) {
		FollowshipMapper followshipMapper = sqlSession.getMapper(FollowshipMapper.class);
		return followshipMapper.deleteFollowship(followship);
	}
}
