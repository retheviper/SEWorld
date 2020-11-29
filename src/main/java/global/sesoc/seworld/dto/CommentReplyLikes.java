package global.sesoc.seworld.dto;

public class CommentReplyLikes {
	private String memberId;
	private String exhibitionId;
	private String createdDate;
	public CommentReplyLikes() {
		super();
	}
	public CommentReplyLikes(String memberId, String exhibitionId, String createdDate) {
		super();
		this.memberId = memberId;
		this.exhibitionId = exhibitionId;
		this.createdDate = createdDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getExhibitionId() {
		return exhibitionId;
	}
	public void setExhibitionId(String exhibitionId) {
		this.exhibitionId = exhibitionId;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "CommentReplyLikes [memberId=" + memberId + ", exhibitionId=" + exhibitionId + ", createdDate="
				+ createdDate + "]";
	}
}
