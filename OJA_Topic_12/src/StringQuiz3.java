public class StringQuiz3 {
	
	public static void main(String [] args) {
		
		String quote = "The sea is an angry dog";
		String quote2 = "The sea is an angry dog";
		String quote3 = new String("The sea is an angry dog");
		String quote4 ="The ocean is an angry dog";
		
		System.out.println(quote.compareTo(quote2));	//0
		System.out.println(quote2.compareTo(quote3));	//0
		System.out.println(quote3.compareTo(quote4));	//+4
		System.out.println(quote4.compareTo(quote3));	//-4
	}
}