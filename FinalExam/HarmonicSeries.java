package FinalExam;

import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is you number?: ");
        int num = scanner.nextInt();
        float sum = 0;
        for(int den=1 ; den <= num ; den++){
            sum = sum + (float)1/den;
        }
        System.out.println(sum);

    }

}
