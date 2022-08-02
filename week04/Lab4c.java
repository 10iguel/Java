/*
Project name: Lab4b
Your names: Bohdan Yurchenko, Olivia Jaime
Date: 01.31.2022
Project info: Non-numeric input validation
 */

package week04;

import java.util.Scanner;

public class Lab4c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		//Declaring variables
		String answer;
		boolean valid = false;
		
		do { //Starts validation
			System.out.print("Do you like to code in Java?: ");
			answer = in.nextLine();
			if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
				valid = true;
			}
			else {
				System.out.println("Error: Please answer with a 'Y' or 'N'.");
			}
		} while (!valid); //End of validation
		
		if (answer.equalsIgnoreCase("Y")) {
			System.out.println("That's great! I do too!");
		}
		else {
			System.out.println("That's ok. There are many other wonderful things in life to learn.");
		}
	
		in.close();
	}

}
