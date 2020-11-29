package global.sesoc.seworld.dto;
/**벡터지도용 **/
public class Counting {
	private String countryName;
	private int num;
	public Counting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Counting(String countryName, int num) {
		super();
		this.countryName = countryName;
		this.num = num;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Counting [countryName=" + countryName + ", num=" + num + "]";
	}
	
	
}
