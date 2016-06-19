
public class JFT6Ex2 {

	static int reg = 4;
	
	public static void main(String[] args) {
		
		checkReg();

	}
	
	public static void checkReg() {
		if (reg < 5) {
			System.out.println("The fishing trip will not go ahead.");
		} else {
			System.out.println("The fishing trip will go ahead.");
		}
	}

}
