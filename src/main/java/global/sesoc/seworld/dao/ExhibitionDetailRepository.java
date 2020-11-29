package global.sesoc.seworld.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.ExhibitionDetail;

@Repository
public class ExhibitionDetailRepository {
	@Autowired
	SqlSession sqlSession;

	public ExhibitionDetail viewExhibitionDetail(ExhibitionDetail exbtDetail) {
		ExhibitionDetailMapper exbtDetailMapper = sqlSession.getMapper(ExhibitionDetailMapper.class);
		return exbtDetailMapper.viewExhibitionDetail(exbtDetail);
	}
}
