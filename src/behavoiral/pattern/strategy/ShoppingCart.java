package behavoiral.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private final List<Product> products;

	public ShoppingCart() {

		products = new ArrayList<Product>();
	}
	
	public void addProduct(Product item) {
		products.add(item);
	}
	
	public void removeProduct(Product item) {
		products.remove(item);
	}
	
	public double calcTotalCost() {
		double total = 0.0;
		for (Product item : products) {
			total += item.getPrice();
		}
		return total;
	}

	public boolean pay(PaymentMethod method) {
		double totalCost = calcTotalCost();
		return method.pay(totalCost);
	}
}
