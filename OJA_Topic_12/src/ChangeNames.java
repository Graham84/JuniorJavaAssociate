public class ChangeNames {
	public static void main(String[] args) {
		
		String name = "Jane Doe";
		System.out.println(name);
		int space = name.indexOf(" ");
		String first = name.substring(0, space);
		String last = name.substring(space);
		name = last.trim() + " " + first;
		System.out.println(name);
		
	}


}