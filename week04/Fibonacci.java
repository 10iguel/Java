package week04;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        boolean valid = false;
        String answer;
        int userRequest = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("How many numbers of the Fibonacci sequence would you like to display?:");
            answer = scanner.nextLine();

            try {
                userRequest = Integer.parseInt(answer);
                valid = true;

            }catch (Exception e){
                System.out.println("Error: Please enter a whole number.");

            }
        }while (!valid);

        // Fibonacci
        int currentFib = 1;
        int prevFib = 0;
        int newFib = 0;
        System.out.println(currentFib);
        int count = 1;

        do {
            newFib = currentFib + prevFib;
            System.out.println(newFib);

            prevFib = currentFib;
            currentFib = newFib;
            count++;

        }while (count < userRequest);
    }

    public static int fibo(int value){
        if (value == 1){
            return 1;
        }
        return value + fibo(value);
    }
}
