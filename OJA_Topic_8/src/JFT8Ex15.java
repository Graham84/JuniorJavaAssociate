/*
 * Written by: Graham Ó Síocháin
 * 
 * Date:30/12/15
 * 
 * Purpose: Java program, which prints out all the even numbers from 1 to 100.
 */

public class JFT8Ex15 {

	public static void main(String[] args) {

		// intialise even variable
		int even = 0;

		// dowhile loop
		do {
			// if even = 0 add 2 and continue
			if (even == 0) {
				even += 2;
				continue;
			}
			// else print even variable and add 2
			else {
				System.out.print(even + " ");
				even += 2;
			}
		}
		// continue looping while variable is less than 100
		while (even <= 100);

	}

}
