package FinalExam;

import java.util.*;

public class FinalExam1 {

	public static void main(String[] args) {
		// Declare variables and scanner
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		String answer;
		String name;
		String ward;
		int males = 0;
		int females = 0;

		// Ask user their name
		System.out.print("Please enter your name: ");
		name = in.nextLine();

		// Ask user their ward name
		System.out.print("Please enter the name of your Ward: ");
		ward = in.nextLine();

		// Ask apx of males and validate
		do {
			System.out.print("Please enter the approximate amount of adult males in the ward: ");
			answer = in.nextLine();
			try {
				males = Integer.parseInt(answer);
				valid = true;
			} catch (Exception e) {
				System.out.println("Invalid response. Please enter a whole number");
			}
		} while (!valid);
		
		valid = false;
		
		// Ask apx of females and validate
		do {
			System.out.print("Please enter the approximate amount of adult females in the ward: ");
			answer = in.nextLine();
			try {
				females = Integer.parseInt(answer);
				valid = true;
			} catch (Exception e) {
				System.out.println("Invalid response. Please enter a whole number");
			}
		} while (!valid);
		
		// Print final statement
		System.out.printf("There are %d adult members in %s's %s ward.", (males+females), name, ward);
		
		// Close scanner
		in.close();
	}// End of class

}// End of main
