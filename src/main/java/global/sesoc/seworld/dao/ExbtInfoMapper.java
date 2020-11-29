package global.sesoc.seworld.dao;

import global.sesoc.seworld.dto.ExbtInfo;

public interface ExbtInfoMapper {
	/**
	 * API로 받아온 전시정보 객체를 DB에 입력한다.
	 * 
	 * @param exbt
	 * @return 0:입력실패, 1:입력성
	 */
	public abstract int insertExbtInfo(ExbtInfo exbt);
}
