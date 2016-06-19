public class DogTest{
	public static void main(String[] args){
	
	Dog d1 = new Dog();
	d1.name = "Frodo";
	d1.age = 4;
	d1.breed = "Alsatian";

	Dog d2 = new Dog();
	d2.name = "Labby";
	d2.age = 3;
	d2.breed = "Labrador";
	
	Dog d3 = d2;
	d3.age = 6;
	
	System.out.println(d1.name);			// Answer? 
	System.out.println(d2.age);				// Answer? 
	System.out.println(d3.age);				// Answer?
	System.out.println(d1.age == d2.age);	// Answer? 
	System.out.println(d1 == d2);			// Answer? 
	System.out.println(d1 == d3);			// Answer? 
	System.out.println(d2 == d3);			// Answer?
	
	}// main
}// class