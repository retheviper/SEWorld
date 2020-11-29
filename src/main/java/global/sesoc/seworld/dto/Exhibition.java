package global.sesoc.seworld.dto;

import lombok.Data;

@Data
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
}
