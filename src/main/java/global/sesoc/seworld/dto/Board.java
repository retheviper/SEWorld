package global.sesoc.seworld.dto;

public class Board {
	private String boardId;
	private String memberId;
	private String category;
	private String title;
	private String content;
	private String createdDate;
	private String updatedDate;
	private String exhibitionId;
	public Board() {
		super();
	}
	public Board(String boardId, String memberId, String category, String title, String content, String createdDate,
			String updatedDate, String exhibitionId) {
		super();
		this.boardId = boardId;
		this.memberId = memberId;
		this.category = category;
		this.title = title;
		this.content = content;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.exhibitionId = exhibitionId;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getExhibitionId() {
		return exhibitionId;
	}
	public void setExhibitionId(String exhibitionId) {
		this.exhibitionId = exhibitionId;
	}
	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", memberId=" + memberId + ", category=" + category + ", title=" + title
				+ ", content=" + content + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", exhibitionId=" + exhibitionId + "]";
	}
}
