package global.sesoc.seworld.domain.dao;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.domain.dto.Cities;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CitiesRepository {

	private final SqlSession sqlSession;

	public List<Cities> selectAllCities() {
		return sqlSession.getMapper(CitiesMapper.class).selectAllCities();
	}

	public Cities selectOneCity(final String cityName) {
		return sqlSession.getMapper(CitiesMapper.class).selectOneCity(cityName);
	}
}
