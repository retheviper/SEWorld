package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Followship;

public interface FollowshipMapper {

	 Followship selectFollowship(Followship followship);

	 int insertFollowship(Followship followship);

	 int deleteFollowship(Followship followship);
}
