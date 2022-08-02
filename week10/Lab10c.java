/*
 * Program: 10c
 * Names: Olivia Jaime and Paola Aguiniga
 * Date: 03/10/2022
 * Instructor: Jeff Light
 * Description: Student Assignments - Part 3 - Display File Contents
 */
package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File studentScores = new File("Student Assignment Scores.csv");
		
		try {
			Scanner myReader = new Scanner(studentScores);
			
			String myString = myReader.nextLine();
			String[] header = myString.split(",");
			
			System.out.printf("%-15s%6s%n", header[0],"Assignments with 0");
			System.out.print("-----------------------------------\n");
			
			while (myReader.hasNextLine()) {
				String[] data = (myReader.nextLine()).split(",");
				for (int i = 0; i< data.length; i++) {
					if (data[i].equals("0")) {
						System.out.printf("%-20s%6s\n", data [0], i);
					}
				} // End of for loop				
			} // End of while loop
			myReader.close();	
		}catch (FileNotFoundException e) {
			System.out.println("File not found.");		
		}		
	}// End of main()
	
}// End of class