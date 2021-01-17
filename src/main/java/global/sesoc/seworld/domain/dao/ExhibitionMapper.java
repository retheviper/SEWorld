package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Counting;
import global.sesoc.seworld.domain.dto.Exhibition;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

interface ExhibitionMapper {

    int getTotalList(String searchItem);

    Exhibition showExhibitionDetail(String exhibitionId);

    int countCountry(String openingCountry);

    List<Counting> countAllExhibition();

    List<Exhibition> showExhibitionList(String searchText, RowBounds rb);

    List<String> getTotalCountry();

    List<Exhibition> getListForMap();

    List<Exhibition> getRecentExhibition();
}
