public class StringQuiz2 {
	
	public static void main(String [] args) {
		
		String quote = "The sea is an angry dog";
		String quote2 = "The sea is an angry dog";
		String quote3 = new String("The sea is an angry dog");
		String quote4 ="The ocean is an angry dog";
		
		System.out.println(quote.equals(quote2));
		System.out.println(quote2.equals(quote3));
		System.out.println(quote2.equals(quote4));
		
	}
}