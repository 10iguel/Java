/*
Project name: Lab4a
Your name: Bohdan Yurchenko, Olivia Jaime
Date: 01.26.2022
Project info: Using a while loop to calculate factorial
 */

package week04;

import java.util.*;

public class Lab4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		//Declare variables
		String answer;				
		int num = 0;				
		int total = 0;				
		boolean valid = false;

		do{
			System.out.println("Please enter the number for which you wish to calculate its factorial:");
			answer = in.nextLine();
			try{
				total = factorial(Integer.parseInt(answer));
				valid = true;
			} catch (Exception e) {
				System.out.println("Error.  Please input a valid number.");
			}//End of try/catch
		} while (!valid);

		System.out.println("The factorial " + answer + "! is: " + total + ".");

		in.close();
	}

	public static int factorial(int value) {
		if (value == 1){
			return 1;
		}
		return value * factorial(value -1);
	}

}
