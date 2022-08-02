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
		int total;				
		boolean valid = false;

		do{
			System.out.println("Please enter the number for which you wish to calculate its factorial:");
			answer = in.nextLine();
			try{
				num = Integer.parseInt(answer);
				valid = true;
			} catch (Exception e) {
				System.out.println("Error.  Please input a valid number.");
			}//End of try/catch
			total = num;
		} while (!valid);

		do {
			total = (total * (num - 1));
			num -= 1;
		} while (num != 1);

		System.out.println("The factorial " + answer + "! is: " + total + ".");

		in.close();
	}

}
