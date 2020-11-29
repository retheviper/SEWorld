package global.sesoc.seworld.dto;

public class BoardReply {
	private String boardReplyId;
	private String boardId;
	private String memberId;
	private String content;
	private String createdDate;
	private String updatedDate;
	public BoardReply() {
		super();
	}
	public BoardReply(String boardReplyId, String boardId, String memberId, String content, String createdDate,
			String updatedDate) {
		super();
		this.boardReplyId = boardReplyId;
		this.boardId = boardId;
		this.memberId = memberId;
		this.content = content;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public String getBoardReplyId() {
		return boardReplyId;
	}
	public void setBoardReplyId(String boardReplyId) {
		this.boardReplyId = boardReplyId;
	}
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
		return "BoardReply [boardReplyId=" + boardReplyId + ", boardId=" + boardId + ", memberId=" + memberId
				+ ", content=" + content + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
}
