package week06;

import java.util.Scanner;

public class Lab6d {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Declare variables
		int num = 0;
		boolean valid = false;
		String input;

		do {// Start code to run while user wants to keep playing
			System.out.println("This program will ask the user to enter a number of pennies.\r\n"
					+ "It will then calculate how many days it would take to become a millionaire by doubling the amount they have each day.");

			// Ask for num and validate
			do {
				System.out.print("Please enter the number of pennies you start with: ");
				input = in.nextLine();
				try {
					num = Integer.parseInt(input);
					valid = true;

				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}			
			} while (!valid);
			valid = false;
			// End of validation
			
			// Print table
			System.out.println("\nDays        Pennies");
			System.out.println("___________________");

			// Print how many days to become a billionare
			System.out.println(
					"\nBy starting with " + input + " and doubling the amount you have each day, it would only take "
							+ daysToMillion(num) + " days to become a millionaire!!!\n\n");
			
			// Ask if keep playing, validate
			do {
				System.out.print("Would you like to play again?(Y/N): ");
				input = in.nextLine();

				if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Y")) {
					valid = true;
				} else {
					System.out.println("Invalid entry. Must answer with a 'Y' or 'N'.");
					valid = false;
				}
			} while (!valid);
			// End of validation
			
			//Stop game or keep going
			if (input.equalsIgnoreCase("N")) {
				valid = true;

			} else {
				valid = false;
				System.out.println("\n\n");
			}
		} while (!valid);
		in.close();
	}// End of Main

	// Start daysToMillion
	public static int daysToMillion(int num) {
		int days = 0;
		while (num < 100000000) {
			System.out.printf("%-2d%,17d%n", days, num);
			num *= 2;
			days++;
		}
		System.out.printf("%-2d%,17d%n", days, num);
		return days;
	}// End of daysToMillion
}
