public class Truck extends Vehicle {

	private boolean isTrailer;

	// getters & setters
	public void setIsTrailer(boolean isTrailer) {
		this.isTrailer = isTrailer;
	}

	public boolean getIsTrailer() {
		return isTrailer;
	}

	// four argument constructor
	public Truck(String manufacturer, float engineSize, String regNumber,
			boolean NCT) {
		super(manufacturer, engineSize, regNumber, NCT);
	}

	// three argument constructor
	public Truck(String manufacturer, float engineSize, String regNumber) {
		this(manufacturer, engineSize, regNumber, false);
	}

	// two argument constructor
	public Truck(String manufacturer, float engineSize) {
		this(manufacturer, engineSize, "Not Specified", false);
	}

	// one argument constructor
	public Truck(String manufacturer) {
		this(manufacturer, 0.0f, "Not Specified", false);
	}

	// no argument constructor
	public Truck() {
		this("Not Specified", 0.0f, "Not Specified", false);
	}

	// methods
	public String brake() {
		return "Truck braking...";
	}

	public String toString() {
		return super.toString() + "\nHas trailer: " + isTrailer;
	}

}