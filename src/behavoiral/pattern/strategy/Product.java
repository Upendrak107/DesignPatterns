package behavoiral.pattern.strategy;

public class Product {

	private String upcCode;
	private String name;
	private double price;

	public Product(String upcCode, String name, double price) {
		super();
		this.upcCode = upcCode;
		this.name = name;
		this.price = price;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
