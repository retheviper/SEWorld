package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Cities;

import java.util.List;

public interface CitiesMapper {

    /**
     * 등록된 모든 도시정보를 가져온다.
     *
     * @return 모든 Cities 리스트
     */
    List<Cities> selectAllCities();

    /**
     * 도시이름을 검색해 도시정보를 조회한다.
     *
     * @param cityName
     * @return 하나의 Cities 객체
     */
    Cities selectOneCity(String cityName);
}
