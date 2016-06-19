import java.util.InputMismatchException;
import java.util.Scanner;

public class JFT14Ex2 {
	public static void main(String[] args) {
		
		//Create a scanner
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		//variables
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			System.out.println("Enter numerator...");
			num1 = scanner.nextInt();
			
			System.out.println("Enter denominstor...");
			num2 = scanner.nextInt();
			
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + " = " + result);
			
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception You cannot divide by 0. Program closing.");
		}
		
		catch(InputMismatchException e) {
			System.out.println("Please enter a whole number");
		}
		
		System.out.println("After the exception handling code...");
		
		
	}
}