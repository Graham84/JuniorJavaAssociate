public class Main1 {

	public static void main(String[] args) {

		Car c1 = new Car("Subaru Hatchback", 53.45f, "89 C 4545", true);
		Car.noCarsSold++;
		System.out.println(c1.toString());
		System.out.println(c1.brake());
		System.out.println(c1.accelerate());
		System.out.println("");

		Car c2 = new Car();
		System.out.println(c2.toString());
		System.out.println("");
		c2.setManufacturer("Toyota Corolla");
		c2.setEngineSize(45.44f);
		c2.setRegNumber("90 C 4343");
		c2.setNCT(true);
		System.out.println(c2.toString());
		Car.noCarsSold++;
		System.out.println(c2.brake());
		System.out.println(c2.accelerate());

		System.out.println("");
		System.out.println(Car.noCarsSold + " cars have been produced");
		System.out.println("");

		Truck t1 = new Truck("Ford Transit");
		System.out.println(t1.toString());
		System.out.println(t1.brake());
		System.out.println(t1.accelerate());
		System.out.println("");

		Truck t2 = new Truck();
		System.out.println(t2.toString());
		System.out.println("");
		t2.setManufacturer("Hyundai Pickup");
		t2.setEngineSize(89.45f);
		t2.setRegNumber("99 C 5344");
		t2.setNCT(true);
		System.out.println(t2.toString());
		System.out.println(t2.brake());
		System.out.println(t2.accelerate());

	}
}