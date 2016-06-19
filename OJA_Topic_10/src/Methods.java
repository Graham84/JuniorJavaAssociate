
public class Methods {

	public static void main(String[] args) {

		sayHelloWorld();
		sayHelloWorld();
		
		sayHelloTo("John");
		sayHelloTo("Nan");
		
		int x = returnFive();
		System.out.println(x);
		
		int result = square(x);
		System.out.println(result);
		int result1 = square(7);
		System.out.println(result1);
		int result2 = square(returnFive());
		System.out.println(result2);
		
		System.out.println(square(4));
		System.out.println(square(returnFive()));
		
		
	}
	
	// this method simply says "Hello World!"
	static void sayHelloWorld() {
		System.out.println("Hello World!");
	}
	
	// this method will say hello to whatever name is passed when called
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}

	// this method returns an int type with the value 5
	static int returnFive() {
		return 5;
	}
	
	// f(x) = x * x
	// this method both return a value, and takes in data
	static int square(int x) {
		return x * x;
	}
	
}
