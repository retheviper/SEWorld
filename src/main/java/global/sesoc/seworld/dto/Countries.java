package global.sesoc.seworld.dto;

public class Countries {
	private String countryId;
	private String countryName;
	private int regionId;
	public Countries() {
		super();
	}
	public Countries(String countryId, String countryName, int regionId) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.regionId = regionId;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", countryName=" + countryName + ", regionId=" + regionId + "]";
	}
}
