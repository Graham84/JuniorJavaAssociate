public class PrintF {
	public static void main(String[] args) {
		
		//printf() String
		// the format string specifies that the printf() method should output two strings(%s), each followed by a newline character(%n)
		System.out.printf("%s\n%s\n","Hello","World!");		//ouputs Hello World! on seperate lines
		
		System.out.printf("Team %s is the same as team %s.\n", "Spurs", "Spurs");	//prints Team Spurs is the same as team Spurs
		
		//printf() integers
		System.out.printf("%d\n", 26);	//prints 26
		
		int number1 = 10;
		int number2 = 20;
		System.out.printf("Sum is %d\n", (number1+number2)); // Line 1

		if ( number1 == number2 ){
			System.out.printf( "%d == %d\n", number1, number2 ); // Line 2
		}
		
		if ( number1 != number2 ){
			System.out.printf( "%d != %d\n", number1, number2 ); // Line 3
		}

		if ( number1 < number2 ){
			System.out.printf( "%d < %d\n", number1, number2 );  // Line 4
		}
		
		if ( number1 > number2 ){
			System.out.printf( "%d > %d\n", number1, number2 );  // Line 5
		}

		if ( number1 <= number2 ){
			System.out.printf( "%d <= %d\n", number1, number2 ); // Line 6
		}
		
		if ( number1 >= number2 ){
			System.out.printf( "%d >= %d\n", number1, number2 ); // Line 7
		}
		//output	Sum is 30
		//			10 != 20
		//			10 < 20
		//			10 <= 20
		
		System.out.printf("The end start again.%n%s", "Started back.");
		
	}	//main
	
}	//class