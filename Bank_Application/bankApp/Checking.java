package bankApp;

import java.util.concurrent.ThreadLocalRandom;

public class Checking extends Account{
	// List properties specific to Checking account
	private String debitCardNumber;
	private String debitCardPIN;
	
	
	// Constructor
	public Checking(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		accountNum = "2" + accountNum;
		
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	
	private void setDebitCard() {
		long temp = 1000000000000L;
		debitCardNumber = (String.format("%12d", ThreadLocalRandom.current().nextLong(temp)));
		debitCardPIN = (String.format("%04d", (int)(Math.random() * Math.pow(10, 4))));
		System.out.println("");
	}
	
	// List methods specific to Checking account

	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Savings Account Features: " +
				"\n debitCardNumber: " + debitCardNumber + 
				"\n debitCardPIN: " + debitCardPIN);
	}
	
}
