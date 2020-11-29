package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.Timeline;

@Repository
public class TimelineRepository {
	@Autowired
	SqlSession sqlSession;

	public List<Timeline> myTimeline(String memberId) {
		TimelineMapper timelineMapper = sqlSession.getMapper(TimelineMapper.class);
		return timelineMapper.myTimeline(memberId);
	}

	public List<Timeline> myWishing(String memberId) {
		TimelineMapper timelineMapper = sqlSession.getMapper(TimelineMapper.class);
		return timelineMapper.myWishing(memberId);
	}

	public List<Timeline> myComment(String memberId) {
		TimelineMapper timelineMapper = sqlSession.getMapper(TimelineMapper.class);
		return timelineMapper.myComment(memberId);
	}

	public List<Timeline> myReview(String memberId) {
		TimelineMapper timelineMapper = sqlSession.getMapper(TimelineMapper.class);
		return timelineMapper.myReview(memberId);
	}
}
