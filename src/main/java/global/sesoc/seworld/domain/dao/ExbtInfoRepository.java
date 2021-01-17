package global.sesoc.seworld.domain.dao;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.domain.dto.ExbtInfo;

@Repository
@RequiredArgsConstructor
public class ExbtInfoRepository {

	private final SqlSession sqlSession;

	public int insertExbtInfo(final List<ExbtInfo> exbtInfoList) {
		final ExbtInfoMapper ovsExbtInfoMapper = sqlSession.getMapper(ExbtInfoMapper.class);
		return (int) exbtInfoList.stream().map(exbt -> ovsExbtInfoMapper.insertExbtInfo(exbt)).count();
	}
}
