import java.text.DecimalFormat;
import java.util.Scanner;

public class JFT13Ex3 {
	
	public static void main (String[] args) {
		
		//Create a new scanner object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Decimal place formatting
		DecimalFormat df = new DecimalFormat(".00");
		
		double amount = 0.0;
		
		
		//Notice the use of the print and not the println method.
		// This keeps the cursor flashing on the same line, awaiting user input.
		System.out.print("Please, enter a decimal number");
		
		//Usethe nextDouble() method of theScannerobject.
		//The user enters a double and it is stored in the purchaseAmount variable.
		amount = input.nextDouble();
		
		//Output
		System.out.println("Using decimal format object: " + df.format(amount));
		System.out.printf("Using printf() method: %.2f", Double.valueOf(amount));
		
	}
	
	
	
}