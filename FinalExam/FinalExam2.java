package FinalExam;

import java.util.*;

public class FinalExam2 {
	
	/*
	 * The main method will ask the user to input as many numbers as
	 * they wish, add them to an ArrayList, and print out the sum of
	 * the numbers and which number is the largest.
	 */
	public static void main(String[] args) {
		// Declare variables
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		String answer = "";
		int num = 0;
		boolean done = false;
		
		// Print instructions of the 
		System.out.print("In this program, you will ask the user to enter a list of numbers.\n"
				+ "The program will then find the sum of the numbers and determine which of the numbers is the largest.\n\n");
		
		// Ask for numbers and add to ArrayList
		do {
			System.out.print("Please enter a number (or just hit enter to finish): ");
			answer = in.nextLine();
			if(!answer.equals("")) {
				num = Integer.parseInt(answer);
				numbers.add(num);
			} else {
				done = true;
			}
		}while(!done);
		
		//Print final statement
		System.out.printf("%n%nThe sum of the list of numbers is: %d.%nThe largest number in the list is: %d.", addNumbers(numbers), largestNumber(numbers));
		
		// Close scanner
		in.close();
	}// End of main()
	
	/*
	 * The addNumbers() method will use a for loop to add every number
	 * in the ArrayList and return the sum as an integer.
	 */
	
	public static Integer addNumbers(ArrayList<Integer>numbers) {
		// Declare variables
		int total = 0;
		
		// Beginning of loop
		for(int num : numbers) {
			total += num;
		}
		
		// Return the total of the sums
		return total;
	}// End of addNumbers()
	
	/*
	 * The largestNumber() method will use a for loop to evaluate every
	 * number in the ArrayList and return the largest as an int.
	 */
	
	public static Integer largestNumber(ArrayList<Integer>numbers) {
		// Declare variables
		int largest = 0;
		
		// Beginning of loop
		for(int num : numbers) {
			if(num > largest) {
				largest = num;
			}
		}
		
		// Return the largest number
		return largest;
	}

}//End of class
