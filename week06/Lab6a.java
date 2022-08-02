package week06;

import java.util.*;

public class Lab6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		// Declare variables
		boolean valid = false;
		boolean keepPlaying = true;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String answer;

		// Start do...while(keepPlaying)
		do {
			//Print instructions
			System.out.printf(
					"This program will ask the user for three numbers and determine which of the three is the largest.%n%n");

			// Ask for num1 and validate
			do {
				System.out.print("Enter the first number: ");
				answer = in.nextLine();
				try {
					num1 = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.");
				}
			} while (!valid);
			//End of validation
			
			valid = false;

			// Ask for num2 and validate
			do {
				System.out.print("Enter the second number: ");
				answer = in.nextLine();
				try {
					num2 = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.");
				}
			} while (!valid);
			//End of validation
			
			valid = false;

			// Ask for num3 and validate
			do {
				System.out.print("Enter the third number: ");
				answer = in.nextLine();
				try {
					num3 = Integer.parseInt(answer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.");
				}
			} while (!valid);
			//End of validation
			
			valid = false;

			// Print largest of the three numbers
			System.out.printf("The largest of the three numbers is: %d%n%n", largestNumber(num1, num2, num3));

			//Ask if keepPlaying, validate
			do {
				System.out.print("Would you like to play again? (Y/N): ");
				answer = in.nextLine();
				if(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					valid = true;
				}else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.");
				}
			}while (!valid);//End of validation
			//Change keepPlaying or valid
			if(answer.equalsIgnoreCase("N")) {
				keepPlaying = false;
			} else {
				System.out.println();
				System.out.println();
				System.out.println();
				valid = false;
			}
			
		} while (keepPlaying);
		in.close();
	}//End of main

	public static int largestNumber(int x, int y, int z) {
		//Get largest number
		int a = 0;
		if (x > y && x > z) {
			a = x;
		} else if (y > x && y > z) {
			a = y;
		} else {
			a = z;
		}
		return a;
	}//End of largestNumber

}
