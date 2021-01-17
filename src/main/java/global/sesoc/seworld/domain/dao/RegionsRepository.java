package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Regions;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RegionsRepository {

    private final SqlSession sqlSession;

    public List<Regions> selectAllRegions() {
        return sqlSession.getMapper(RegionsMapper.class).selectAllRegions();
    }

    public Regions selectOneRegion(final String regionName) {
        return sqlSession.getMapper(RegionsMapper.class).selectOneRegion(regionName);
    }
}
