package global.sesoc.seworld.domain.dao;

import java.util.List;

import global.sesoc.seworld.domain.dto.Calendar;

public interface CalendarMapper {

	 Calendar selectOneCalendar(Calendar calendar);

	 int insertCalendar(Calendar calendar);

	 int deleteCalendar(String calendarId);

	 int updateCalendar(String calendarId);

	 List<Calendar> selectAllCalendars(Calendar calendar);
}
