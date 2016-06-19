public class StringQuiz {
	
	public static void main(String [] args) {
		
		String quote = "The sea is an angry dog";
		String quote2 = "The sea is an angry dog";
		String quote3 = new String("The sea is an angry dog");
		
		System.out.println(quote == quote2);
		System.out.println(quote2 == quote3);
		System.out.println(quote == quote3);
		
	}
}