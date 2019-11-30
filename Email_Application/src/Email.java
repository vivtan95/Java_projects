package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private String alternateEmail;
	
	private String companySuffix = "vivcompany.com";
	
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	
	// Constructor
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("Email created for: " + this.firstName + " " + this.lastName);
		
		// Call setDepartment()
		this.department = setDepartment();
		// System.out.println("Department set for: " + this.department);
		
		// Call SetRandomPassword()
		this.password = setRandomPass(defaultPasswordLength);
		System.out.println("Your password has been set as: " + this.password);
		
		// Generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Your email is: " + this.email);
		
	}
		
	// Ask for department
	public String setDepartment () {
		System.out.println(firstName + ". Department code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if(choice == 1) { return "Sales"; }
		else if (choice == 2) { return "Dev"; }
		else if (choice == 3) { return "Acct"; }
		else { return "N/A"; }
	}
		
		
	// Generate random password
	public String setRandomPass(int length) {
		Random random = new Random();
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			password[i] = passwordSet.charAt(random.nextInt(passwordSet.length()));
		}
		
		return String.valueOf(password);
		
	}
	
	// Set mailbox cap
	public void setMailboxCap(int n) {
		this.mailboxCapacity = n;
	}
	
	// Set alternate email
	public void setAltEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Set password	
	
	public void setPass (String pass) {
		this.password = pass;
	}
	
	// Get methods
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		
		return "Display Name: " + firstName + " " + lastName +
				"\nCompany Email: " + email + 
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
		
	}
}
