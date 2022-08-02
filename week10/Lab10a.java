/*
 * Program: 10a
 * Names: Olivia Jaime and Paola Aguiniga
 * Date: 03/10/2022
 * Instructor: Jeff Light
 * Description: Student Assignments - Part 1 - Display File Contents
 */
package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File studentScores = new File("Student Assignment Scores.csv");

		try {
			Scanner myReader = new Scanner(studentScores);

			while (myReader.hasNextLine()) {
				System.out.println(myReader.nextLine());
			}
			myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

}