package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String courses = "";

	private int year;
	private int balance;
	private String ID;
	private final int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first name: ");
		this.firstName = scanner.nextLine();
		System.out.print("Enter last name: ");
		this.lastName = scanner.nextLine();
		System.out.print(
				"Available year of study: \n1 - Freshmen\n2- Sophmore\n3- Junior\n4 - Senior\n Enter year of study:");
		this.year = scanner.nextInt();

		ID = setID();
	}

	// Generate ID
	private String setID() {
		id++;
		return this.year + String.valueOf(this.id);
	}

	// Enroll courses
	public void enroll() {
		// Loop until user hit Q

		do {
			System.out.print("Enter courses to enroll (Q to quit): ");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				balance = balance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);

	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + this.balance);
	}
	
	// Pay tuition
	public void payTuition() {
		Scanner scanner = new Scanner(System.in);
		viewBalance();
		System.out.println("Input amount to pay: ");
		int payment = scanner.nextInt();
		this.balance -= payment;
		System.out.println("Transaction completed. Payment of : $" + payment);
		
		viewBalance();
	}
	
	// Show status
	public String showInfo() {
		return "Name: "	+ firstName + " " + lastName +
				"\nYear of study: " + year +
				"\nStudent ID: " + ID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + balance;
	}
	
}
