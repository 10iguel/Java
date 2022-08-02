/*
 * Program/Project: Lab2a
 * Your Names: Bohdan Yurchenko and Olivia Jaime
 * Date: 
 * Instructor:
 * Description:
*/

package week02;

import java.util.Scanner;

public class Lab2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Scanner in = new Scanner (System.in);
		
	
	//Declaring strings
	String name = "";
	String dessert = "";
	String season = "";
	String country = "";
	String donate = "";
	String disease = "";
	String perfume = "";
	
	//Asking for the user's name 
	System.out.println("What's your name?");
	name = in.nextLine();
	System.out.println("Hello " + name + "!");
	
	//Asking for the favorite dessert
	System.out.println("What is your favourite dessert? ");
	dessert = in.nextLine();
	System.out.println("I hope you like coding Java as much as you like " + dessert);
	
	//Asking for the favorite season
	System.out.println("What is your favourite season of the year? ");
	season = in.nextLine();
	System.out.println("So you like " + season + "! I like " + season + " too!");
		
	//Asking for best country
	System.out.println("What is the best country in the world? ");
	country = in.nextLine();
	System.out.println("Wrong! The best country is Ukraine! " + country + " sucks!");
	
	//Asking about Five Nights at Freddy's
	System.out.println("Do you like Five Nights at Freddy's? ");
	in.nextLine();
	System.out.println("Would you be interested in donating 20 bucks to the programmers so we can buy a really cool game about Five Nights at Freddy's? ");
	donate = in.nextLine();		
	System.out.println(donate + "? Understandable.");
		
	//Asking about diseases
	System.out.println("What disease do you hate the most? ");
	disease = in.nextLine();
	System.out.println("What?! I love " + disease + "!");
		
	//Asking about perfume
	System.out.println("What is your favorite perfume? ");
	perfume = in.nextLine();
	System.out.println("Oh I heard " + perfume + " smells good.");
	System.out.println("Thnak you for answering my questions, have a good day.");
	
	in.close();
	}

}
