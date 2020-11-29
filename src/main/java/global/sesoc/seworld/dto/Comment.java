package global.sesoc.seworld.dto;

public class Comment {
	private String memberId;
	private String exhibitionId;
	private int rating;
	private String content;
	private String createdDate;
	private String updatedDate;
	private int likes;
	public Comment() {
		super();
	}
	public Comment(String memberId, String exhibitionId, int rating, String content, String createdDate,
			String updatedDate, int likes) {
		super();
		this.memberId = memberId;
		this.exhibitionId = exhibitionId;
		this.rating = rating;
		this.content = content;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.likes = likes;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
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
		return "Comment [memberId=" + memberId + ", exhibitionId=" + exhibitionId + ", rating=" + rating + ", content="
				+ content + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", likes=" + likes + "]";
	}
}
