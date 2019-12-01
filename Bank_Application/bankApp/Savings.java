package bankApp;

public class Savings extends Account{
	// List properties specific to Savings account
	private String safetyDepositBoxID;
	private String safetyDepositBoxKey;
	
	 
	// Constructor
	public Savings(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		accountNum = "1" + accountNum;
		
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (String.format("%03d", (int)(Math.random() * Math.pow(10, 3))));
		safetyDepositBoxKey = (String.format("%04d", (int)(Math.random() * Math.pow(10, 4))));
	}

	// List methods specific to Savings account

	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Savings Account Features: " +
				"\n SafetyBoxID: " + safetyDepositBoxID + 
				"\n SafetyBoxKey: " + safetyDepositBoxKey);
	}
	
}
