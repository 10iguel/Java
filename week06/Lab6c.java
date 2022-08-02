package week06;

import java.util.Scanner;

public class Lab6c {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		boolean valid = false;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		do {
			System.out.println("This program will ask the user for 3"
					+ " numbers and determine if the second number lies between the first and the third.\n");
			do {
				System.out.print("Please enter the low number: ");
				input = in.nextLine();
				try {
					num1 = Integer.parseInt(input);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}
			} while (!valid);
			valid = false;
			do {
				System.out.print("Please enter the number to be tested (the between number): ");
				input = in.nextLine();
				try {
					num2 = Integer.parseInt(input);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}
			} while (!valid);
			valid = false;
			do {
				System.out.print("Please enter the high number: ");
				input = in.nextLine();
				try {
					num3 = Integer.parseInt(input);
					valid = true;
					} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}
			} while (!valid);
			valid = false;

			if (isBetween(num1, num2, num3)) {
				valid = true;
				System.out.println("");
				System.out.printf("%,d lies between the numbers %,d and %,d%n", num2, num1, num3);
			} else {
				System.out.println("");
				System.out.printf("%,d DOES NOT lie between the numbers %,d and %,d%n", num2, num1, num3);
			}
			do {
				System.out.println("");
				System.out.print("Would you like to play again?(Y/N):");
				input = in.nextLine();

				if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Y")) {
					valid = true;
				} else {
					System.out.println("Invalid entry. Must answer with a 'Y' or 'N'.");
					valid = false;
				}
			} while (!valid);
			if (input.equalsIgnoreCase("N")) {
				valid = true;

			} else {
				valid = false;
				System.out.println("");
				System.out.println("");
			}
		} while (!valid);
		in.close();
	}// End of main

	
	// Start of isBetween
	public static boolean isBetween(int numero1, int numero2, int numero3) {

		boolean between = false;
		if (numero1 < numero2 && numero2 < numero3) {
			between = true;
		}
		return between;
	}// End of isBetween
}