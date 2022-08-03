package week07;

import java.util.Scanner;
import java.util.Stack;

public class Lab7c {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int num = 0;
        boolean done = false;
        Stack<Integer> stack = new Stack<Integer>();

        do {
            System.out.println("Enter a number, If you want to skip push Enter");
            answer = scanner.nextLine();
            try {
                if (!answer.equals("")){
                    num = Integer.parseInt(answer);
                    stack.push(num);
                    printStack(stack);
                }else {
                    done = true;
                }
            }catch (Exception e){
                System.out.println("There is an error");
            }

        }while (!done);
    }

    private static void printStack(Stack<Integer> stack){
        System.out.printf("This is the stack %s \n", stack);
    }
}
