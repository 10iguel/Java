package week05;

import java.util.Scanner;

public class Lab5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		// Declaring variables
		String answer;
		int startNum = 0;
		int endNum = 0;
		int testNum = 0;
		boolean valid = false;
		boolean stopPlaying = false;

		// Start the do...while(!stopPlaying)
		do {
			// Explain what the program does
			System.out.println(
					"In this program, we will display a series of numbers divisible by an integer specified by the user.");
			System.out.println(
					"You will ask the user for the starting number, the ending number and the integer to be considered.");
			// Ask for startNum and validate it
			do {
				System.out.print("Enter the starting number: ");
				answer = in.nextLine();
				try {
					startNum = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Error: Please enter a whole number.");
				}
			} while (!valid);
			valid = false;
			// Ask for endNum and validate it
			do {
				System.out.print("Enter the ending number: ");
				answer = in.nextLine();
				try {
					endNum = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Error: Please enter a whole number.");
				}
			} while (!valid);
			valid = false;
			// Ask for testNum and validate it
			do {
				System.out.print("Enter the test number: ");
				answer = in.nextLine();
				try {
					testNum = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Error: Please enter a whole number.");
				}
			} while (!valid);
			valid = false;
			// Print text saying what we'll do
			System.out.println("Here are the numbers between " + startNum + " and " + endNum + " that are divisible by "
					+ testNum + ":");
			// Print the numbers
			for (int i = startNum; i <= endNum; i++) {
				if (i % testNum == 0) {
					System.out.println(i);
				}
			}
			// See if the user wants to keep playing, validate
			do {
				System.out.print("Would you like to play again? ");
				answer = in.nextLine();
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.");
				}
			} while (!valid);

			// Change stopPlaying
			if (answer.equalsIgnoreCase("N")) {
				stopPlaying = true;
			}
		} while (!stopPlaying);
		in.close();
	}
}