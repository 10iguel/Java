/*
Project name: Lab2b
Your names: Bohdan Yurchenko, Olivia Jaime
Date: 01.13.2022
Project info: Calculates the area of a rectangle and a square 
*/

package week02;

import java.util.Scanner;

public class Lab2b {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		String answer;
		double sqArea;
		double recArea;
		
		int sqWidth;
		int recWidth;
		int recHeight;
		
		System.out.println("Please enter the width of the square:");
		answer = in.nextLine();
		sqWidth = Integer.parseInt(answer);
		
		System.out.println("Please enter the width of the rectangle:");
		answer = in.nextLine();
		recWidth = Integer.parseInt(answer);
		
		System.out.println("Please enter the height of the rectangle:");
		answer = in.nextLine();
		recHeight = Integer.parseInt(answer);
		
		
		sqArea = sqWidth * sqWidth;
		recArea = recWidth * recHeight;
		
		
		
		System.out.println("The area of a square with a width of " + sqWidth + " is " + sqArea + ".");
		System.out.println("The area of a rectangle with a width of " + recWidth + " and a height of " + recHeight + " is " + recArea + ".");
		
		
		in.close();
		

	}
}
