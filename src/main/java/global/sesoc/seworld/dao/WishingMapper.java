package global.sesoc.seworld.dao;

import java.util.List;

import global.sesoc.seworld.dto.Exhibition;
import global.sesoc.seworld.dto.Wishing;

public interface WishingMapper {
	public abstract Wishing selectOneWishing(Wishing wishing);

	public abstract int insertOneWishing(Wishing wishing);

	public abstract int updateWishingDeleted(Wishing wishing);

	public abstract int updateWishingInserted(Wishing wishing);

	public abstract List<Exhibition> selectAllWising(Wishing wishing);
}
