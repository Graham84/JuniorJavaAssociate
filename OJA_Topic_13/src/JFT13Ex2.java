import java.util.Random;

public class JFT13Ex2 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int randNum = r.nextInt(11);
		//generates random numbers from 0-10 inclusive
		System.out.println(randNum);
		randNum = r.nextInt(11);
		System.out.println(randNum);
		
		
	}
	
}