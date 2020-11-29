package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.dto.Regions;

public class RegionsRepository {
	@Autowired
	SqlSession sqlSession;

	public List<Regions> selectAllRegions() {
		RegionsMapper regionsMapper = sqlSession.getMapper(RegionsMapper.class);
		return regionsMapper.selectAllRegions();
	}

	public Regions selectOneRegion(String regionName) {
		RegionsMapper regionsMapper = sqlSession.getMapper(RegionsMapper.class);
		return regionsMapper.selectOneRegion(regionName);
	}
}
