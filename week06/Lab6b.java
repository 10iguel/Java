package week06;

import java.util.*;

public class Lab6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		// Declare variables
		boolean valid = false;
		boolean keepPlaying = true;
		int num1 = 0;
		int num2 = 0;
		String answer;

		// Start do...while(keepPlaying)
		do {
			// Instructions
			System.out.printf(
					"This program will ask the user for 2 numbers and raise the first number to the power of the second.%n%n");

			// Ask for num1 and validate
			do {
				System.out.print("Please enter the first number: ");
				answer = in.nextLine();
				try {
					num1 = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.");
				}
			} while (!valid);
			// End of validation

			valid = false;

			// Ask for num2 and validate
			do {
				System.out.print("Please enter the second number: ");
				answer = in.nextLine();
				try {
					num2 = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.");
				}
			} while (!valid);
			// End of validation

			valid = false;

			// Print result
			System.out.printf("%d raised to the power of %d is: %,d.%n%n", num1, num2, power(num1, num2));

			// Ask if keepPlaying, validate
			do {
				System.out.print("Would you like to play again? (Y/N): ");
				answer = in.nextLine();
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.printf("Invalid response: Please answer with a 'Y' or 'N'.%n%n");
				}
			} while (!valid);
			// End of validation

			// Change keepPlaying or valid
			if (answer.equalsIgnoreCase("N")) {
				keepPlaying = false;
			} else {
				System.out.println();
				System.out.println();
				System.out.println();
				valid = false;
			}
		} while (keepPlaying);
		in.close();
	}// End of main

	public static int power(int x, int y) {
		// Declare variable
		int total = 1;
		
		// For loop to calculate the power
		for (int i = 0; i < y; i++) {
			total = total * x;
		}
		// Return value
		return total;
	}// End of power
}
