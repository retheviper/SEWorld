package global.sesoc.seworld.dto;

public class Cities {
	private int cityId;
	private String cityName;
	private String countryId;
	public Cities() {
		super();
	}
	public Cities(int cityId, String cityName, String countryId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.countryId = countryId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	@Override
	public String toString() {
		return "Cities [cityId=" + cityId + ", cityName=" + cityName + ", countryId=" + countryId + "]";
	}
}
