package global.sesoc.seworld.dto;

public class ExbtInfo {
	// exhibitionInfo
	private String exhibitionTitleKor;
	private String exhibitionTitleEng;
	private String openingTerm;
	private String openingCycle;
	private String firstOpeningYear;
	private String openingScale;
	private String openingCountry;
	private String openingCity;
	private String exhibitionHall;
	// lastYearOpeningResult
	private String participatingNationCount;
	private String openingCountryCount;
	private String overseasCount;
	private String openingCountryVisitorsCount;
	private String mainParticipatingNations;
	private String KOREACompanyWhether;
	private String KOREACompanyParticipatingCount;
	private String totalVisitorsCount;
	private String overseasVisitorsCount;
	private String exhibitionArea;
	// sponsorInfo
	private String sponsor;
	private String personInCharge;
	private String address;
	private String telephone;
	private String fax;
	private String homepage;
	private String email;
	// reference
	private String createdDate;
	private String lastUpdatedDate;
	private String source;
	private String dataOffer;
	private String exhibitionItem;
	private String remarks;
	public ExbtInfo() {
		super();
	}
	public ExbtInfo(String exhibitionTitleKor, String exhibitionTitleEng,
			String openingTerm, String openingCycle, String firstOpeningYear,
			String openingScale, String openingCountry, String openingCity,
			String exhibitionHall, String participatingNationCount,
			String openingCountryCount, String overseasCount,
			String openingCountryVisitorsCount, String mainParticipatingNations,
			String kOREACompanyWhether, String kOREACompanyParticipatingCount,
			String totalVisitorsCount, String overseasVisitorsCount,
			String exhibitionArea, String sponsor, String personInCharge,
			String address, String telephone, String fax, String homepage,
			String email, String createdDate, String lastUpdatedDate,
			String source, String dataOffer, String exhibitionItem,
			String remarks) {
		super();
		this.exhibitionTitleKor = exhibitionTitleKor;
		this.exhibitionTitleEng = exhibitionTitleEng;
		this.openingTerm = openingTerm;
		this.openingCycle = openingCycle;
		this.firstOpeningYear = firstOpeningYear;
		this.openingScale = openingScale;
		this.openingCountry = openingCountry;
		this.openingCity = openingCity;
		this.exhibitionHall = exhibitionHall;
		this.participatingNationCount = participatingNationCount;
		this.openingCountryCount = openingCountryCount;
		this.overseasCount = overseasCount;
		this.openingCountryVisitorsCount = openingCountryVisitorsCount;
		this.mainParticipatingNations = mainParticipatingNations;
		this.KOREACompanyWhether = kOREACompanyWhether;
		this.KOREACompanyParticipatingCount = kOREACompanyParticipatingCount;
		this.totalVisitorsCount = totalVisitorsCount;
		this.overseasVisitorsCount = overseasVisitorsCount;
		this.exhibitionArea = exhibitionArea;
		this.sponsor = sponsor;
		this.personInCharge = personInCharge;
		this.address = address;
		this.telephone = telephone;
		this.fax = fax;
		this.homepage = homepage;
		this.email = email;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.source = source;
		this.dataOffer = dataOffer;
		this.exhibitionItem = exhibitionItem;
		this.remarks = remarks;
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
	public String getOpeningCycle() {
		return openingCycle;
	}
	public void setOpeningCycle(String openingCycle) {
		this.openingCycle = openingCycle;
	}
	public String getFirstOpeningYear() {
		return firstOpeningYear;
	}
	public void setFirstOpeningYear(String firstOpeningYear) {
		this.firstOpeningYear = firstOpeningYear;
	}
	public String getOpeningScale() {
		return openingScale;
	}
	public void setOpeningScale(String openingScale) {
		this.openingScale = openingScale;
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
	public String getParticipatingNationCount() {
		return participatingNationCount;
	}
	public void setParticipatingNationCount(String participatingNationCount) {
		this.participatingNationCount = participatingNationCount;
	}
	public String getOpeningCountryCount() {
		return openingCountryCount;
	}
	public void setOpeningCountryCount(String openingCountryCount) {
		this.openingCountryCount = openingCountryCount;
	}
	public String getOverseasCount() {
		return overseasCount;
	}
	public void setOverseasCount(String overseasCount) {
		this.overseasCount = overseasCount;
	}
	public String getOpeningCountryVisitorsCount() {
		return openingCountryVisitorsCount;
	}
	public void setOpeningCountryVisitorsCount(String openingCountryVisitorsCount) {
		this.openingCountryVisitorsCount = openingCountryVisitorsCount;
	}
	public String getMainParticipatingNations() {
		return mainParticipatingNations;
	}
	public void setMainParticipatingNations(String mainParticipatingNations) {
		this.mainParticipatingNations = mainParticipatingNations;
	}
	public String getKOREACompanyWhether() {
		return KOREACompanyWhether;
	}
	public void setKOREACompanyWhether(String kOREACompanyWhether) {
		KOREACompanyWhether = kOREACompanyWhether;
	}
	public String getKOREACompanyParticipatingCount() {
		return KOREACompanyParticipatingCount;
	}
	public void setKOREACompanyParticipatingCount(
			String kOREACompanyParticipatingCount) {
		KOREACompanyParticipatingCount = kOREACompanyParticipatingCount;
	}
	public String getTotalVisitorsCount() {
		return totalVisitorsCount;
	}
	public void setTotalVisitorsCount(String totalVisitorsCount) {
		this.totalVisitorsCount = totalVisitorsCount;
	}
	public String getOverseasVisitorsCount() {
		return overseasVisitorsCount;
	}
	public void setOverseasVisitorsCount(String overseasVisitorsCount) {
		this.overseasVisitorsCount = overseasVisitorsCount;
	}
	public String getExhibitionArea() {
		return exhibitionArea;
	}
	public void setExhibitionArea(String exhibitionArea) {
		this.exhibitionArea = exhibitionArea;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getPersonInCharge() {
		return personInCharge;
	}
	public void setPersonInCharge(String personInCharge) {
		this.personInCharge = personInCharge;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDataOffer() {
		return dataOffer;
	}
	public void setDataOffer(String dataOffer) {
		this.dataOffer = dataOffer;
	}
	public String getExhibitionItem() {
		return exhibitionItem;
	}
	public void setExhibitionItem(String exhibitionItem) {
		this.exhibitionItem = exhibitionItem;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "ExbtInfo [exhibitionTitleKor=" + exhibitionTitleKor
				+ ", exhibitionTitleEng=" + exhibitionTitleEng
				+ ", openingTerm=" + openingTerm + ", openingCycle="
				+ openingCycle + ", firstOpeningYear=" + firstOpeningYear
				+ ", openingScale=" + openingScale + ", openingCountry="
				+ openingCountry + ", openingCity=" + openingCity
				+ ", exhibitionHall=" + exhibitionHall
				+ ", participatingNationCount=" + participatingNationCount
				+ ", openingCountryCount=" + openingCountryCount
				+ ", overseasCount=" + overseasCount
				+ ", openingCountryVisitorsCount=" + openingCountryVisitorsCount
				+ ", mainParticipatingNations=" + mainParticipatingNations
				+ ", KOREACompanyWhether=" + KOREACompanyWhether
				+ ", KOREACompanyParticipatingCount="
				+ KOREACompanyParticipatingCount + ", totalVisitorsCount="
				+ totalVisitorsCount + ", overseasVisitorsCount="
				+ overseasVisitorsCount + ", exhibitionArea=" + exhibitionArea
				+ ", sponsor=" + sponsor + ", personInCharge=" + personInCharge
				+ ", address=" + address + ", telephone=" + telephone + ", fax="
				+ fax + ", homepage=" + homepage + ", email=" + email
				+ ", createdDate=" + createdDate + ", lastUpdatedDate="
				+ lastUpdatedDate + ", source=" + source + ", dataOffer="
				+ dataOffer + ", exhibitionItem=" + exhibitionItem
				+ ", remarks=" + remarks + "]";
	}
}
