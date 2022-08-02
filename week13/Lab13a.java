package week13;

import java.io.*;
import java.util.Scanner;

public class Lab13a {

	public static void main(String[] args) {
		// Declare variables
		Scanner myReader = null;
		PrintWriter writerInvalid = null;
		PrintWriter writerValid = null;
		String FILENAME1 = "invalidpwd.txt";
		String FILENAME2 = "validpwd.txt";
		String password = ("");
		String location = ("C:\\MyLDSBC\\CS105\\eclipse-workspace\\CD105\\");
		
		// Import file
		File pwd = new File ("Pwd.txt");
		
		// Create scanner
		try {
			myReader = new Scanner(pwd);
		}catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(0);
		}
		
		// Create files
		File invalidpwd = new File(FILENAME1);
		File validpwd = new File(FILENAME2);
		
		System.out.println("Beginning password analysis....");
		
		// Open files for writing
		System.out.println("Opening file 'Pwd.txt'.");
		try {
			writerInvalid = new PrintWriter(invalidpwd);
		}catch(Exception e) {
			System.out.printf("File <%s> not found.%n", FILENAME1);
		}
		
		try {
			writerValid = new PrintWriter(validpwd);
		}catch(Exception e) {
			System.out.printf("File <%s> not found.%n", FILENAME2);
		}
		
		// Evaluate password
		do{
			password = (myReader.nextLine());
			if((password.length()) < 8) {
				writerInvalid.printf("%-12s Invalid Password!   Must be at least 8 characters long.%n", password);
			}
			else if(!hasUpper(password)) {
				writerInvalid.printf("%-12s Invalid Password!   Must contain at least one UPPERCASE character.%n", password);
			}
			else if(!hasLower(password)) {
				writerInvalid.printf("%-12s Invalid Password!   Must contain at least one LOWERCASE character.%n", password);
			}
			else if(!hasNumber(password)) {
				writerInvalid.printf("%-12s Invalid Password!   Must contain at least one NUMBER.%n", password);
			}
			else if(!hasSpecial(password)) {
				writerInvalid.print(password + "    Invalid Password!   Must contain at least one of {@, #, %, -, &, *}.\n");
			}
			else{
				writerValid.println(password);
			}
		}while (myReader.hasNextLine());
		
		// Close files
		System.out.println("Analysis complete. Closing files.");
		myReader.close();
		writerInvalid.close();
		writerValid.close();
		
		System.out.printf("Results can be found in files '%s' and '%s' in the %s directory.", FILENAME1, FILENAME2, location);
		
	}// End of main()

	
	public static boolean hasUpper(String pwd) {
		for(int i = 0; i < pwd.length(); i++) {
			if(Character.isUpperCase(pwd.charAt(i))){
				return true;
			}// End of if
		}// End of for
		return false;
	}// End of hasUpper
	
	
	public static boolean hasLower(String pwd) {
		for(int i = 0; i < pwd.length(); i++) {
			if(Character.isLowerCase(pwd.charAt(i))){
				return true;
			}// End of if
		}// End of for
		return false;
	}// End of hasLower
	
	
	public static boolean hasNumber(String pwd) {
		for(int i = 0; i < pwd.length(); i++) {
			if(Character.isDigit(pwd.charAt(i))){
				return true;
			}// End of if
		}// End of for
		return false;
	}// End of hasUpper
	
	
	public static boolean hasSpecial(String pwd) {
		String specials = ("@#%-&*");
		for(int i = 0; i < pwd.length(); i++) {
			String word = (Character.toString(pwd.charAt(i)));
			if(specials.contains(word)){
				return true;
			}// End of if
		}// End of for
		return false;
	}// End of hasUpper
	
}// End of class
