/**
 * Program/Project:Lab-13b
 * Your Name: Olivia Jaime and Rolando Gutierrez
 * Date: 03/31/2022
 * Instructor: Jeff Light
 * Description: Creating a Form Letter
 */

package week13;

import java.io.*;
import java.util.*;

public class Lab13b {

	public static void main(String[] args) {
		// Declare variables
		Scanner assignmentGrades = null;
		Scanner letter = null;
		String FILENAME = null;
		String[] grades = null;
		PrintWriter writer = null;
		File letterToStudent = null;
		
		//Import files
		File studentGrades = new File("Student Assignment Scores.csv");
		File warningLetter = new File("Warning Letter to Student -.txt");
		
		//Try/catch for studentGrades
		try {
		assignmentGrades = new Scanner(studentGrades);
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(0);
		}
		
		//Try/catch for warningLetter
		try {
		letter = new Scanner(warningLetter);
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");	
			System.exit(0);
		}
		
		//Read warning letter into a string
		letter.useDelimiter("\\Z");
		String warning = letter.next();
		letter.close();
		
		// Say we will write letters
		System.out.println("Creating Letters for: ");
		
		//Store lines into array
		while(assignmentGrades.hasNextLine()){
			grades = (assignmentGrades.nextLine().split(","));
			
			//Check which students have 0
			for (int i = 0; i < grades.length; i++) {
				if(grades[i].contains("0")) {
					// Create file
					FILENAME = ("Warning Letter To Student-" + grades[i] + ".txt");
					letterToStudent = new File(FILENAME);
					
					// Open file for writing
					try {
						writer = new PrintWriter(letterToStudent);
					}catch(Exception e) {
						System.out.printf("File <%s> not found.%n", FILENAME);
					}
				
					// Start writing letter
					System.out.println(grades[i]);
					
					writer.printf("Dear %s,%n%s", grades[i], warning);
				}
			}
		}
	}// End of main

}// End of class
