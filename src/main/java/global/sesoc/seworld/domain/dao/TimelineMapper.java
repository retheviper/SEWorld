package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Timeline;

import java.util.List;

public interface TimelineMapper {

    List<Timeline> myTimeline(String memberId);

    List<Timeline> myWishing(String memberId);

    List<Timeline> myComment(String memberId);

    List<Timeline> myReview(String memberId);
}
