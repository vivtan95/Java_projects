package bankApp;

import java.util.ArrayList;
import java.util.List;

public class BankApp {

	public static void main(String[] args) {		
		
		List<Account> accounts = new ArrayList<Account>();
		
		// Read CSV file to create accounts
		String file = "C:\\Users\\Viv\\Documents\\GitHub\\Java_projects\\Bank_Application\\NewBankAccounts.csv";
		List<String[]> newAccs = utilities.CSV.read(file);
		
		for(String[] newAcc : newAccs) {
			String name = newAcc[0];
			String SSN = newAcc[1];
			String accountType = newAcc[2];
			double initDeposit = Double.parseDouble(newAcc[3]);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, SSN, initDeposit));
			} else if (accountType.equals("Checking")){
				accounts.add(new Checking(name, SSN, initDeposit));
			} else {
				System.out.println("Error. Account type N/A");
			}
		}
		
		for(Account acc: accounts) {
			System.out.println("\n*************************");
			acc.showInfo();
		}
		
	}

}
