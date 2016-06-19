public class Vehicle {

	private String manufacturer;
	private float engineSize;
	private String regNumber;
	private boolean NCT;

	// four argument constructor
	public Vehicle(String manufacturer, float engineSize, String regNumber,
			boolean NCT) {
		this.manufacturer = manufacturer;
		this.engineSize = engineSize;
		this.regNumber = regNumber;
		this.NCT = NCT;
	}

	// three argument constructor
	public Vehicle(String manufacturer, float engineSize, String regNumber) {
		this(manufacturer, engineSize, regNumber, false);
	}

	// two argument constructor
	public Vehicle(String manufacturer, float engineSize) {
		this(manufacturer, engineSize, "Not Specified", false);
	}

	// one argument constructor
	public Vehicle(String manufacturer) {
		this(manufacturer, 0.0f, "Not Specified", false);
	}

	// no argument constructor
	public Vehicle() {
		this("Not Specified", 0.0f, "Not Specified", false);
	}

	// getters & setters
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setNCT(boolean NCT) {
		this.NCT = NCT;
	}

	public boolean getNCT() {
		return NCT;
	}

	// methods
	public String accelerate() {
		return "Accelerating...";
	}

	public String brake() {
		return "Vehicle braking...";
	}

	public String toString() {
		return "Manufacturer: " + manufacturer + "\nEngine Size: " + engineSize
				+ "\nReg No.: " + regNumber + "\nNCT: " + NCT;
	}

}