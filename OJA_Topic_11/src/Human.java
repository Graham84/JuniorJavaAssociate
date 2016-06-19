/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 12/01/16
 * 
 * Purpose: Java program to model a human
 */

public class Human {

	// instance variables
	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;

	// constructor
	public Human(String name, int age, String gender, float height, float weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	// getters & setters
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getWeight() {
		return weight;
	}

	// methods
	public String sleep() {
		return "Sleeping soundly...";
	}

	public String eat() {
		return "Eating slowly and chewing carefully...";
	}

	public String swim() {
		return "Arms rotating and pushing the body forward...";
	}

	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nGender: " + gender
				+ "\nHeight: " + height + "\nWeight: " + weight;
	}

}