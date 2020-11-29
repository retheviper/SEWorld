package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.ExbtInfo;

@Repository
public class ExbtInfoRepository {
	@Autowired
	SqlSession sqlSession;

	public int insertExbtInfo(List<ExbtInfo> exbtInfoList) {
		ExbtInfoMapper ovsExbtInfoMapper = sqlSession.getMapper(ExbtInfoMapper.class);
		int result = 0;
		for (ExbtInfo exbt : exbtInfoList) {
			result += ovsExbtInfoMapper.insertExbtInfo(exbt);
		}
		return result;
	}
}
