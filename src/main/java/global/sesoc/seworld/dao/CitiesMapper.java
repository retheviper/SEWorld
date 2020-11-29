package global.sesoc.seworld.dao;

import java.util.List;

import global.sesoc.seworld.dto.Cities;

public interface CitiesMapper {
	/**
	 * 등록된 모든 도시정보를 가져온다.
	 * 
	 * @return 모든 Cities 리스트
	 */
	public abstract List<Cities> selectAllCities();

	/**
	 * 도시이름을 검색해 도시정보를 조회한다.
	 * 
	 * @param cityName
	 * @return 하나의 Cities 객체
	 */
	public abstract Cities selectOneCity(String cityName);
}
