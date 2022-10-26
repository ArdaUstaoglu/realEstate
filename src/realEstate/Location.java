package realEstate;

public class Location {
	private String district;
	private String neighbourhood;
	private City city;
public Location() {
	super();
}
public Location(String district, String neighbourhood) {
	super();
	this.district = district;
	this.neighbourhood = neighbourhood;
}
public Location(City city, String district, String neighbourhood) {
	super();
	this.city = city;
	this.district = district;
	this.neighbourhood = neighbourhood;
}
public City getCity() {
	return city;
}
public void setCity(City city) {
	this.city = city;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getNeighbourhood() {
	return neighbourhood;
}
public void setNeighbourhood(String neighbourhood) {
	this.neighbourhood = neighbourhood;
};
	
	
	
}
