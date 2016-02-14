/*
 * Written by: Graham Ó Síocháin
 * 
 * Date:30/12/15
 * 
 * Purpose: Java program which determines if a person is entitled to vote. A person is entitled to vote if they are aged 18 years or over
 */
public class JFT8Ex12 {

	public static void main(String[] args) {

		// ages array
		int[] ages = { 34, 16, 31, 19, 30, 19, 32, 11, 12, 13 };
		String[] names = { "John Welsh", "Frank Hayes", "Anna Davies",
				"Jennifer Burns", "Francis Burke", "Fred Smith",
				"Phillipa Smith", "Jason Button", "Ian Hayes", "Derva Conway" };

		
		// loop through ages array
		for (int i = 0; i < ages.length; i++) {
			
			// if age is less than 18
			if (ages[i] < 18) {
				continue;
			}
			//else not needed for loop is looping
			System.out.println(names[i]+ ", you are eligible to vote. Proceed to your polling station.");
		}
	}

}


//else print out the name at the same location in the names array
/*else {
System.out.println(names[i]+ ", you are eligible to vote. Proceed to your polling station.");
}*/