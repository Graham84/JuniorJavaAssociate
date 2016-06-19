public class Main {
	
	public static void main (String[] args) {
		
		Pizza p1 = new Pizza();
		p1.size = "Small";
		p1.toppings = "Ham and Pineapple";
		p1.diameter = 12.00;
		p1.price = 10.00;
		
		Pizza p2 = new Pizza();
		p2.size = "Medium";
		p2.toppings = "Chicken and Mushroom";
		p2.diameter = 14.00;
		p2.price = 12.00;
		
		Pizza p3 = new Pizza();
		p3.size = "Large";
		p3.toppings = "Tuna and Sweetcorn";
		p3.diameter = 16.00;
		p3.price = 14.00;
		
		System.out.println(p1.toString());
		System.out.println(p1.eat());
		System.out.println(p2.toString());
		System.out.println(p2.eat());
		System.out.println(p3.toString());
		System.out.println(p3.eat());
		
		VowelCount vc = new VowelCount();
		vc.vowelCount("Hello");
		
	} //main method
	
} //class