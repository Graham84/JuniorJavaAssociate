public class Jelly {
	
	//Instance Variables
	private String manufacturer;
	private float price;
	private String flavour;
	private float noOfCalories;
	private String expiryDate;
	
	//Constructor
	public Jelly (String manufacturer, float price, String flavour, float noOfCalories, String expiryDate) {
		this.manufacturer = manufacturer;
		this.price = price;
		this.flavour = flavour;
		this.noOfCalories = noOfCalories;
		this.expiryDate = expiryDate;
	}
	
	// Setters and Getters
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}

	public String getManufacturer(){
		return manufacturer;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	
	public float getPrice(){
		return price;
	}
	
	public void setFlavour(String flavour){
		this.flavour = flavour;
	}

	public String getFlavour(){
		return flavour;
	}

	public void setNoOfCalories(float noOfCalories){
		this.noOfCalories = noOfCalories;
	}
	
	public float getNoOfCalories(){
		return noOfCalories;
	}
	
	public void setExpiryDate(String expiryDate){
		this.expiryDate = expiryDate;
	}
	
	public String getExpiryDate(){
		return expiryDate;
	}
	
	// Methods
	public String setInstructions(){
		return "Leave Jelly to set in a cool environment for 1hr";
	}// method
	
	public String toString(){
		return "Manufacturer: " + manufacturer + "\n" + "Price: " + price + "\n" + "Flavour: " + flavour + "\n" + "No. of Calories: " + noOfCalories + "\n" + "Expiry Date: " + expiryDate;
	}
	
	
}