package Threading;

public class Country implements Comparable<Country>{
int countryId;
public Country() {
	super();
	// TODO Auto-generated constructor stub
}

public Country(int countryId, String countryName) {
	super();
	this.countryId = countryId;
	this.countryName = countryName;
}

public int getCountryId() {
	return countryId;
}

public void setCountryId(int countryId) {
	this.countryId = countryId;
}

public String getCountryName() {
	return countryName;
}

public void setCountryName(String countryName) {
	this.countryName = countryName;
}

String countryName;
	
	public int compareTo(Country country) {
		return (this.countryId < country.countryId) ? -1 : (this.countryId > country.countryId) ? 1:0;
	}
	
}