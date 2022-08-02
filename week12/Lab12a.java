/**
 * Program/Project: Lab12a Shopping List - Part 3
 * Your Name: Blanca Acevedo, Olivia Jaime and Natalie Rogers
 * Date: 03/23/2022
 * Instructor: Jeff Light
 * Description: Saving a Shopping List to Persistent Storage
 */

package week12;

import java.io.*;
import java.util.*;

public class Lab12a {
	/**
	 * main() method displays a menu to the user and asks them to select a command.
	 * The method will continue to display the menu to the user until they wish to
	 * quit by selecting 'Exit' from the menu. The method also creates a new, empty
	 * shoppingList of type ArrayList<String> Based on the user input, the
	 * appropriate method will be called to perform actions on the shoppingList.
	 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
	 */
	public static void main(String[] args) {
		// Initialize variables
		Scanner sIn = new Scanner(System.in); // Input Scanner for String
		ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
		String choice; // Holds user input of type String
		boolean done = false; // Keeps program running until user wants to quit
		String FILENAME = "Shopping List";

		// Keep running the program until the user quits
		do {
			// Print out the menu to the console
			System.out.println();
			System.out.println("1. Add Items");
			System.out.println("2. Delete Items");
			System.out.println("3. Show Items");
			System.out.println("4. Sort Items");
			System.out.println("5. Save List");
			System.out.println("6. Exit");
			System.out.print("Please enter a command: ");
			choice = sIn.nextLine();

			// Call the appropriate method for the choice selected.
			switch (choice) {
			case "1": // Add items to the Shopping List
				System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
				break;
			case "2": // Delete items from the Shopping List
				System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
				break;
			case "3": // Show the items in the Shopping List
				showItems(shoppingList);
				break;
			case "4": // Sort the items in the Shopping List
				sortItems(shoppingList);
				break;
			case "5": // Saving a Shopping List to Persistent Storage
				saveList(sIn, shoppingList, FILENAME);
				break;
			case "6": // Exit the program
				System.out.println("\nGoodbye");
				done = true;
				break;
			default: // Handles all input that is not between 1-5
				System.out.println("Invalid response.  Please enter a choice from the menu (1-6).");
			} // End of switch (choice)
		} while (!done); // Keep running the program until the user quits
	}// end of main()

	/**
	 * addItems() method asks the user to enter an item to be stored in the
	 * shoppingList and then adds the item to the shoppingList ArrayList. The user
	 * may enter as many items as they want, hitting ENTER to stop entering items
	 * and return to main(). Each time the user enters an item into the list, a
	 * message will be displayed showing the item entered in the following format:
	 * '<item>' has been added to the Shopping List. [Example: 'Eggs' has been added
	 * to the Shopping List.] Returns the number of items added to the shoppingList
	 */
	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
		String answer = "";
		String itemName = "";
		String itemAmount = "";
		String trimItem = "";
		int colonIndex = 0;
	
		int currentSize = shoppingList.size();
		boolean done = false;
		
		
		do {
			System.out.print("\nAdd an item to the list (or just hit 'ENTER' when done): ");
			answer = sIn.nextLine();
			if (answer != "") {
				if(answer.contains(":")) {
					colonIndex = answer.indexOf(":");
					itemName = answer.substring(0, colonIndex).trim();
					itemAmount = answer.substring(colonIndex + 1, answer.length()).trim();
					trimItem = (itemName + ":" + itemAmount);
					System.out.printf("'%s' has been added to the Shopping List.%n", trimItem);
					shoppingList.add(trimItem);
				} else {
					System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'\r");
				}				
			} else {
				done = true;
			}
		} while (!done);
		return shoppingList.size() - currentSize;

	}// end of addItems()
	
	/**
	 * deleteItems() method asks the user to enter an item to be deleted from the
	 * shoppingList and then deletes the item from the shoppingList ArrayList. The
	 * user may delete as many items as they want, hitting ENTER to stop deleting
	 * items and return to main(). Each time the user deletes an item from the list,
	 * a message will be displayed showing the item deleted in the following format:
	 * '<item>' has been deleted to the Shopping List. [Example: 'Peaches' has been
	 * deleted to the Shopping List.] If the user tries to delete an item not in the
	 * list, a message will be displayed indicating the error and showItems() will
	 * be called. Returns the number of items deleted from the shoppingList
	 */
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
		String answer = "";
		int count = 0;
		boolean done = false;
		do {
			System.out.print("Delete an item from the list (or just hit 'ENTER' when done): ");
			answer = sIn.nextLine();
			if (answer != "") {
				if (!shoppingList.contains(answer)) {
					System.out.printf("Invalid response! '%s' is NOT an item in the list.%n", answer);
					showItems(shoppingList);
				} else {
					shoppingList.remove(answer);
					System.out.printf("'%s' has been deleted from the Shopping List.%n%n", answer);
					count++;
				}
			} else {
				done = true;
			}
		} while (!done);
		return count;

	}// end of deleteItems()
	
	/**
	 * showItems() method simply displays the contents of the shoppingList ArrayList
	 * in it's simplest form: Example output:
	 * 
	 * The Shopping List contains the following items: [item-1, item-2, item-n]
	 */
	public static void showItems(ArrayList<String> shoppingList) {
		System.out.println("\r\nThe Shopping List contains the following items: \r\n");
		System.out.println("----------------------------------------");
		System.out.printf("%12s Shopping List\t%n", "");
		System.out.println("----------------------------------------");
		for(String item : shoppingList) { 
			int colonIndex = item.indexOf(":");
			String itemName = item.substring(0, colonIndex).trim();
			String itemAmount = item.substring(colonIndex + 1, item.length()).trim();
			System.out.printf("%5s%-10s%18s%n%n", "", itemName, itemAmount);
		}
		System.out.println("----------------------------------------");
	}// end of showItems()
	
	/**
	 * sortItems() method sorts the items in the shoppingList ArrayList, then calls
	 * showItems() to display the sorted list. Example output: The Shopping List has
	 * been sorted.
	 * 
	 * The Shopping List contains the following items: [item-1, item-2, item-n]
	 */
	public static void sortItems(ArrayList<String> shoppingList) {
		Collections.sort(shoppingList);

		System.out.println("The Shopping List has been sorted. \r\n");
		showItems(shoppingList);
	}// end of sortItems()
	
	/**
	 * saveList() method asks the user if they wish to rewrite the existing document
	 * and if the answer is Y, prints the formated ArrayList in a file and a message
	 * to the user notifying about the change. If they do not want to rewrite the
	 * file, it prints the corresponding message.
	 */
	public static void saveList(Scanner sIn, ArrayList<String> shoppingList, String FILENAME) {
		File outFile = new File(FILENAME);
		PrintWriter writer = null;
		boolean valid = false;
		String answer = "";
		
		do {
			System.out.printf("%nAre you sure you wish to overwrite the '%s.txt' file with your current list? (Y/N) ", FILENAME);
			answer = sIn.nextLine();
		
			if(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
				valid = true;
			}else {
				System.out.println("Invalid response. Please enter <Y> or <N>.");
			}
		}while(!valid);
		
		try {
			writer = new PrintWriter(outFile);
		}catch(Exception e) {
			System.out.printf("File <%s> not found.%n", FILENAME);
		}
			
		if (answer.equalsIgnoreCase("Y")) {
			writer.println("\r\nThe Shopping List contains the following items: \r\n");
			writer.println("----------------------------------------");
			writer.printf("%12s Shopping List\t%n", "");
			writer.println("----------------------------------------");
			for(String item : shoppingList) { 
				int colonIndex = item.indexOf(":");
				String itemName = item.substring(0, colonIndex).trim();
				String itemAmount = item.substring(colonIndex + 1, item.length()).trim();
				writer.printf("%5s%-10s%18s%n%n", "", itemName, itemAmount);
			}
			writer.println("----------------------------------------");
			System.out.printf("Shopping List saved to file: %s.txt.%n", FILENAME);
		}else {
			System.out.println("\nShopping List not saved.");
		}
		
		writer.close();
	}// End of saveList()

}// End of class
