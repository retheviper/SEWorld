package global.sesoc.seworld.dto;

public class Liking {
	private String memberId;
	private String exhibitionId;
	private String liked;
	private String createdDate;
	private String updatedDate;
	public Liking() {
		super();
	}
	public Liking(String memberId, String exhibitionId, String liked, String createdDate, String updatedDate) {
		super();
		this.memberId = memberId;
		this.exhibitionId = exhibitionId;
		this.liked = liked;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
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
	public String getLiked() {
		return liked;
	}
	public void setLiked(String liked) {
		this.liked = liked;
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
		return "Liking [memberId=" + memberId + ", exhibitionId=" + exhibitionId + ", liked=" + liked + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}
}
