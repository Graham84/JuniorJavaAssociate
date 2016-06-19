class Person {
	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)
	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello, my name is " + name + ". I am " + age
					+ " years old.");
		}
	}
	
	void sayHello() {
		System.out.println("Hello there");
	}
}

public class App {

	public static void main(String[] args) {

		// Create a Person object using the Person class
		Person person1 = new Person();
		person1.name = "Graham";
		person1.age = 32;
		person1.speak();
		person1.sayHello();

		// Create a second Person object using the Person class
		Person person2 = new Person();
		person2.name = "Dean";
		person2.age = 12;
		person2.speak();
		person2.sayHello();

		System.out.println(person1.name);

	}

}
