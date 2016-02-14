import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 01/02/16
 * 
 * Purpose: Java program  the user is prompted to enter a message and is then
 * asked to specify the position of a word to be extracted from the message
 */

public class JFT14Ex6 {

	public static void main(String[] args) {

		stringExtract();

	}

	public static void stringExtract() {

		int charIndex;
		boolean exitApp = false;

		@SuppressWarnings("resource")
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a message:");
		String message = keyboardInput.nextLine();
		// store message in an array
		String[] words = message.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replaceAll("[^\\w]", "");
		}

		while (!exitApp) {

			try {
				System.out
						.print("Enter the position of the word to extract: For Example: 2: ");

				if ((charIndex = keyboardInput.nextInt()) > -1
						&& charIndex <= words.length) {
					System.out.println("Extracted Word: " + words[--charIndex]);
					exitApp = true;

				} else if (charIndex > words.length + 1) {
					System.out.println("Enter a number between 1 and "
							+ words.length);

				} else if (charIndex < 0) {
					System.out.println("Exiting application..");
					exitApp = true;
				}

			}

			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Enter a number < " + words.length);
				keyboardInput.next();
			}

			catch (InputMismatchException e) {
				System.out.println("Enter a number not text");
				keyboardInput.next();
			}

		}

	}
}
