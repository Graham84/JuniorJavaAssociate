public class Demo1 {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 12;
		numbers[2] = 14;
		numbers[3] = 16;
		numbers[4] = 17;

		try {
			System.out.println(numbers[55]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Bad array index.");
		}

		// System.out.println(numbers[55]);
		// Generates an ArrayIndexOutOfBounds Exception
	}// main
}// class