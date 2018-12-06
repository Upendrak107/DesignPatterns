package behavoiral.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject {

	private List<Observer> observers;
	private String type;
	private double interest;
	private String bank;

	public Loan(String type, double interest, String bank) {
		observers = new ArrayList<Observer>();
		this.type = type;
		this.interest = interest;
		this.bank = bank;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			System.out.println("Notifying observers on change in loan interest :- ");
			observer.update(interest);
		}

	}

}
