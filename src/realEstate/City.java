package realEstate;

public class City {
	private String name;
	private String country ;
	private double population;
	public City() {
		super();
	}
	public City(String name, String country, double population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
}
