/*
Project name: Lab4d
Your names: Bohdan Yurchenko, Olivia Jaime
Date: 02.01.2022
Project info: Random Number Guessing Game
 */

package week04;

import java.util.Scanner;
import java.lang.Math;

public class Lab4d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		//Declaring variables
		boolean playGame = true;
		boolean validNum = false;
		boolean validYesOrNo = false;
		boolean rightNum = false;
		String answer;
		int randNum = 0;
		int guessCount = 0;
		int num = 0;
		
		do {
			//Start game
			 printText();
			
			//Generate random number and start guessCount
			randNum =  randomNumber();

			do {
				do{
					System.out.println("What is your guess?");
					answer = in.nextLine();
					try {
						num = Integer.parseInt(answer);
						validNum = true;
					} catch (Exception e) {
						System.out.println("Error: Please enter a whole number.");
					} //End of try/catch					
				} while (!validNum);//Num Input Validation
				
				guessCount++;
				//Check if guess is correct. If not, provide a hint
				if (num > randNum) {
					System.out.println("Your guess is too high. Try again.");
				} else if (num < randNum) {
					System.out.println("Your guess is too low. Try again.");
				} else {
					rightNum = true;
					System.out.println("CORRECT! You guessed it in " + guessCount + " tries!");
				}
			} while (!rightNum);//Game loop
			
			//Ask if play again, input validation
			do {
				System.out.println("Would you like to play again?");
				answer = in.nextLine();
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					validYesOrNo = true;
				}
				else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.");
				}
			} while (!validYesOrNo); //End of validation
			
			//Resolve Would you like to play again? answer
			if (answer.equalsIgnoreCase("Y")) {
				guessCount = 0;
				rightNum = false;
			} else {
				playGame = false;
			}
			
		} while (playGame); //Game finishes or restarts
		System.out.println("Game over!");
		in.close();
	}
	public static int randomNumber(){
		return (int)(Math.random() *100) +1;
	}
	public static void printText(){
		System.out.println("This program is a guessing game.");
		System.out.println("The computer will generate a random integer between 1 and 100. The user will try to guess the number.");
		System.out.println("Let's get started!");
		System.out.println("I'm thinking of a number between 1 and 100.");
	}
}
