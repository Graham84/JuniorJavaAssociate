import java.util.InputMismatchException;
import java.util.Scanner;

public class JFT14Ex5 {
	public static void main(String[] args) {
		int charIndex;
		boolean exitApp = false;

		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter Msg:");
		String message = keyboardInput.nextLine();

		while (!exitApp) {

			try {
				System.out.print("Select an index:");

				if ((charIndex = keyboardInput.nextInt()) > -1
						&& charIndex <= message.length()) {
					System.out.println("You picked :"
							+ message.charAt(--charIndex));

				} else if (charIndex > message.length()) {
					System.out
							.println("Index is to high select a number between 1 - "
									+ message.length());

				} else if (charIndex < 0) {
					System.out.println("Exiting application..");
					exitApp = true;
				}

			} catch (InputMismatchException e) {
				System.out.println("Error : invalid int try again");
				/*
				 * Scanner needs to cleared with next() otherwise you will get
				 * an endless loop because invalid int is still in buffer so to
				 * say.
				 */
				keyboardInput.next();
			}
		}

	}

}
