package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.ExhibitionDetail;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ExhibitionDetailRepository {

    private final SqlSession sqlSession;

    public ExhibitionDetail viewExhibitionDetail(final ExhibitionDetail exbtDetail) {
        return sqlSession.getMapper(ExhibitionDetailMapper.class).viewExhibitionDetail(exbtDetail);
    }
}
