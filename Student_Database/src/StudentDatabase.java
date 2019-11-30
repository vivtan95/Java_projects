package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabase {
	
	public static void main(String[] args) {
		// Ask how many students
		System.out.print("Enter number of new students to enroll: ");
		Scanner scanner = new Scanner(System.in);
		int numStudents = scanner.nextInt();
		Student[] students = new Student[numStudents];
		
		// Create n number of new students
		for(int n=0; n<numStudents;n++) {
			System.out.println("-Creating profile for new student-");
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		
		for(int n=0; n<numStudents;n++) {
			System.out.println(students[n].showInfo());
		}
		
	}
}
