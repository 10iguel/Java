package week06;

import java.util.Scanner;

public class Lab6e {

	// Start main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Declare variables
		boolean valid = false;
		String input;

		do {
			// Explain what the program does
			System.out.println("This program will ask the user to enter something and then print out a reversed version of the user's input.\n");
			valid = false;
			
			//Ask for input to reverse
			System.out.print("Please enter something: ");
			input = in.nextLine();
			
			// Print reversed input
			System.out.printf("Using the for loop: The reverse of %s is: %s%n", input, reverseWithForLoop(input));
			System.out.printf("Using the while loop: The reverse of %s is: %s%n", input, reverseWithWhileLoop(input));
			
			// Ask if the user wants to play again and validate
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
				System.out.println("\n");
			}
		} while (!valid);// Play again loop
		in.close();
	}// End of Main

	
	
	// Start reverseWithForLoop
	public static String reverseWithForLoop(String reverse) {
		String reversedInput = "";
		for(int i = reverse.length()-1; i > -1 ; i--) {
			reversedInput += (reverse.charAt(i));
		}
		return reversedInput;
	}
	// End of reverseWithForLoop
	
	
	
	// Start reverseWithWhileLoop
	public static String reverseWithWhileLoop(String reverse) {
		// Declare variables
		String reversedInput = "";
		int control = reverse.length()-1;
		
		// Start while loop
		while(control > -1){
			reversedInput += (reverse.charAt(control));
			control--;
		}
		return reversedInput;
	}
	// End of reverseWithWhileLoop
}