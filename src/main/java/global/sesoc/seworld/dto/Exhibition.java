package global.sesoc.seworld.dto;

public class Exhibition {
	private String exhibitionId;
	private String exhibitionTitleKor;
	private String exhibitionTitleEng;
	private String openingTerm;
	private String firstOpeningYear;
	private String openingCountry;
	private String openingCity;
	private String exhibitionHall;
	private String sponsor;
	private String createdDate;
	private String updatedDate;
	private String dataOffer;
	public Exhibition() {
		super();
	}
	public Exhibition(String exhibitionId, String exhibitionTitleKor, String exhibitionTitleEng, String openingTerm,
			String firstOpeningYear, String openingCountry, String openingCity, String exhibitionHall, String sponsor,
			String createdDate, String updatedDate, String dataOffer) {
		super();
		this.exhibitionId = exhibitionId;
		this.exhibitionTitleKor = exhibitionTitleKor;
		this.exhibitionTitleEng = exhibitionTitleEng;
		this.openingTerm = openingTerm;
		this.firstOpeningYear = firstOpeningYear;
		this.openingCountry = openingCountry;
		this.openingCity = openingCity;
		this.exhibitionHall = exhibitionHall;
		this.sponsor = sponsor;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.dataOffer = dataOffer;
	}
	public String getExhibitionId() {
		return exhibitionId;
	}
	public void setExhibitionId(String exhibitionId) {
		this.exhibitionId = exhibitionId;
	}
	public String getExhibitionTitleKor() {
		return exhibitionTitleKor;
	}
	public void setExhibitionTitleKor(String exhibitionTitleKor) {
		this.exhibitionTitleKor = exhibitionTitleKor;
	}
	public String getExhibitionTitleEng() {
		return exhibitionTitleEng;
	}
	public void setExhibitionTitleEng(String exhibitionTitleEng) {
		this.exhibitionTitleEng = exhibitionTitleEng;
	}
	public String getOpeningTerm() {
		return openingTerm;
	}
	public void setOpeningTerm(String openingTerm) {
		this.openingTerm = openingTerm;
	}
	public String getFirstOpeningYear() {
		return firstOpeningYear;
	}
	public void setFirstOpeningYear(String firstOpeningYear) {
		this.firstOpeningYear = firstOpeningYear;
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
	public String getExhibitionHall() {
		return exhibitionHall;
	}
	public void setExhibitionHall(String exhibitionHall) {
		this.exhibitionHall = exhibitionHall;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
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
	public String getDataOffer() {
		return dataOffer;
	}
	public void setDataOffer(String dataOffer) {
		this.dataOffer = dataOffer;
	}
	@Override
	public String toString() {
		return "Exhibition [exhibitionId=" + exhibitionId + ", exhibitionTitleKor=" + exhibitionTitleKor
				+ ", exhibitionTitleEng=" + exhibitionTitleEng + ", openingTerm=" + openingTerm + ", firstOpeningYear="
				+ firstOpeningYear + ", openingCountry=" + openingCountry + ", openingCity=" + openingCity
				+ ", exhibitionHall=" + exhibitionHall + ", sponsor=" + sponsor + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", dataOffer=" + dataOffer + "]";
	}
}
