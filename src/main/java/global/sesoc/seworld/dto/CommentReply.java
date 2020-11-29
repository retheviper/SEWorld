package global.sesoc.seworld.dto;

import lombok.Data;

@Data
public class CommentReply {
	private String commentReplyId;
	private String writerId;
	private String memberId;
	private String exhibitionId;
	private String content;
	private String createdDate;
	private String updatedDate;
}
