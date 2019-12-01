package bankApp;

public abstract class Account implements IBaseRate {
	// List common properties for Savings and Checking 
	private String name;
	private String SSN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNum;
	protected double rate;
	
	// Constructor 
	public Account(String name, String SSN, double initDeposit) {
		this.name = name;
		this.SSN = SSN;
		this.balance = initDeposit;
	
		// Set account number
		this.accountNum = setAccNum();
		
		setRate();
	}
	
	// Force classes that implements Account class to have setRate()
	public abstract void setRate();
	
	private String setAccNum() {
		index++;
		
		String lastTwoSSN = SSN.substring(SSN.length()-2, SSN.length());
		
		String randomNum = (String.format("%03d", ((int)(Math.random() * 1000))));
		
		return lastTwoSSN + index + randomNum;
		
	}
	
	public void compount() {
		double accruedInterest = balance * (rate/100);
		System.out.println("AccruedInterest: $" + accruedInterest);		
		balance += accruedInterest;
		printBalance();
	}
	
	// List common methods
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing: $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing: $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();	
	}
	
	public void printBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	
	public void showInfo() {
		System.out.println(
				"Name: " + name +
				"\nAcc number: " + accountNum +
				"\nBalance: " + balance + 
				"\nRate : " + rate + "%"
				);
	}
	
}
