package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Calendar;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CalendarRepository {

    private final SqlSession sqlSession;

    public Calendar selectOneCalendar(final Calendar calendar) {
        return sqlSession.getMapper(CalendarMapper.class).selectOneCalendar(calendar);
    }

    public int insertCalendar(final Calendar calendar) {
        return sqlSession.getMapper(CalendarMapper.class).insertCalendar(calendar);
    }

    public int deleteCalendar(final String calendarId) {
        return sqlSession.getMapper(CalendarMapper.class).deleteCalendar(calendarId);
    }

    public int updateCalendar(final String calendarId) {
        CalendarMapper calendarMapper = sqlSession.getMapper(CalendarMapper.class);
        return sqlSession.getMapper(CalendarMapper.class).updateCalendar(calendarId);
    }

    public List<Calendar> selectAllCalendars(final Calendar calendar) {
        return sqlSession.getMapper(CalendarMapper.class).selectAllCalendars(calendar);
    }
}
