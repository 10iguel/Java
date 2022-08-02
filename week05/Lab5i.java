package week05;

import java.util.*;

public class Lab5i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		// Declaring variables
		int startNum = 0;
		int endNum = 0;
		int multNum = 0;
		int result = 0;
		boolean valid = false;
		boolean playAgain = true;
		String answer;

		// Start do...while(playAgain)
		do {
			// Print what the program does
			System.out.println("This program will ask the user for three numbers:\n" + "    * A starting number\n"
					+ "    * An ending number\n" + "    * A multiplier\n"
					+ "The program will multiply each number between the starting number and ending number by the multiplier.");

			// Ask for and validate startNum
			do {
				System.out.print("Please enter the starting number: ");
				answer = in.nextLine();
				try {
					startNum = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}
			} while (!valid);
			// End of startNum validation

			valid = false;

			// Ask for and validate endNum
			do {
				System.out.print("Please enter the ending number: ");
				answer = in.nextLine();
				try {
					endNum = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}
			} while (!valid);
			// End of endNum validation

			valid = false;

			// Ask for and validate multiNum
			do {
				System.out.print("Please enter the multiplier: ");
				answer = in.nextLine();
				try {
					multNum = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}
			} while (!valid);
			// End of multiNum validation

			valid = false;

			//For loop. Print results
			for (int i = startNum; i <= endNum; i++) {
				result = i * multNum;
				System.out.println("Multiplying " + i + " by " + multNum + " results in: " + result);
			}

			// Ask if play again, validate
			do {
				System.out.print("Would you like to play again? ");
				answer = in.nextLine();
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.");
				}
			} while (!valid);
			// End of validation

			// Change play again if needed
			if (answer.equalsIgnoreCase("N")) {
				playAgain = false;
				System.out.print("Game over.");
			} else {
				valid = false;
			}

		} while (playAgain);// End of do...while
		in.close();
	}
}
