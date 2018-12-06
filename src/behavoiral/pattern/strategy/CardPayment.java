package behavoiral.pattern.strategy;

public class CardPayment implements PaymentMethod {

	private long cardNumber;
	public String name;
	public int cvv;
	public String expiryDate;

	public CardPayment(long cardNumber, String name, int cvv, String expiryDate) {
		super();
		this.cardNumber = cardNumber;
		this.name = name;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public boolean pay(double amount) {
		return true;
	}

}
