public class IndexOf {
	
	public static void main (String[] args) {
		
		String custName = "Sally Smith";
		String firstName;
		int spaceIndex;
		
		// Get the index of the space character
		spaceIndex = custName.indexOf(" ");		//5
		
		//Use the substring method to locate first name
		firstName = custName.substring(0, spaceIndex);
		
		System.out.println(spaceIndex);
		System.out.println(firstName);
		
	}
}