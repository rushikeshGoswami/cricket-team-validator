package test.pojo;

public class Player {

	String name;
	String country;
	String role;
	double price;

	public Player(String name, String country, String role, double price) {
		super();
		this.name = name;
		this.country = country;
		this.role = role;
		this.price = price;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", role=" + role + ", price=" + price + "]";
	}

}
