package testingMore;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args ){
        Scanner tool = new Scanner(System.in);

        //Declaring strings
        String name;
        String number = "15";

        //Asking
        System.out.println("Whats your name");
        name = tool.nextLine();
        System.out.printf("Hello %s! \nplease enjoy this like %s", name, number);
        tool.close();

    }
}
