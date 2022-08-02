/*
Project name: Lab4b
Your names: Bohdan Yurchenko, Olivia Jaime
Date: 01.25.2022
Project info: Input validation
 */

package week04;

import java.util.*;

public class Lab4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		// Declaring variables
		String input = "";
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean valid = false;

		do {
			System.out.println("Please enter a number: ");
			input = in.nextLine();
			try {
				num1 = Integer.parseInt(input);
				valid = true;
			} catch (Exception e) {
				System.out.println("Error: Please enter a whole number.");
			} // end of try/catch
		} while (!valid);

		// Give num 2 and num3 new values
		num2 = (num1 + 1000);
		num3 = (num1 * 2);

		// Print num 1, num2 and num3
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		in.close();
	}

}
