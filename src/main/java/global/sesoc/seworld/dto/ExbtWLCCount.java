package global.sesoc.seworld.dto;

public class ExbtWLCCount {
	public int wishingCount;
	public int likingCount;
	public int commentCount;
	public ExbtWLCCount() {
		super();
	}
	public ExbtWLCCount(int wishingCount, int likingCount, int commentCount) {
		super();
		this.wishingCount = wishingCount;
		this.likingCount = likingCount;
		this.commentCount = commentCount;
	}
	public int getWishingCount() {
		return wishingCount;
	}
	public void setWishingCount(int wishingCount) {
		this.wishingCount = wishingCount;
	}
	public int getLikingCount() {
		return likingCount;
	}
	public void setLikingCount(int likingCount) {
		this.likingCount = likingCount;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	@Override
	public String toString() {
		return "ExhibitionWLCCount [wishingCount=" + wishingCount + ", likingCount=" + likingCount + ", commentCount="
				+ commentCount + "]";
	}
}
