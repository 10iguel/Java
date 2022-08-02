/*
Project name: Lab3b
Your names: Bohdan Yurchenko, Olivia Jaime
Date: 01.20.2022
Project info: Calculates the user's BMI
*/

package week03;

import java.util.Scanner;

public class Lab3b {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Declaring variables
		double height;
		double wheight;
		double BMI;
		String answer;
		String BMIclass;

		// Entering data
		System.out.println("In this program we will calculate a person's BMI.");

		System.out.println("Please enter a person's height in inches:");
		answer = in.nextLine();
		height = Double.parseDouble(answer);

		System.out.println("Please enter a person's weight in pounds:");
		answer = in.nextLine();
		wheight = Double.parseDouble(answer);

		// Converting to kg and m
		wheight = (wheight * 0.45359237);
		height = (height * 0.0254);
		BMI = (wheight / (height * height));

		// If statements to interpret the BMI values
		if (BMI < 18.5)
			BMIclass = ("Underweight");
		else if (BMI >= 18.5 && BMI <= 24.9)
			BMIclass = ("Normal");
		else if (BMI >= 25.0 && BMI < 29.9)
			BMIclass = ("Overweight");
		else
			BMIclass = ("Obese");

		// Print results
		System.out.println("The person's BMI is: " + BMI + ". The person has a BMI classification of: " + BMIclass);

		in.close();
	}
}
