package global.sesoc.seworld.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.ExbtWLCCount;

@Repository
public class ExbtWLCCountRepository {
	@Autowired
	SqlSession sqlSession;

	public ExbtWLCCount viewCount(String exhibitionId) {
		ExbtWLCCountMapper exhibitionWLCCountMapper = sqlSession.getMapper(ExbtWLCCountMapper.class);
		return exhibitionWLCCountMapper.viewCount(exhibitionId);
	}
}
