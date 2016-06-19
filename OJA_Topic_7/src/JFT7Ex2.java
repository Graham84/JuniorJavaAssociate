
public class JFT7Ex2 {

	public static void main(String[] args) {
		
		float[] salary = {24000.50f, 30432.54f, 29454.54f, 45000.00f, 20500.00f};
		
		System.out.println("There are " + salary.length + " employees.");
		System.out.println("Their salaries are: ");
		System.out.println(salary[0]);
		System.out.println(salary[1]);
		System.out.println(salary[2]);
		System.out.println(salary[3]);
		System.out.println(salary[4]);
		
		for (float s : salary){
			System.out.println(s);
		}
		

	}

}
