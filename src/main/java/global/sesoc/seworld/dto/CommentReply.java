package global.sesoc.seworld.dto;

public class CommentReply {
	private String commentReplyId;
	private String writerId;
	private String memberId;
	private String exhibitionId;
	private String content;
	private String createdDate;
	private String updatedDate;
	private int likes;
	public CommentReply() {
		super();
	}
	public CommentReply(String commentReplyId, String writerId, String memberId, String exhibitionId, String content,
			String createdDate, String updatedDate, int likes) {
		super();
		this.commentReplyId = commentReplyId;
		this.writerId = writerId;
		this.memberId = memberId;
		this.exhibitionId = exhibitionId;
		this.content = content;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.likes = likes;
	}
	public String getCommentReplyId() {
		return commentReplyId;
	}
	public void setCommentReplyId(String commentReplyId) {
		this.commentReplyId = commentReplyId;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
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
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	@Override
	public String toString() {
		return "CommentReply [commentReplyId=" + commentReplyId + ", writerId=" + writerId + ", memberId=" + memberId
				+ ", exhibitionId=" + exhibitionId + ", content=" + content + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", likes=" + likes + "]";
	}
}
