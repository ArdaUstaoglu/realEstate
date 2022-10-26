package realEstate;

public class Advert {
	private String Ozellik;
	private String name;
	private String advertDate;
	private String advertType;
	private double price;
	private double area;
	private String photo;
	private String isActive;
	private Category category;
	private Location location;
	private EstateAgent estateAgent;
	public Advert() {
		super();
	}
	public Advert(String ozellik, String name, String advertDate, String advertType, double price, double area,
			String photo, String isActive) {
		super();
		Ozellik = ozellik;
		this.name = name;
		this.advertDate = advertDate;
		this.advertType = advertType;
		this.price = price;
		this.area = area;
		this.photo = photo;
		this.isActive = isActive;
	}
	public Advert(String ozellik, String name, String advertDate, String advertType, double price, double area,
			String photo, String isActive, Category category, Location location, EstateAgent estateAgent) {
		super();
		Ozellik = ozellik;
		this.name = name;
		this.advertDate = advertDate;
		this.advertType = advertType;
		this.price = price;
		this.area = area;
		this.photo = photo;
		this.isActive = isActive;
		this.category = category;
		this.location = location;
		this.estateAgent = estateAgent;
	}
	public String getOzellik() {
		return Ozellik;
	}
	public void setOzellik(String ozellik) {
		Ozellik = ozellik;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdvertDate() {
		return advertDate;
	}
	public void setAdvertDate(String advertDate) {
		this.advertDate = advertDate;
	}
	public String getAdvertType() {
		return advertType;
	}
	public void setAdvertType(String advertType) {
		this.advertType = advertType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public EstateAgent getEstateAgent() {
		return estateAgent;
	}
	public void setEstateAgent(EstateAgent estateAgent) {
		this.estateAgent = estateAgent;
	}
	
}
