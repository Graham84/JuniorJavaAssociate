public class JFT14Ex1 {
	public static void main(String[] args) {
		String value = "two";
		int parsedValue = 0;
		
		try {
			parsedValue = Integer.parseInt(value);
			System.out.println(parsedValue);
		}
		catch(NumberFormatException e){
			System.out.println("Unable to parse data. Program closing");
		}
		
		
	}
}