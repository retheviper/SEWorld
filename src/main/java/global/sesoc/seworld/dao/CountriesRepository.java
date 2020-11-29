package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.dto.Countries;

public class CountriesRepository {
	@Autowired
	SqlSession sqlSession;

	public List<Countries> selectAllCountries() {
		CountriesMapper countriesMapper = sqlSession.getMapper(CountriesMapper.class);
		return countriesMapper.selectAllCountries();
	}

	public Countries selectOneCountry(String countryName) {
		CountriesMapper countriesMapper = sqlSession.getMapper(CountriesMapper.class);
		return countriesMapper.selectOneCountry(countryName);
	}
}
