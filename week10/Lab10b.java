/*
 * Program: 10b
 * Names: Olivia Jaime and Paola Aguiniga
 * Date: 03/10/2022
 * Instructor: Jeff Light
 * Description: Student Assignments - Part 2 - Display File Contents
 */
package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File studentScores = new File("Student Assignment Scores.csv");

		try {
			Scanner myReader = new Scanner(studentScores);

			String myString = myReader.nextLine();
			String[] header = myString.split(",");

			System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", header[0], header[1], header[2], header[3], header[4], header[5], header[6]);
			System.out.print("-------------------------------------------------------------------------\n");

			// Prints out names and scores after removing the commas
			while (myReader.hasNextLine()) {
				String[] data = (myReader.nextLine()).split(",");
				System.out.printf("%-30s%7s%7s%7s%7s%7s%7s\n", data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
			}// End of while
			myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}// End of main
	
}// End of class