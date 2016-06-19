public class StringMethods {
	
	public static void main(String[] args) {
		
		//charAt() Method
		String a = "airplane";
		System.out.println(a.charAt(2));	// the output is r - index is zero based
		
		
		//concat() MethodString
		String b = "Taxi";
		b = b.concat(" cab");
		System.out.println(b);	//Taxi cab
		
		//equalsIgnoreCase() Method
		//determine equality of two String objects ignoring case
		String c = "Exit";
		System.out.println(c.equalsIgnoreCase("EXIT"));	//true
		System.out.println(c.equalsIgnoreCase("exit"));		//true
		System.out.println(c.equalsIgnoreCase("tixe"));		//false
		
		//length Method
		String d = "01234567";
		System.out.println(d.length());		//8
		
		//replace() Method
		//replaces all occurrences of a character with a new character
		String e = "Tip Tip";
		e = e.replace('i', 'o');		//Top Top
		System.out.println(e);
		
		//toLowerCase() Method
		String f = "A New Moon";
		f = f.toLowerCase();
		System.out.println(f);		//a new moon
		
		//toUpperCase() Method
		String g = "A New Sun";
		g = g.toUpperCase();
		System.out.println(g);		//A NEW SUN

		//trim() Method
		// returns the entire string minus leading and trailing whitespace characters.
		String h = "          hi          ";
		System.out.println(h);	//"          hi          "
		h = h.trim();
		System.out.println(h);	//"hi"
		
		//substring() Method
		//A new String object is returned which is a substring of the referenced string object.
		//The first argument represents the starting index of the substring to be extracted (a String has a zero-based index)
		//The substring returned will include all characters from the starting point to the end of the String
		String i = "0123456789";
		i = i.substring(5);	//"56789" is extracted
		System.out.println(i);
		
		//substring() Method V2
		//A new String object is returned, which is a substring of the referenced string object
		//The first argument represents the starting index of the substring to be extracted. The second argument represents the ending index.
		//The substring returned will include all characters from the starting index to the specified end index
		//The first argument of the substring method (begin) treats the first character of the String as index position 0
		//The second argument of the substring method (end) treats the first character of the String as index position 1
		String j = "0123456789";
		j = j.substring(5,8);	//567 is extracted
		System.out.println(j);
		
		//toString() Method
		//Returns a string representation of an Object
		//The method is defined in the alpha class, ‘Object’ in the java.lang package
		//All classes in Java extend from the Object class by default, so therefore, every class inherits this method
		//When creating classes, it is common practice to override (replace) the version of the toString() method found in the Object class with your own version
		//By overriding the toString() method, an object created from a class can return a meaningful description of its state (the value of its instance variables)
		
		/*public String toString(){
			return "Name: " + name + "\nAge: " + age + "\nDiscipline: " + discipline;
		}*/
		
	}	//main
	
	
}	//class