package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Exhibition;
import global.sesoc.seworld.domain.dto.Wishing;

import java.util.List;

public interface WishingMapper {

    Wishing selectOneWishing(Wishing wishing);

    int insertOneWishing(Wishing wishing);

    int updateWishingDeleted(Wishing wishing);

    int updateWishingInserted(Wishing wishing);

    List<Exhibition> selectAllWising(Wishing wishing);
}
