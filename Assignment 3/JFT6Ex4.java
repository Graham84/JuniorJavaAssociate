public class JFT6Ex4 {

	/*
	 * private static double withdraw = 200;
	 * private static double balance = 180;
	 */

	public static void main(String[] args) {

		checkBalance();
	}

	
	public static void checkBalance() {
		// variables
		double withdraw = 20;
		double balance = 180;

		if (withdraw <= balance) {
			balance -= withdraw;
			System.out.println("Please take your cash. Your bank balance is "
					+ balance);
		} else {
			System.out.println("Insufficient funds");
		}
	}

}
