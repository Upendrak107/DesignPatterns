package behavoiral.pattern.strategy;

import java.util.Date;

public class PayPalPayment implements PaymentMethod {
	
	private final String name;
	private final String cardNumber;
	private final Date expires;
	
	public PayPalPayment(String name, String cardNumber, Date expires) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.expires = expires;
	}

	public String getName() {
		return name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public Date getExpires() {
		return expires;
	}

	
	@Override
	public boolean pay(double amount) {
		return true; 
	}

}
