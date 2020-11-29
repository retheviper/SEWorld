package global.sesoc.seworld.dao;

import global.sesoc.seworld.dto.Followship;

public interface FollowshipMapper {
	public abstract Followship selectFollowship(Followship followship);

	public abstract int insertFollowship(Followship followship);

	public abstract int deleteFollowship(Followship followship);
}
