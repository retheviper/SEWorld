package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.Counting;
import global.sesoc.seworld.dto.Exhibition;

@Repository
public class ExhibitionRepository {

	@Autowired
	SqlSession sqlSession;

	public int getTotalList(String searchItem) {
		ExhibitionMapper mapper = sqlSession.getMapper(ExhibitionMapper.class);
		int result = mapper.getTotalList(searchItem);
		return result;
	}

	public List<String> getTotalCountry() {
		ExhibitionMapper mapper = sqlSession.getMapper(ExhibitionMapper.class);
		return mapper.getTotalCountry();
	}

	public Exhibition showExhibitionDetail(String exhibitionId) {
		ExhibitionMapper mapper = sqlSession.getMapper(ExhibitionMapper.class);
		Exhibition result = mapper.showExhibitionDetail(exhibitionId);
		return result;
	}

	public int countCountry(String openingCountry) {
		ExhibitionMapper mapper = sqlSession.getMapper(ExhibitionMapper.class);
		int result = mapper.countCountry(openingCountry);
		return result;
	}

	public List<Exhibition> showExhibitionList(int iDisplayStart, int iDisplayLength, String searchText) {
		ExhibitionMapper mapper = sqlSession.getMapper(ExhibitionMapper.class);
		RowBounds rb = new RowBounds(iDisplayStart, iDisplayLength);
		List<Exhibition> result = mapper.showExhibitionList(searchText, rb);
		return result;
	}

	public List<Exhibition> getListForMap() {
		ExhibitionMapper mapper = sqlSession.getMapper(ExhibitionMapper.class);
		return mapper.getListForMap();
	}
	
	public List<Exhibition> getRecentExhibition(){
		ExhibitionMapper mapper = sqlSession.getMapper(ExhibitionMapper.class);
		return mapper.getRecentExhibition();
	}
	/**지도에 띄우기**/
	public List<Counting> countAllExhibition (){
		ExhibitionMapper mapper = sqlSession.getMapper(ExhibitionMapper.class);
		return mapper.countAllExhibition();
		
	}
}
