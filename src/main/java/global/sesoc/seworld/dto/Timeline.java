package global.sesoc.seworld.dto;

public class Timeline {
	private String exhibitionTitleKor;
	private String openingTerm;
	private String openingCountry;
	private String openingCity;
	private String wishingCreatedDate;
	private double commentRating;
	private String commentContent;
	private String commentCreatedDate;
	private String boardId;
	private String boardTitle;
	private String boardContent;
	private String boardCreatedDate;
	public Timeline() {
		super();
	}
	public Timeline(String exhibitionTitleKor, String openingTerm, String openingCountry, String openingCity,
			String wishingCreatedDate, double commentRating, String commentContent, String commentCreatedDate,
			String boardId, String boardTitle, String boardContent, String boardCreatedDate) {
		super();
		this.exhibitionTitleKor = exhibitionTitleKor;
		this.openingTerm = openingTerm;
		this.openingCountry = openingCountry;
		this.openingCity = openingCity;
		this.wishingCreatedDate = wishingCreatedDate;
		this.commentRating = commentRating;
		this.commentContent = commentContent;
		this.commentCreatedDate = commentCreatedDate;
		this.boardId = boardId;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardCreatedDate = boardCreatedDate;
	}
	public String getExhibitionTitleKor() {
		return exhibitionTitleKor;
	}
	public void setExhibitionTitleKor(String exhibitionTitleKor) {
		this.exhibitionTitleKor = exhibitionTitleKor;
	}
	public String getOpeningTerm() {
		return openingTerm;
	}
	public void setOpeningTerm(String openingTerm) {
		this.openingTerm = openingTerm;
	}
	public String getOpeningCountry() {
		return openingCountry;
	}
	public void setOpeningCountry(String openingCountry) {
		this.openingCountry = openingCountry;
	}
	public String getOpeningCity() {
		return openingCity;
	}
	public void setOpeningCity(String openingCity) {
		this.openingCity = openingCity;
	}
	public String getWishingCreatedDate() {
		return wishingCreatedDate;
	}
	public void setWishingCreatedDate(String wishingCreatedDate) {
		this.wishingCreatedDate = wishingCreatedDate;
	}
	public double getCommentRating() {
		return commentRating;
	}
	public void setCommentRating(double commentRating) {
		this.commentRating = commentRating;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCommentCreatedDate() {
		return commentCreatedDate;
	}
	public void setCommentCreatedDate(String commentCreatedDate) {
		this.commentCreatedDate = commentCreatedDate;
	}
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardCreatedDate() {
		return boardCreatedDate;
	}
	public void setBoardCreatedDate(String boardCreatedDate) {
		this.boardCreatedDate = boardCreatedDate;
	}
	@Override
	public String toString() {
		return "Timeline [exhibitionTitleKor=" + exhibitionTitleKor + ", openingTerm=" + openingTerm
				+ ", openingCountry=" + openingCountry + ", openingCity=" + openingCity + ", wishingCreatedDate="
				+ wishingCreatedDate + ", commentRating=" + commentRating + ", commentContent=" + commentContent
				+ ", commentCreatedDate=" + commentCreatedDate + ", boardId=" + boardId + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardCreatedDate=" + boardCreatedDate + "]";
	}
}
