package week02;

import java.util.*;

public class Expenses {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Variables
        String firstName ="";
        String lastName ="";
        double hoursWorked;
        double hourPay;
        double federalTax;
        double stateTax;
        //Var in math
        double grossPay;
        double federal;
        double state;
        double deductions;
        double netPay;

        System.out.println("Please enter the employee's first name:");
        firstName =scanner.nextLine();
        System.out.println("Please enter the employee's last name:");
        lastName =scanner.nextLine();
        System.out.println("Please enter the number of hours worked this week:");
        hoursWorked = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the employee's hourly pay rate:");
        hourPay = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the employee's federal tax rate percentage:");
        federalTax = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the employee's state tax rate percentage:");
        stateTax = Double.parseDouble(scanner.nextLine());

        //Math
        grossPay = hourPay * hoursWorked;
        federal = grossPay * (federalTax /100);
        state = grossPay * (stateTax /100);
        deductions = federal + state;
        netPay = grossPay - deductions;

        System.out.printf("Employee information for %s %s \n", firstName, lastName);
        System.out.printf("Hours Worked: %.1f \n", hoursWorked);
        System.out.printf("Pay Rate: $%.1f \n", hourPay);
        System.out.printf("Gross Pay: $%.1f \n", grossPay);
        System.out.println("Deductions");
        System.out.printf("\t Federal Withholding: $%.1f \n", federal);
        System.out.printf("\t State Withholding: $%.1f \n", state);
        System.out.printf("\t Total Deductions: $%.1f \n", deductions);
        System.out.printf("Net Pay $%.1f", netPay);
    }
}
