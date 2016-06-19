/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 12/01/16
 * 
 * Purpose: Java program to model an adult
 */

public class Adult extends Human {

	private String ppsNo;
	private String occupation;
	private boolean isMarried;
	private boolean isCarOwner;

	// constructor
	public Adult(String name, int age, String gender, float height,
			float weight, String ppsNo, String occupation, boolean isMarried,
			boolean isCarOwner) {
		super(name, age, gender, height, weight);
		this.ppsNo = ppsNo;
		this.occupation = occupation;
		this.isMarried = isMarried;
		this.isCarOwner = isCarOwner;
	}

	// getters & setters
	public void setPpsNo(String ppsNo) {
		this.ppsNo = ppsNo;
	}

	public String getPpsNo() {
		return ppsNo;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public boolean getIsMarried() {
		return isMarried;
	}

	public void setIsCarowner(boolean isCarOwner) {
		this.isCarOwner = isCarOwner;
	}

	public boolean getIsCarOwner() {
		return isCarOwner;
	}

	// methods
	public String drive() {
		return "Driving a car safely...";
	}

	public String procreate() {
		return "Procreating...";
	}

	public String toString() {
		return super.toString() + "\nPPS No: " + ppsNo + "\nOccupation: "
				+ occupation + "\nMarried: " + isMarried + "\nCar Owner: "
				+ isCarOwner;
	}

}