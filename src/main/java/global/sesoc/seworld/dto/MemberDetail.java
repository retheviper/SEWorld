package global.sesoc.seworld.dto;

public class MemberDetail {
	private String followerCount;
	private String followingCount;
	private String wishingCount;
	private String commentCount;
	private String reviewCount;
	public MemberDetail() {
		super();
	}
	public MemberDetail(String followerCount, String followingCount, String wishingCount, String commentCount,
			String reviewCount) {
		super();
		this.followerCount = followerCount;
		this.followingCount = followingCount;
		this.wishingCount = wishingCount;
		this.commentCount = commentCount;
		this.reviewCount = reviewCount;
	}
	public String getFollowerCount() {
		return followerCount;
	}
	public void setFollowerCount(String followerCount) {
		this.followerCount = followerCount;
	}
	public String getFollowingCount() {
		return followingCount;
	}
	public void setFollowingCount(String followingCount) {
		this.followingCount = followingCount;
	}
	public String getWishingCount() {
		return wishingCount;
	}
	public void setWishingCount(String wishingCount) {
		this.wishingCount = wishingCount;
	}
	public String getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}
	public String getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(String reviewCount) {
		this.reviewCount = reviewCount;
	}
	@Override
	public String toString() {
		return "MemberDetail [followerCount=" + followerCount + ", followingCount=" + followingCount + ", wishingCount="
				+ wishingCount + ", commentCount=" + commentCount + ", reviewCount=" + reviewCount + "]";
	}
}
