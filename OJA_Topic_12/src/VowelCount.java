/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 10/01/16
 * 
 * Purpose: Java program to determine the number of vowels found in a piece of text
 */

public class VowelCount {

	// vowelCount method
	public String vowelCount(String message) {

		//int count = 0;
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;

		for (int x = 0; x < message.length(); x++) {

			if (message.charAt(x) == 'a') {
				a++;
				//count++;
			}

			if (message.charAt(x) == 'e') {
				e++;
				//count++;
			}

			if (message.charAt(x) == 'i') {
				i++;
				//count++;
			}

			if (message.charAt(x) == 'o') {
				o++;
				//count++;
			}

			if (message.charAt(x) == 'u') {
				u++;
				//count++;
			}
		}

		return "No. of vowels: " + (a + e + i + o + u) + "\na count: " + a
				+ "\ne count: " + e + "\ni count: " + i + "\no count: " + o
				+ "\nu count: " + u + "\n";

		// print statements
		// System.out.println("Number of vowels: " + count);
		// System.out.println("a count: " + a);
		// System.out.println("e count: " + e);
		// System.out.println("i count: " + i);
		// System.out.println("o count: " + o);
		// System.out.println("u count: " + u);

	} // end method

} // end class