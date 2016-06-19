import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo2 {

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
			// Use an iterator to display contents of array list
			Iterator itr = counties.iterator();
			while(itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element + " ");
			}

	}

}
