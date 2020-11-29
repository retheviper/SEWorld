package global.sesoc.seworld.dto;

public class Wishing {
	private String memberId;
	private String exhibitionId;
	private String wished;
	private String createdDate;
	private String updatedDate;
	public Wishing() {
		super();
	}
	public Wishing(String memberId, String exhibitionId, String wished, String createdDate, String updatedDate) {
		super();
		this.memberId = memberId;
		this.exhibitionId = exhibitionId;
		this.wished = wished;
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
	public String getWished() {
		return wished;
	}
	public void setWished(String wished) {
		this.wished = wished;
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
		return "Wishing [memberId=" + memberId + ", exhibitionId=" + exhibitionId + ", wished=" + wished
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
}
