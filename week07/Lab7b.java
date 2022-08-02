package week07;

import java.util.Scanner;
import java.lang.Math;

public class Lab7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		// Declare variables
		String answer = "";
		boolean valid = true;
		
		do {
		// Describe the function of the program
		System.out.println("This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides.\n"
				+ "The program will ask the user which side they wish to calculate and the lengths of the other two sides.\n"
				+ "Assume that the three sides are called a, b, and c where c is the hypotenuse (the side opposite the right angle).\n");

		valid = false;
		
		// Ask user which side they wish to calculate and validate
		do {
			System.out.print("Which side of the triangle do you wish to calculate? (a/b/c): ");
			answer = in.nextLine();
			if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c")){
				valid = true;
			} else {
				System.out.println("Invalid response: Please enter either a, b, or c.");
			}
		}while(!valid);
		
		valid = false;
		
		// Call the appropriate method
		if (answer.equalsIgnoreCase("a")) {
			calculateSideA();
		}else if (answer.equalsIgnoreCase("b")) {
			calculateSideB();
		}else if (answer.equalsIgnoreCase("c")){
			calculateSideC();
		}
		
		// Ask if playAgain and validate
		do {
			System.out.print("\nWould you like to play again?(Y/N): ");
			answer = in.nextLine();

			if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("Y")) {
				valid = true;
			} else {
				System.out.println("Invalid entry. Must answer with a 'Y' or 'N'.");
				valid = false;
			}
		} while (!valid);
		valid = false;

		// Stop game or keep going
		if (answer.equalsIgnoreCase("N")) {
			valid = true;

		} else {
			valid = false;
			System.out.println("\n");
		}
		
		}while(!valid);
		in.close();
	}// End of main

	
	
	// Start of calculateSideA()
	public static void calculateSideA(){
		// Get b and c
		int b = getSideLenght("b");
		int c = getSideLenght("c");
		
		// Calculate a
		double a = Math.sqrt((c * c) - (b * b));
		System.out.printf("%nA right triangle with sides 'b' = %d and 'c' (hypotenuse) = %d, has a side 'a' which has a length of: %.2f%n", b, c, a);
	}// End of calculateSideA()
	
	
	
	// Start of calculateSideB()
	public static void calculateSideB(){
		// Get a and c
		int a = getSideLenght("a");
		int c = getSideLenght("c");
		
		// Calculate a
		double b = Math.sqrt((c * c) - (a * a));
		System.out.printf("%nA right triangle with sides 'a' = %d and 'c' (hypotenuse) = %d, has a side 'b' which has a length of: %.2f%n", a, c, b);
	}// End of calculateSideB()
	
	
	
	// Start of calculateSideC()
	public static void calculateSideC(){
		// Get a and c
		int a = getSideLenght("a");
		int b = getSideLenght("b");
		
		// Calculate a
		double c = Math.sqrt((a * a) + (b * b));
		System.out.printf("%nA right triangle with sides 'a' = %d and 'b' (hypotenuse) = %d, has a side 'c' which has a length of: %.2f%n", a, b, c);
	}// End of calculateSideC()
	
	
	
	// Start getSideLenght(letter)
	public static int getSideLenght(String letter) {
		Scanner in = new Scanner(System.in);

		// Declare variables
		String answer;
		int num = 0;
		boolean valid = false;

		// Ask for values and validate
		do {
			System.out.printf("Please enter the length of side %s: ", letter);
			answer = in.nextLine();
			try {
				num = Integer.parseInt(answer);
				valid = true;
			} catch (Exception e) {
				System.out.println("Invalid response. Please enter a whole number.");
			}
		} while (!valid);
		valid = false;
		in.close();
		
		return num;
	}// End of getSideLenght(letter)
	
}// End of main