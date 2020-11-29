package global.sesoc.seworld.dto;


import lombok.Data;

@Data
public class Calendar {
	private String calendarId;
	private String memberId;
	private String title;
	private String bgType;
	private String startDay;
	private String endDay;
	private String createdDate;
	private String updatedDate;
}
