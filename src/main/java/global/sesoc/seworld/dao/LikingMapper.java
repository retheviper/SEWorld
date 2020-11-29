package global.sesoc.seworld.dao;

import global.sesoc.seworld.dto.Liking;

public interface LikingMapper {
	public abstract Liking selectOneLiking(Liking liking);

	public abstract int insertOneLiking(Liking liking);

	public abstract int updateLikingDeleted(Liking liking);

	public abstract int updateLikingInserted(Liking liking);
}
