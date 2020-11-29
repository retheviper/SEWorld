package global.sesoc.seworld.dto;

public class Followship {
	private String follower;
	private String following;
	private String createdDate;
	public Followship() {
		super();
	}
	public Followship(String follower, String following, String createdDate) {
		super();
		this.follower = follower;
		this.following = following;
		this.createdDate = createdDate;
	}
	public String getFollower() {
		return follower;
	}
	public void setFollower(String follower) {
		this.follower = follower;
	}
	public String getFollowing() {
		return following;
	}
	public void setFollowing(String following) {
		this.following = following;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "Followship [follower=" + follower + ", following=" + following + ", createdDate=" + createdDate + "]";
	}
}
