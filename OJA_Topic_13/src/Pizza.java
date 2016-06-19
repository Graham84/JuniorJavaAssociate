public class Pizza {
	
	public String size;
	public String toppings;
	public double diameter;
	public double price;
	
	public String eat() {
		return "Eat a pizza slowly, it can choke you if you eat it too fast!";
	} //method
	
	public String toString() {
		return "Size: " + size + "\nToppings: " + toppings + "\nDiameter: " + diameter + "\nPrice: €" + price;
	} //method
	
}	//class