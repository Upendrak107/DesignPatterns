package behavoiral.pattern.observer;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ObserverTest {

	@Test
	public void observerTest() {
		NewsPaper printMedia = new NewsPaper();
        Internet onlineMedia = new Internet();

        Loan personalLoan = new Loan("Personal Loan", 12.5d,
                     "Standard Charterd");
        personalLoan.registerObserver(printMedia);
        personalLoan.registerObserver(onlineMedia);
        personalLoan.setInterest(3.5d);
        double result = printMedia.update( personalLoan.getInterest());
        assertEquals(result,3.5d);
        
	}

}