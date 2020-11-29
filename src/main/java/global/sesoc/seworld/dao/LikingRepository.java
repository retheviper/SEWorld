package global.sesoc.seworld.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.Liking;

@Repository
public class LikingRepository {
	@Autowired
	SqlSession sqlSession;

	public Liking selectOneLiking(Liking liking) {
		LikingMapper likingMapper = sqlSession.getMapper(LikingMapper.class);
		return likingMapper.selectOneLiking(liking);
	}

	public int insertOneLiking(Liking liking) {
		LikingMapper likingMapper = sqlSession.getMapper(LikingMapper.class);
		return likingMapper.insertOneLiking(liking);
	}

	public int updateLikingDeleted(Liking liking) {
		LikingMapper likingMapper = sqlSession.getMapper(LikingMapper.class);
		return likingMapper.updateLikingDeleted(liking);
	}

	public int updateLikingInserted(Liking liking) {
		LikingMapper likingMapper = sqlSession.getMapper(LikingMapper.class);
		return likingMapper.updateLikingInserted(liking);
	}
}
