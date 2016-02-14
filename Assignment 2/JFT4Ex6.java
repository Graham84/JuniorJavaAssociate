/*
 * Written by: Graham Ó Síocháin
 * 
 * Date:22/11/15
 * 
 * Purpose: Java program to display the count of the note breakdown:
 * 
 */
public class JFT4Ex6 {

	public static void main(String[] args) {

		int i = 57;
		int a = 20;
		int b = 10;
		int c = 5;
		int d = 1;
		int twenties = (i / a);
		int tens = (i - (a * twenties)) / b;
		int fives = (i - (a * twenties) - (b * tens)) / c;
		int singles = (i - (a * twenties) - (b * tens) - (c * fives)) / d;

		System.out.println("Sum of money is: €" + i);
		System.out.println("No. of 20's: " + twenties);
		System.out.println("No. of 10's: " + tens);
		System.out.println("No. of 5's: " + fives);
		System.out.println("No. of 1's: " + singles);

	}

}
