package managementSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome to STUDENT - COURSE MANAGEMENT SYSTEM");
		System.out.println("WHAT DO U WANT TO EXPLORE TODAY?");
		while(true)
		{
			System.out.println("MENU:\n 1.Register Student\n 2.View Student Details\n 3.Enroll in Course\n 4.Exit");
			System.out.print("Please enter the number:");
			choice = sc.nextInt();
			
			StudentService service = new StudentService();
		
			switch(choice) {
				case 1 -> service.registerStudent(sc);
				
				case 2 -> service.viewStudentDetails(sc);
				
				case 3 -> service.enrollInCourse(sc);
				
				case 4 ->{
					System.out.println("Exiting... GoodBye!");
			    	sc.close();
				    return;
				}
				
				default -> System.out.println("Invalid choice");
			}
		}
		
	}

}
