package behavoiral.pattern.observer;

public class NewsPaper implements Observer {

	@Override
	public double update(double interest) {
		System.out.println("Internet: Interest Rate updated, new Rate is: " + interest);
		
		return interest;
	}
	

}
