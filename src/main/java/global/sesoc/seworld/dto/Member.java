package global.sesoc.seworld.dto;

import lombok.Data;

@Data
public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberType;
	private String verified;
	private String regDate;
}
