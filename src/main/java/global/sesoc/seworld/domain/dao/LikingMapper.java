package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Liking;

public interface LikingMapper {

	 Liking selectOneLiking(Liking liking);

	 int insertOneLiking(Liking liking);

	 int updateLikingDeleted(Liking liking);

	 int updateLikingInserted(Liking liking);
}
