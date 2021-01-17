package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Counting;
import global.sesoc.seworld.domain.dto.Exhibition;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ExhibitionRepository {

    private final SqlSession sqlSession;

    public int getTotalList(final String searchItem) {
        return sqlSession.getMapper(ExhibitionMapper.class).getTotalList(searchItem);
    }

    public List<String> getTotalCountry() {
        return sqlSession.getMapper(ExhibitionMapper.class).getTotalCountry();
    }

    public Exhibition showExhibitionDetail(final String exhibitionId) {
		return sqlSession.getMapper(ExhibitionMapper.class).showExhibitionDetail(exhibitionId);
    }

    public int countCountry(final String openingCountry) {
        return sqlSession.getMapper(ExhibitionMapper.class).countCountry(openingCountry);
    }

    public List<Exhibition> showExhibitionList(final int iDisplayStart, final int iDisplayLength, final String searchText) {
        return sqlSession.getMapper(ExhibitionMapper.class).showExhibitionList(searchText, new RowBounds(iDisplayStart, iDisplayLength));
    }

    public List<Exhibition> getListForMap() {
        return sqlSession.getMapper(ExhibitionMapper.class).getListForMap();
    }

    public List<Exhibition> getRecentExhibition() {
        return sqlSession.getMapper(ExhibitionMapper.class).getRecentExhibition();
    }

    /**
     * 지도에 띄우기
     **/
    public List<Counting> countAllExhibition() {
        return sqlSession.getMapper(ExhibitionMapper.class).countAllExhibition();

    }
}
