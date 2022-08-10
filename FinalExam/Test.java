package FinalExam;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("What number would be good to factorial ");
        int num = scanner.nextInt();
        int total;

        total = num;
//        int factorial = recursion(num);
//        System.out.println("this is your Result "+ factorial);
//        for (int res =1; res <= num; res++){
//            total *= res;
//        }
        do {
            total = (total * (num -1));
            num-=1;
        }while(num != 1);

        System.out.println("here"+ total);



    }
    public static int recursion(int value){
        if (value  ==  1){
            return 1;
        }
        return value * recursion(value-1);
    }
}
