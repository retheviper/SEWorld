package global.sesoc.seworld.domain.dao;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import global.sesoc.seworld.domain.dto.Countries;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CountriesRepository {

	private final SqlSession sqlSession;

	public List<Countries> selectAllCountries() {
		return  sqlSession.getMapper(CountriesMapper.class).selectAllCountries();
	}

	public Countries selectOneCountry(final String countryName) {
		return  sqlSession.getMapper(CountriesMapper.class).selectOneCountry(countryName);
	}
}
