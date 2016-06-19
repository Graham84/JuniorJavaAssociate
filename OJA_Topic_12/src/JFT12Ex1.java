public class JFT12Ex1 {
	
	public static void main(String[] args) {
		
		String x = new String("Java");
		x = x.concat(" Rules");
		System.out.println("x = " + x);
		x = x.toUpperCase();
		System.out.println("x = " + x);
		x = x.replace('A','X');
		System.out.println("x = " + x);
		x = x.concat(" Rules!");
		System.out.println("x = " + x);
		
	}
}