/*
 * Written by: Graham Ó Síocháin
 * 
 * Date:22/11/15
 * 
 * Purpose:  Java program to determine the average age of five students
 * who are attending a training course
 * 
 */

public class JFT2Ex5 {

	public static void main(String[] args) {

		// method call
		average(24, 45, 21, 52, 30);

	}

	// method to add ages together and print out the average
	public static void average(int... ages) {
		int total = 0;
		// enhanced for loop adds each number to the total
		for (int x : ages) {
			total += x;
		}
		// method prints out the average
		System.out.println("Average age is: " + (int) total / ages.length);
	}

}
