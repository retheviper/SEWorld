package global.sesoc.seworld.domain.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.domain.dto.ExbtWLCCount;

@Repository
@RequiredArgsConstructor
public class ExbtWLCCountRepository {

	private final SqlSession sqlSession;

	public ExbtWLCCount viewCount(final String exhibitionId) {
		return sqlSession.getMapper(ExbtWLCCountMapper.class).viewCount(exhibitionId);
	}
}
