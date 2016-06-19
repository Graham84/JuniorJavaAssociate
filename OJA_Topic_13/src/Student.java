public class Student {
	
	public String firstName;
	public String lastName;
	public byte age;
	public String className;
	public float gradeAverage;
	public String address;
	
	public static int noStudents;
	public  static float avgGrade;
	
	
	public String toString() {
		return "First Name: " + firstName + "\n" + "Last Name: : " + lastName + "\n" + "Age: " + age + "\n" + "Class Name: " + className + "\n" + "Grade Average: " + gradeAverage +"\nAddress: " + address;
	}
	
	public static float getAverageGrade() {
		return avgGrade / noStudents;
	}
}