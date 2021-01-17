package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Exhibition;
import global.sesoc.seworld.domain.dto.Wishing;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class WishingRepository {

    private final SqlSession sqlSession;

    public Wishing selectOneWishing(final Wishing wishing) {
        return sqlSession.getMapper(WishingMapper.class).selectOneWishing(wishing);
    }

    public int insertOneWishing(final Wishing wishing) {
        return sqlSession.getMapper(WishingMapper.class).insertOneWishing(wishing);
    }

    public int updateWishingDeleted(final Wishing wishing) {
        return sqlSession.getMapper(WishingMapper.class).updateWishingDeleted(wishing);
    }

    public int updateWishingInserted(final Wishing wishing) {
        return sqlSession.getMapper(WishingMapper.class).updateWishingInserted(wishing);
    }

    public List<Exhibition> selectAllWishing(final Wishing wishing) {
        return sqlSession.getMapper(WishingMapper.class).selectAllWising(wishing);
    }
}
