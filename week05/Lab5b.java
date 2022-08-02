package week05;

import java.util.Scanner;

public class Lab5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		// Declaring variables
		double deposit = 0;
		double interestRate = 0;
		double balance = 0;
		int months = 0;
		String answer = "";
		boolean valid = false;
		boolean calculate = true;

		// Start do...while(calculate)
		do {

			// What does the program do
			System.out.println(
					"This program will ask the user for a monthly deposit, an annual interest rate and the number of months the user plans on saving.");
			System.out.println("It will then show the monthly balance over the period of planned savings.");

			// Ask for deposit and validate
			do {
				System.out.print("Please enter the amount to be deposited each month: ");
				answer = in.nextLine();
				try {
					deposit = Double.parseDouble(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a valid number.");
				}
			} while (!valid);
			
			
			valid = false;

			// Ask for interestRate and validate
			do {
				System.out.print("Please enter the annual interest rate: ");
				answer = in.nextLine();
				try {
					interestRate = Double.parseDouble(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a valid number.");
				}
			} while (!valid);
			valid = false;

			// Ask for months and validate
			do {
				System.out.print("Please enter the number of months you plan to save: ");
				answer = in.nextLine();
				try {
					months = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}
			} while (!valid);
			valid = false;

			// Say we'll print the table
			System.out.println(
					"The following table shows the balance of the account for each month of the designated savings period.");

			// Do the table			
			interestRate = interestRate/100/12;
			System.out.println("Month             Balance");
			for (int i = 1; i <= months; i++) {	
				balance = ((deposit + balance) * (1 + interestRate));
				System.out.printf("Month: %-10d $%,.2f%n", i, balance);
			}

			// Ask if they want to calculate again and validate
			do {
				System.out.print("Would you like to make another calculation? (Y/N): ");
				answer = in.nextLine();
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.");
				}
			} while (!valid);
			// End of validation
			
			if (answer.equalsIgnoreCase("N")) {
				calculate = false;
			} else {
				balance = 0;
			}
		} while (calculate);
		in.close();
	}

}
