package global.sesoc.seworld.domain.dao;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.domain.dto.Timeline;

@Repository
@RequiredArgsConstructor
public class TimelineRepository {

	private final SqlSession sqlSession;

	public List<Timeline> myTimeline(final String memberId) {
		return sqlSession.getMapper(TimelineMapper.class).myTimeline(memberId);
	}

	public List<Timeline> myWishing(final String memberId) {
		return sqlSession.getMapper(TimelineMapper.class).myWishing(memberId);
	}

	public List<Timeline> myComment(final String memberId) {
		return sqlSession.getMapper(TimelineMapper.class).myComment(memberId);
	}

	public List<Timeline> myReview(final String memberId) {
		return sqlSession.getMapper(TimelineMapper.class).myReview(memberId);
	}
}
