public class JFT6Ex9 {

	// main method
	public static void main(String[] args) {

		double temp = 14.19;

		if (temp >= 20) {
			System.out.println("Tropical Temperature");
		}
		if ((temp <= 19) && (temp >= 10)) {
			System.out.println("Warm Temperature");
		}
		if ((temp <= 9) && (temp >= 0)) {
			System.out.println("Moderate Temperature");
		}
		if ((temp >= -4) && (temp <= -1)) {
			System.out.println("Cold Temperature");
		}
		if (temp <= -5) {
			System.out.println("Artic Temperature");
		}

	}

}
