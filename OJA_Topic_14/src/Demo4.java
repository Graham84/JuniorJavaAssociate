public class Demo4{
	public static void main(String[] args){
		String num = "two";
		try
		{
			int x = Integer.parseInt(num); 
			System.out.println(x);
		}
		catch(NumberFormatException e){
			System.out.println("Problem parsing data.");
		}
	}// main
}// class