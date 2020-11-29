package global.sesoc.seworld.dto;

public class Calendar {
	private String calendarId;
	private String memberId;
	private String title;
	private String bgType;
	private String startDay;
	private String endDay;
	private String createdDate;
	private String updatedDate;
	public Calendar() {
		super();
	}
	public Calendar(String calendarId, String memberId, String title, String bgType, String startDay, String endDay,
			String createdDate, String updatedDate) {
		super();
		this.calendarId = calendarId;
		this.memberId = memberId;
		this.title = title;
		this.bgType = bgType;
		this.startDay = startDay;
		this.endDay = endDay;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public String getCalendarId() {
		return calendarId;
	}
	public void setCalendarId(String calendarId) {
		this.calendarId = calendarId;
	}

	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBgType() {
		return bgType;
	}
	public void setBgType(String bgType) {
		this.bgType = bgType;
	}
	public String getStartDay() {
		return startDay;
	}
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	public String getEndDay() {
		return endDay;
	}
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Calendar [calendarId=" + calendarId + ", memberId=" + memberId + ", title=" + title + ", bgType="
				+ bgType + ", startDay=" + startDay + ", endDay=" + endDay + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
}
