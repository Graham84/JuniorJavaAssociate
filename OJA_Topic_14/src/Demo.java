import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo{
	public static void main(String[] args){
		// Create a Scanner Object
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		// Create variables to hold user entered values
		int numerator = 0;
		int denominator = 0;
		int result = 0;
		try
		{
			System.out.print("Enter numerator...");
			numerator = scanner.nextInt();
			System.out.print("Enter denominator...");
			denominator = scanner.nextInt(); 
			result = numerator / denominator;
			System.out.println(numerator + " / " + denominator + " = " + result);
		}
		catch (ArithmeticException e){
			System.out.println("You cannot divide by 0.");
		}
		catch (InputMismatchException e){
			System.out.println("Please enter a whole number.");
		}

		System.out.println("After the exception handling code.....");
	}// main
}// class