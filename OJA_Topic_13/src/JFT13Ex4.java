/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 16/01/16
 * 
 * Purpose: Java program to calculate an employee’s weekly take home pay
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class JFT13Ex4 {

	public static void main(String[] args) {

		// Create a new scanner object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Decimal place formatting
		DecimalFormat df = new DecimalFormat(".00");

		double hourlyRate = 29.39;
		double overtimeRate = 1.5;

		String name;
		String PPS;
		String department;
		double hours;
		double overtime;

		double grossPay = 0.0;
		double incomeTax = 0.0;
		double basicWage = 0.0;
		double overtimeWage = 0.0;
		double tax = 0.0;
		double netPay = 0.0;

		// Notice the use of the print and not the println method.
		// This keeps the cursor flashing on the same line, awaiting user input.
		System.out.print("Enter employee name: ");

		// Use the nextLine() method of theScannerobject.
		// The user enters a double and it is stored in the name variable.
		name = input.nextLine();

		System.out.print("Enter employee PPS No: ");
		PPS = input.nextLine();

		System.out.print("Enter employee Department: ");
		department = input.nextLine();

		System.out.print("Enter basic hours worked: ");
		hours = input.nextDouble();

		System.out.print("Enter overtime hours worked: ");
		overtime = input.nextDouble();

		// Calculations
		basicWage = (hours * hourlyRate);
		overtimeWage = (overtime * overtimeRate * hourlyRate);
		grossPay = (basicWage + overtimeWage);

		if (grossPay > 2000) {
			incomeTax = 0.35;
		}

		if (grossPay <= 2000) {
			incomeTax = 0.2;
		}

		tax = (grossPay * incomeTax);
		netPay = (grossPay - tax);

		// Output
		System.out.println("********** Salary Report **********");
		System.out.println();
		System.out.println("********** Employee Details **********");
		System.out.println("Employee Name: " + name);
		System.out.println("Emplyee PPS No: " + PPS);
		System.out.println("Department Name: " + department);
		System.out.println();
		System.out.println("********** Hours Worked **********");
		System.out.println("Number of basic hours worked: " + hours);
		System.out.println("The hourly rate of basic pay is €" + df.format(hourlyRate));
		System.out.println("Basic salary: €" + df.format(basicWage));
		System.out.println("Number of overtime hours worked: "+ overtime);
		System.out.println("The overtime rate is " + overtimeRate+ " times normal pay.");
		System.out.println("Overtime salary: €" + df.format(overtimeWage));
		System.out.println();
		System.out.println("********** Take Home Pay **********");
		System.out.println("Gross Pay: €" + df.format(grossPay));
		//System.out.println("Income tax payable at " + (incomeTax * 100) +"%: is: " + df.format(tax));
		System.out.printf("Income tax payable at %.0f%% is: €%.2f", (incomeTax * 100),tax);
		System.out.println("\nNet Pay: €" + df.format(netPay));
		System.out.println();
		System.out.println("********** ************* **********");

	} // end main

} // end class