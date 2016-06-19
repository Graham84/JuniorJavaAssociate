public class JFT14Ex3 {
	public static void main(String[] args) {
		byte[] numbers = new byte[6];
		
		numbers[0] = 6;
		numbers[1] = 5;
		numbers[2] = 4;
		numbers[3] = 3;
		numbers[4] = 2;
		numbers[5] = 1;
		
		try {
			System.out.println(numbers[2500]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Unable to access data. Bad array index.");
		}
		
	}	//main
	
}	//class