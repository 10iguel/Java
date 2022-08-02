package testingMore;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args ){
        Scanner tool = new Scanner(System.in);

        //Declaring strings
        String name;
        String number = "15";
        String country;
        String age;
        double ageInDog;

        int agetoChange;

        //Asking
        System.out.println("Whats your name");
        name = tool.nextLine();
        System.out.printf("Hello %s! \nplease enjoy this like %s", name, number);

        System.out.println("\nWhat country are you from?");
        country = tool.nextLine();
        System.out.printf("Nice country, I like %s\n",country);

        if (country.equalsIgnoreCase("brazil")){
            System.out.println("Personally is my favorite");
        }else{
            System.out.println("Not my favorite, but good");
        }

        System.out.println("What is your age?");
        age = tool.nextLine();
        System.out.printf("Great age, %s \n", age);
        agetoChange  = Integer.parseInt(age);

        ageInDog = agetoChange * 7;

        System.out.println("You have "+ ageInDog+ " In live of the Dog");




        tool.close();

    }
}
