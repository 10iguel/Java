/*
Project name: Lab3c
Your names: Bohdan Yurchenko, Olivia Jaime
Date: 01.24.2022
Project info: Determines which class a member of the Church should attend on Sunday
 */
package week03;

import java.util.Scanner;

public class Lab3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// Declaring variables
		int age;
		String gender;
		String answer;
		String sunClass;

		// Printing the objective of the program
		System.out.println("This program will ask a member's age and gender and determine which class they should attend on Sunday.");

		// Asking age
		System.out.println("Please enter the member's age:");
		answer = in.nextLine();
		age = Integer.parseInt(answer);

		// If statements
		if (age < 1) {
			System.out.println("The member is a Babe in Arms.");
		} else if (age >= 1 && age < 3) {
			System.out.println("The member should be in Nursery.");
		} else if (age >= 3 && age < 12) {
			System.out.println("The member should attend Primary.");
		} else {
			System.out.println("Please enter the member's gender:");
			answer = in.nextLine();
			gender = answer;
			if (age >= 12 && age < 18 && gender.equalsIgnoreCase("m")) {
				sunClass = ("Young Men's");
			} else if (age >= 12 && age < 18 && gender.equalsIgnoreCase("f")) {
				sunClass = ("Young Women's");
			} else if (age >= 18 && gender.equalsIgnoreCase("m")) {
				sunClass = ("Priesthood");
			} else {
				sunClass = ("Relief Society");
			}
			System.out.println("The member should attend " + sunClass);
		}
		in.close();
	}

}
