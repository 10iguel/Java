/*
Project name: Lab2c
Names: Bohdan Yurchenko, Olivia Jaime
Date: 01.18.2022
Description: calculates the monthly interest
 */


package week02;

import java.util.Scanner;

public class Lab2c {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String answer;
		double deposit;
		double annualRate;
		double monthlyRate;
		double balance;
		
		
		System.out.println("Please enter the amount to be deposited each month:");
		answer = in.nextLine();
		deposit = Double.parseDouble(answer);
		
		System.out.println("Please enter the annual interest rate percent:");
		answer = in.nextLine();
		annualRate = Double.parseDouble(answer);
		
		monthlyRate = (annualRate / 100 / 12);
		
		balance = (deposit * (1 + monthlyRate));
		balance = ((deposit + balance) * (1 + monthlyRate));
		balance = ((deposit + balance) * (1 + monthlyRate));
		balance = ((deposit + balance) * (1 + monthlyRate));
		balance = ((deposit + balance) * (1 + monthlyRate));
		balance = ((deposit + balance) * (1 + monthlyRate));
		
		System.out.println("The ending balance after 6 months is: $" + balance);
		
		in.close();
	}
}
