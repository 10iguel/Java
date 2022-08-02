/*
Project name: Lab4bPonder
Your names: Bohdan Yurchenko, Olivia Jaime
Date: 01.25.2022
Project info: Investigate and Ponder
 */

package week04;

import java.util.Scanner;

public class Lab4bPonder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Use Scanner for getting Input from user 
		Scanner in = new Scanner(System.in);             //Input Scanner

		System.out.print("Please enter a number: ");
		String input = in.nextLine();

		int num1 = Integer.parseInt(input);

		System.out.printf("You entered the number " + num1);

		in.close();
	
		}//end of method main()

	}
