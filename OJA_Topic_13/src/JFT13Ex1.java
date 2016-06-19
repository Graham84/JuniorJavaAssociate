public class JFT13Ex1 {
	
	public static void main (String[] args) {
	
	float num1 = 10.05f;
	float num2 = 20.34f;
	
	float min = Math.min(10.05f, 20.34f);
	float max = Math.max(10.05f, 20.34f);
	
	float min1 = Math.min(num1, num2);
	float max1 = Math.max(num1, num2);
	
	System.out.println("Min number is: " + min);
	System.out.println("Max number is: " + max);
	System.out.println("Min number is: " + min1);
	System.out.println("Max number is: " + max1);
	
	}
}