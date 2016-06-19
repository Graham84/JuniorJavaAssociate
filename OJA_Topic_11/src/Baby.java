/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 12/01/16
 * 
 * Purpose: Java program to model a baby
 */

public class Baby extends Human {

	private boolean isTeething;

	// constructor
	public Baby(String name, int age, String gender, float height,
			float weight, boolean isTeething) {
		super(name, age, gender, height, weight);
		this.isTeething = isTeething;
	}

	// getters & setters
	public void setIsTeething(boolean isTeething) {
		this.isTeething = isTeething;
	}

	public boolean getIsTeething() {
		return isTeething;
	}

	// override method
	public String sleep() {
		if (isTeething) {
			return "Baby having difficulty sleeping due to teething pain";
		} else {
			return super.sleep();
		}
	}

	// override method
	public String swim() {
		return "A baby cannot swim safely...";
	}

	public String toString() {
		return super.toString() + "\nTeething: " + isTeething;
	}
}