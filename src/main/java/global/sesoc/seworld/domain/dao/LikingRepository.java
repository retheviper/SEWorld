package global.sesoc.seworld.domain.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.domain.dto.Liking;

@Repository
@RequiredArgsConstructor
public class LikingRepository {

	private final SqlSession sqlSession;

	public Liking selectOneLiking(final Liking liking) {
		return sqlSession.getMapper(LikingMapper.class).selectOneLiking(liking);
	}

	public int insertOneLiking(final Liking liking) {
		return sqlSession.getMapper(LikingMapper.class).insertOneLiking(liking);
	}

	public int updateLikingDeleted(final Liking liking) {
		return sqlSession.getMapper(LikingMapper.class).updateLikingDeleted(liking);
	}

	public int updateLikingInserted(final Liking liking) {
		return sqlSession.getMapper(LikingMapper.class).updateLikingInserted(liking);
	}
}
