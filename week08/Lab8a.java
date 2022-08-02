package week08;

import java.util.*;

public class Lab8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// Declare variables
		ArrayList<Integer> num = new ArrayList<Integer>();
		boolean valid = false;
		int numToArray = 0;
		String answer = "0";
		String playAgain;

		do {
			System.out.print("This program will ask the user to enter a series of numbers.\n"
					+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\n"
					+ "The program will then display the array of numbers and the sum total of those numbers.\n\n");

			// Ask for numbers and validate
			do{
				System.out.print("Please enter a number (or just hit enter to finish): ");
				answer = in.nextLine();
				
				if (answer.equals("")) {
					valid = true;
				}else {
					try {
						numToArray = Integer.parseInt(answer);
						num.add(numToArray);
						valid = true;
					} catch (Exception e) {
						System.out.println("Invalid response. Please enter a valid whole number.");
					}
				valid = false;
				}
			}while(!valid);
			
			// Do table
			System.out.println("Array Index      Item");
			for(int i = 0; i < num.size(); i++) {
				System.out.printf("%11d %9d%n", i, num.get(i));
			}
			
			// Print how many elements are in the ArrayList and their sum total
			System.out.printf("There are %d items in the ArrayList.%n"
					+ "The sum total of numbers in the ArrayList is %d.%n", num.size(), sumValues(num));
			
			playAgain = getValidYN("Do you wish to play again? (Y/N): ", "Invalid response. Please enter either a 'Y' or 'N'.");
			
			// Stop game or keep going
			if (playAgain.equalsIgnoreCase("N")) {
				valid = true;
			}else {
				num.clear();
				System.out.print("\n\n");
				valid = false;
			}
		} while (!valid);
		in.close();
	}// End of main

	

	// Start of sumValues
	public static int sumValues(ArrayList<Integer> sum){

		// Declare variables
		int total = 0;
		
		for(int num : sum) {
			total += num;
		}

		return total;
	}// End of sumValues
	
	
	
	// Start of getValidYN
	public static String getValidYN(String question, String warning) {
		Scanner in = new Scanner(System.in);
		
		// Declare variables
		String answer;
		boolean valid = false;
		
		do {
			System.out.print(question);
			answer = in.nextLine();
			if(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
				valid = true;
			}else {
				System.out.println(warning);
			}
		}while(!valid);
		in.close();
		
		return answer;
	}// End of getValidYN
}