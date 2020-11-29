package global.sesoc.seworld.dto;

import lombok.Data;

@Data
public class Wishing {
	private String memberId;
	private String exhibitionId;
	private String wished;
	private String createdDate;
	private String updatedDate;
}
