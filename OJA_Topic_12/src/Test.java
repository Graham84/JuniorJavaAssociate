/*
 * Written by: Graham Ó Síocháin
 * 
 * Date:10/01/16
 * 
 * Purpose: Java program to test the vowelcount class methods
 */

public class Test {

	public static void main(String[] args) {
		
		// instantiate object
		VowelCount vc = new VowelCount();
		
		// call method with parameter passed
		String x = vc.vowelCount("Walking on the moon");
		System.out.println(x);

	}

}
