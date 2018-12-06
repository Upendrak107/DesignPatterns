package behavoiral.pattern.strategy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SamplePayProcessTestClass {

	@Test
	public void payBillUsingCard() {

	  ShoppingCart cart = new ShoppingCart();

	  Product item1 = new Product("IT001","T-Shirt", 750.43);
	  cart.addProduct(item1);

	  Product item2 = new Product("IT001","T-Shirt", 750.43);
	  cart.addProduct(item2);

	  
	  PaymentMethod visa = new CardPayment(3267895,"upendra",879, "05/2018" );

	  boolean result = cart.pay(visa);
	  assertTrue(result);

	}

	/*private Date getCardExpireyDate() {
	  Calendar cal = Calendar.getInstance();
	  cal.clear();
		cal.set(2015, Calendar.JANUARY, 21);
		return cal.getTime();
	}*/
}
