package global.sesoc.seworld.dao;

import java.util.List;

import global.sesoc.seworld.dto.Calendar;

public interface CalendarMapper {
	public abstract Calendar selectOneCalendar(Calendar calendar);

	public abstract int insertCalendar(Calendar calendar);

	public abstract int deleteCalendar(String calendarId);

	public abstract int updateCalendar(String calendarId);

	public abstract List<Calendar> selectAllCalendars(Calendar calendar);
}
