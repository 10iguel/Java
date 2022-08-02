package week07;

import java.util.Scanner;
import java.time.LocalDate;

public class Lab7a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Declare variables
		String name;
		String input;
		boolean valid = false;
		int year = 0;

		// Start do...while
		do {
			// Print instructions
			System.out.println("This program will ask the user to enter a name and a birth year for a potential student.\n"
					+ "The program will then determine what type of school, if any, the potential student is eligible to attend.\r\n");

			// Ask for name and make sure they enter something
			do {
				System.out.print("Please enter the name of a potential student: ");
				name = in.nextLine();
				
				if (name.equals("")) {
					System.out.println("Make sure to enter input.");
				}else {
					valid = true;
				}
			}while(!valid);
			// End of validation
			
			valid = false;

			// Ask for year and validate
			do {
				System.out.print("Please enter the year the potential student was born: ");
				input = in.nextLine();
				try {
					year = Integer.parseInt(input);
					valid = true;

				} catch (Exception e) {
					System.out.println("Invalid response. Please enter a whole number for the birth year.");
				}
			} while (!valid);
			// End of validation
			valid = false;

			checkEligibility(year, name);

			// Ask if playAgain, validate
			do {
				System.out.print("\nWould you like to play again?(Y/N): ");
				input = in.nextLine();

				if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Y")) {
					valid = true;
				} else {
					System.out.println("Invalid entry. Must answer with a 'Y' or 'N'.");
					valid = false;
				}
			} while (!valid);
			// End of validation

			// Stop game or keep going
			if (input.equalsIgnoreCase("N")) {
				valid = true;

			} else {
				valid = false;
				System.out.println("\n");
			}
		} while (!valid);// End of keepPlaying
		in.close();
	}// End of main

	// Start checkEligibility
	public static void checkEligibility(int year, String name) {		
		if (calculateAge(year) < 5) {
			System.out.printf("%s is %d years old. %s is too young to attend school.%n", name, calculateAge(year),
					name);
		} else if (calculateAge(year) < 12) {
			System.out.printf("%s is %d years old. %s may attend Elementary School.%n", name, calculateAge(year), name);
		} else if (calculateAge(year) < 15) {
			System.out.printf("%s is %d years old. %s may attend Jr. High School.%n", name, calculateAge(year), name);
		} else if (calculateAge(year) < 18) {
			System.out.printf("%s is %d years old. %s may attend High School.%n", name, calculateAge(year), name);
		} else {
			System.out.printf("%s is %d years old. %s may attend College.%n", name, calculateAge(year), name);
		}
	}// End of checkEligibility

	// Start calculateAge
	public static int calculateAge(int year) {
		// Declare variable
		int age = 0;
		
		// Get current date
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		
		// Calculate age
		age = currentYear - year;
		
		return age;
	}// End of calculateAge
}// End of class
