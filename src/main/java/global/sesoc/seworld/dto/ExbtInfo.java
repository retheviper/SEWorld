package global.sesoc.seworld.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
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
}
