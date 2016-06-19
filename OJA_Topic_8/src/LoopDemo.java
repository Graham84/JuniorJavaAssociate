
public class LoopDemo {

	public static void main(String[] args) {
		
		//while loop
		int i = 0;
		while (i < 101) {
			System.out.print(i + " ");
			//i++;
			i += 5;
		}
		System.out.println();
		
		//dowhile loop
		int x = 200;
		do
		{
			System.out.print(x + " ");
			x -= 10;
		} while (x > 0); 
		

	}

}
