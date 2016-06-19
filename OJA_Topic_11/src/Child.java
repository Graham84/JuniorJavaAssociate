/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 12/01/16
 * 
 * Purpose: Java program to model a child
 */

public class Child extends Human {

	private String schoolCardNo = "N/A";

	// constructor
	public Child(String name, int age, String gender, float height,
			float weight, String schoolCardNo) {
		super(name, age, gender, height, weight);
		this.schoolCardNo = schoolCardNo;
	}

	// getters & setters
	public void setSchoolCardNo(String schoolCardNo) {
		this.schoolCardNo = schoolCardNo;
	}

	public String getSchoolCardNo() {
		return schoolCardNo;
	}

	// override method
	public String swim() {
		if (getAge() <= 5) {
			return "As the child is 5 years old or younger, armbands must be worn and parental supervision is required.\n"
					+ super.swim();
		} else {
			return super.swim();
		}
	}

	public String toString() {
		return super.toString() + "\nSchool Card No: " + schoolCardNo;
	}
}