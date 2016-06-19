public class StudentTest {
	
	public static void main(String [] args) {
		
		
	Student s1 = new Student();
	s1.firstName = "Billy";
	s1.lastName = "Davis";
	s1.age = 17;
	s1.className = "Leaving Cert 1";
	s1.gradeAverage = 70.50f;
	s1.address = "12 High Street, Dublin";
	
	Student.noStudents++;
	Student.avgGrade += s1.gradeAverage;
	
	
	Student s2 = new Student();
	s2.firstName = "Anna";
	s2.lastName = "Smith";
	s2.age = 18;
	s2.className = "Leaving Cert 1";
	s2.gradeAverage = 80.00f;
	s2.address = "19 Lower Street, Dublin";
	
	Student.noStudents++;
	Student.avgGrade += s2.gradeAverage;
	
	
	Student s3 = new Student();
	s3.firstName = "Georgina";
	s3.lastName = "Moriarty";
	s3.age = 17;
	s3.className = "Leaving Cert 1";
	s3.gradeAverage = 90.00f;
	s3.address = "5 Middle Street, Dublin";
	
	Student.noStudents++;
	Student.avgGrade += s3.gradeAverage;
	
	System.out.println(s1.toString());
	System.out.println();
	System.out.println(s2.toString());
	System.out.println();
	System.out.println(s3.toString());
	System.out.println();
	
	System.out.println("There are " + Student.noStudents + " students");
	System.out.println("The grade average is: " + Student.getAverageGrade());
	
	}
	
}