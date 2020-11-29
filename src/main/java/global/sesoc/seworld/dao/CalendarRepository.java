package global.sesoc.seworld.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.seworld.dto.Calendar;

@Repository
public class CalendarRepository {
	@Autowired
	SqlSession sqlSession;

	public Calendar selectOneCalendar(Calendar calendar) {
		CalendarMapper calendarMapper = sqlSession.getMapper(CalendarMapper.class);
		return calendarMapper.selectOneCalendar(calendar);
	}

	public int insertCalendar(Calendar calendar) {
		CalendarMapper calendarMapper = sqlSession.getMapper(CalendarMapper.class);
		int result = calendarMapper.insertCalendar(calendar);
		System.out.println("캘린인서트 리ㅂ포지토리 테스트용"+result);
		
		return calendarMapper.insertCalendar(calendar);
		
	}

	public int deleteCalendar(String calendarId) {
		CalendarMapper calendarMapper = sqlSession.getMapper(CalendarMapper.class);
		return calendarMapper.deleteCalendar(calendarId);
	}

	public int updateCalendar(String calendarId) {
		CalendarMapper calendarMapper = sqlSession.getMapper(CalendarMapper.class);
		return calendarMapper.updateCalendar(calendarId);
	}

	public List<Calendar> selectAllCalendars(Calendar calendar) {
		CalendarMapper calendarMapper = sqlSession.getMapper(CalendarMapper.class);
		System.out.println("멤버는??"+calendar);
		System.out.println("캘더 잘 끌고왔니?"+calendarMapper.selectAllCalendars(calendar));
		return calendarMapper.selectAllCalendars(calendar);
	}

}
