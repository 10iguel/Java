package FinalExam;

import java.util.Scanner;

public class asteriskPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = 0;
        System.out.println("Enter the number of lines: ");
        lines = scanner.nextInt();
        scanner.close();

        System.out.println();
        for (int height = 1; height<= lines; height++){
            for (int blank = 1; blank <= lines - height; blank++){
//                System.out.print(" ");
                System.out.print("a");
            }
            for (int asterisk = 1; asterisk <= (height*2)-1 ; asterisk++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
