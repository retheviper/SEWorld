package global.sesoc.seworld.domain.dao;

import java.util.List;

import global.sesoc.seworld.domain.dto.Regions;

public interface RegionsMapper {

	/**
	 * 등록된 모든 대륙정보를 가져온다.
	 * 
	 * @return 모든 Regions 리스트
	 */
	 List<Regions> selectAllRegions();

	/**
	 * 대륙이름을 검색해 대륙정보를 조회한다.
	 * 
	 * @param regionsName
	 * @return 하나의 Regions 리스트
	 */
	 Regions selectOneRegion(String regionName);
}
