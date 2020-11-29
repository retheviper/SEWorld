package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.dto.Cities;

public class CitiesRepository {
	@Autowired
	SqlSession sqlSession;

	public List<Cities> selectAllCities() {
		CitiesMapper citiesMapper = sqlSession.getMapper(CitiesMapper.class);
		return citiesMapper.selectAllCities();
	}

	public Cities selectOneCity(String cityName) {
		CitiesMapper citiesMapper = sqlSession.getMapper(CitiesMapper.class);
		return citiesMapper.selectOneCity(cityName);
	}
}
