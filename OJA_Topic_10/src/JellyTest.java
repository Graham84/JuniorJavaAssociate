public class JellyTest {
	
	public static void main (String [] args) {
	
		Jelly j1 = new Jelly("Chivary", 3.50f, "Strawberry", 24, "25/06/2016");
		Jelly j2 = new Jelly("Nestles", 3.42f, "Banana", 26, "27/07/2016");
		Jelly j3 = new Jelly("Danones", 3.00f, "Lemon", 28, "28/06/2015");
		
	
		System.out.println(j1.toString());
		System.out.println(j1.setInstructions());
		System.out.println(j2.toString());
		System.out.println(j2.setInstructions());
		System.out.println(j3.toString());
		System.out.println(j3.setInstructions());
		
		
	
	}
}