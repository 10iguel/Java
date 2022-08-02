/*
 * Project: Lab10d Student Test Grades
 * Date: 03/15/2022
 * Names: Paola Aguiniga and Olivia Jaime
 * Class: CS 105 02
 * Description: This code organizes the grades of the students according to each test.
 */

package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab10d {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		ArrayList<String[]> classRoster = new ArrayList<String[]>();
		File grades = new File("Student Test Grades.csv");
		Scanner myReader = new Scanner(grades);

		try {
			myReader = new Scanner(grades);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}

		String[] myArray = myReader.nextLine().split(",");

		System.out.println("---------------------------------------------");
		System.out.printf("%-15s      %6s  %6s  %6s\n", myArray[0], myArray[1], myArray[2], myArray[3]);
		System.out.println("---------------------------------------------\n");

		while (myReader.hasNextLine()) {
			classRoster.add(myReader.nextLine().split(","));
		}
			
		myReader.close();

		for (int i = 0; i < classRoster.size(); i++) {
			String[] linesToPrint = classRoster.get(i);
			System.out.printf("%-20s\t", linesToPrint[0]);

			for (int j = 1; j < linesToPrint.length; j++) {
				String myGrades = "";
				int grade = Integer.parseInt(linesToPrint[j]);

				if (grade > 94)
					myGrades = "A";

				else if (grade > 90)
					myGrades = "A-";

				else if (grade > 87)
					myGrades = "B+";

				else if (grade > 84)
					myGrades = "B";

				else if (grade > 80)
					myGrades = "B-";

				else if (grade > 77)
					myGrades = "C+";

				else if (grade > 74)
					myGrades = "C";

				else if (grade > 70)
					myGrades = "C-";

				else if (grade > 67)
					myGrades = "D+";

				else if (grade > 64)
					myGrades = "D";

				else if (grade > 60)
					myGrades = "D-";

				else
					myGrades = "E";

				System.out.printf("%s\t", myGrades);

			}

			System.out.println();

		}

	}// End of main()

}