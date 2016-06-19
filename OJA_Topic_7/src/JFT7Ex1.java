public class JFT7Ex1 {

	public static void main(String args[]) {

		// declare string array and initialize with values in one step
		String[] months = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };

		// for loop
		for (int i = 0; i < months.length; i++) {
			System.out.print(months[i] + " ");
		}

		System.out.println(" ");

		//enhanced for
		for (String month : months) {
			System.out.print(month + " ");
		}
		System.out.println();
		System.out.println(months[2] + " " + months[9]);

	}

}
