package week07;

import java.util.Scanner;

public class Lab7i {

	public static void main(String[] args) {
	    //Play the game until the user says they don't want to play again.
	    String playAgain = "Y";
	    while (playAgain.equalsIgnoreCase("Y")) {
	    	
	        //Get an integer from the user
	        int intNum = getValidInt("Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.");
	        System.out.printf("The whole number your entered was: %d.\n", intNum);
	        System.out.println("Now we will test your whole number in a math equation...");
	        System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
	        System.out.println();
	        
	        //Get a floating-point from the user
	        double doubleNum = getValidDouble("Please enter a decimal-point number: ", "Invalid response. Only decimal-point numbers are acceptable.");
	        System.out.printf("The float your entered was: %f.\n", doubleNum);
	        System.out.println("Now we will test your floating-point number in a math equation...");
	        System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
	        System.out.println();
	        
	        //Get a 'Y' or 'N' from the user
	        playAgain = getValidYN("Would you like to play again? (Y/N): ", "Invalid response.  Please answer with a 'Y' or 'N'");
	        System.out.println();
	        
	    }// End of while (playAgain.equalsIgnoreCase("y"))
	    
	    System.out.println("Goodbye!");
	}// End of Main()
	
	
	
	// Start of getValidInt
	public static int getValidInt(String question, String warning) {
		try (Scanner in = new Scanner(System.in)) {
			// Declare variables
			String answer;
			boolean valid = false;
			int validInt = 0;
			
			do {
				System.out.print(question);
				answer = in.nextLine();
				try {
					validInt = Integer.parseInt(answer);
					valid = true;
				}catch (Exception e) {
					System.out.println(warning);
				}
			}while(!valid);

			return validInt;
		}
	}// End of getValidInt
	
	
	
	//Start of getValidDouble
	public static double getValidDouble(String question, String warning) {
		try (Scanner in = new Scanner(System.in)) {
			// Declare variables
			String answer;
			boolean valid = false;
			double validDouble = 0;
			
			do {
				System.out.print(question);
				answer = in.nextLine();
				try {
					validDouble = Double.parseDouble(answer);
					valid = true;
				}catch (Exception e) {
					System.out.println(warning);
				}
			}while(!valid);
			
			return validDouble;
		}
	}// End of getValidDouble
	
	
	
	// Start of getValidYN
	public static String getValidYN(String question, String warning) {
		try (Scanner in = new Scanner(System.in)) {
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
			
			return answer;
		}
	}// End of getValidYN

	
}// End of class
