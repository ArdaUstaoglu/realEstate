package realEstate;

public class Category {
	private String name;
	private String logo;
	public Category() {
		super();
	}
	public Category(String name, String logo) {
		super();
		this.name = name;
		this.logo = logo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
}
