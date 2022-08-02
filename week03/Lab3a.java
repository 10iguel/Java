/*
Project name: Lab3a
Your names: Bohdan Yurchenko, Olivia Jaime
Date: 01.19.2022
Project info: Prints the customer shirt size
*/


package week03;

import java.util.Scanner;

public class Lab3a {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input;
		int chestSize;
		
		System.out.println("In this program, we will determine a man's shirt size based on the measurement in inches of the customer's chest.");
		System.out.println("Please enter the customer's chest measurement in inches:");
		
		input = in.nextLine();
		chestSize = Integer.parseInt(input);
		
		
		if (chestSize < 38)
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size S");
		else if (chestSize >= 38 && chestSize < 40)
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size M.");
		else if (chestSize >= 40 && chestSize < 43)
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size L.");
		else if (chestSize >= 43 && chestSize < 46)
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size XL.");
		else
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size XXL.");
			
				
		in.close();
	}
}
