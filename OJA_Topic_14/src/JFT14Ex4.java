import java.util.InputMismatchException;
import java.util.Scanner;

public class JFT14Ex4 {
	public static void main(String[] args) {

		// Create a new scanner object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// declare, intialise & populate array
		String[] counties = new String[] { "Cork", "Athlone", "Limerick",
				"Sligo", "Dublin" };

		// enhanced for loop print array to screen - index added
		System.out.println("The following holiday destinations are available");
		int index = 1;
		for (String c : counties) {
			System.out.println((index++) + ": " + c);
		}
		System.out.print("Enter a number to make your selection: ");

		int position;

			try {
				position = input.nextInt();
				position -= 1;
				System.out.println("You will have a great time in: "
						+ counties[position]);

			}

			catch (InputMismatchException e) {
				System.out.println("Incorrect data value entered");

			}

			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("A value from 1 - 5 must be entered");

			}
	}
}
