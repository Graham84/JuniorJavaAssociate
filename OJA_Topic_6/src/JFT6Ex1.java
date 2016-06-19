
public class JFT6Ex1 {

	public static boolean hasPermit = false;
	
	public static void main(String[] args) {
		
		canFish();

	}
	
	public static void canFish() {
		if (hasPermit == true) {
			System.out.println("You can go on the fishing trip as you have a permit");
		} else {
			System.out.println("You cannot go on the fishing trip as you do not have a permit");
		}
	}

}
