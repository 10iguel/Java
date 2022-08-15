package week04;

import java.util.Scanner;

public class Game4D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validNum = false;
        String answer;
        int num = 0;
        int guessedTries = 0;
        int randNum = 0;
        boolean correctNumber = false;

        randNum =  randomNumber();

        do {
            do {
                System.out.println("What is your guess?");
                answer = scanner.nextLine();
                try {
                    num = Integer.parseInt(answer);
                    validNum = true;
                } catch (NumberFormatException e) {

                    System.out.println("Error: Please enter a whole number.");
                }
            }while (!validNum);

            guessedTries++;
            if (num > randNum){
                System.out.println("High");
            }else if (num< randNum){
                System.out.println("Low");
            }else {
                correctNumber = true;
                System.out.println("you i it in "+ guessedTries);

            }

        }while (!correctNumber);
    }

    public static int randomNumber(){
        return (int)(Math.random() *100) +1;
    }
    public void printText(){
        System.out.println("This program is a guessing game.");
        System.out.println("The computer will generate a random integer between 1 and 100. The user will try to guess the number.");
        System.out.println("Let's get started!");
        System.out.println("I'm thinking of a number between 1 and 100.");
    }
}
