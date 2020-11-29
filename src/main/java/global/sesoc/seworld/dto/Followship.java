package global.sesoc.seworld.dto;

import lombok.Data;

@Data
public class Followship {
	private String follower;
	private String following;
	private String createdDate;
}
