import java.util.ArrayList;


public class IteratorDemo1 {

	public static void main(String[] args) {
		
		// Create an array list
		ArrayList<String> counties = new ArrayList<String>();
		// add elements to the array list
		counties.add("Cork");
		counties.add("Limerick");
		counties.add("Dublin");
		counties.add("Galway");
		counties.add("Clare");
		counties.add("Waterford");
		// Use an enhanced for loop to access the contents of the arraylist.
		for(String county :counties){
		System.out.println(county);
		}

	}

}
