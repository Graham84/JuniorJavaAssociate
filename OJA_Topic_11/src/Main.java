/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 12/01/16
 * 
 * Purpose: Java program to test the human, adult, child & baby classes
 */

public class Main {
	public static void main(String[] args) {

		Human h = new Human("Graham Ó Síocháin", 30, "Male", 5.1f, 11.0f);
		System.out.println(h.toString());
		System.out.println(h.sleep());
		System.out.println(h.eat());
		System.out.println(h.swim());
		System.out.println("");

		Adult a = new Adult("Billy white", 30, "Male", 6.5f, 11.0f, "5645614F",
				"Software Developer", true, true);
		System.out.println(a.toString());
		System.out.println(a.eat());
		System.out.println(a.drive());
		System.out.println("");

		Child c = new Child("Frank Davis", 3, "Male", 1.5f, 3.0f, "N/A");
		System.out.println(c.toString());
		System.out.println(c.eat());
		System.out.println(c.swim());
		System.out.println("");

		Baby b = new Baby("Gillian Taylor", 1, "Female", 0.6f, 1.0f, true);
		System.out.println(b.toString());
		System.out.println(b.sleep());
		System.out.println(b.swim());
	}

}
