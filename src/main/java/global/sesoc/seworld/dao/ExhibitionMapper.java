package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import global.sesoc.seworld.dto.Counting;
import global.sesoc.seworld.dto.Exhibition;

public interface ExhibitionMapper {

	public int getTotalList(String searchItem);

	public Exhibition showExhibitionDetail(String exhibitionId);
	
	public int countCountry (String openingCountry) ;
	
	public List<Counting> countAllExhibition ();

	public List<Exhibition> showExhibitionList(String searchText, RowBounds rb);

	public List<String> getTotalCountry();

	public List<Exhibition> getListForMap();
	
	public List<Exhibition> getRecentExhibition();
}
