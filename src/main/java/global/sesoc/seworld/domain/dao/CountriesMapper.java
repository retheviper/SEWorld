package global.sesoc.seworld.domain.dao;

import java.util.List;

import global.sesoc.seworld.domain.dto.Countries;

public interface CountriesMapper {

	/**
	 * 등록된 모든 국가정보를 가져온다.
	 * 
	 * @return 모든 Countries 리스트
	 */
	List<Countries> selectAllCountries();

	/**
	 * 국가이름을 검색해 국가정보를 조회한다.
	 * 
	 * @param countryName
	 * @return 하나의 Countries 객체
	 */
	Countries selectOneCountry(String countryName);
}
