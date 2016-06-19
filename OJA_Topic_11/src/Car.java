public class Car extends Vehicle {

	public static int noCarsSold;

	// four argument constructor
	public Car(String manufacturer, float engineSize, String regNumber,
			boolean NCT) {
		super(manufacturer, engineSize, regNumber, NCT);
	}

	// three argument constructor
	public Car(String manufacturer, float engineSize, String regNumber) {
		this(manufacturer, engineSize, regNumber, false);
	}

	// two argument constructor
	public Car(String manufacturer, float engineSize) {
		this(manufacturer, engineSize, "Not Specified", false);
	}

	// one argument constructor
	public Car(String manufacturer) {
		this(manufacturer, 0.0f, "Not Specified", false);
	}

	// no argument constructor
	public Car() {
		this("Not Specified", 0.0f, "Not Specified", false);
	}

	// methods
	public String brake() {
		return "Car braking...";
	}

}