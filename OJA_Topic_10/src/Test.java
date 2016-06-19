/*
 * Written by: Graham Ó Síocháin
 * 
 * Date:10/01/16
 * 
 * Purpose: Java program to test the television class methods
 */

public class Test {

	public static void main(String[] args) {

		/*Television tv = new Television(100,5,true);
		System.out.println(tv.toString());
		tv.channelUp();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.setOn_off(false);
		System.out.println(tv.toString());*/
		
		
		// instantiate object
		VowelCount vc = new VowelCount();
		
		// call method with parameter passed
		// vc.vowelCount("Walking on the moon")
		
		// print method with parameter passed
		System.out.println(vc.vowelCount("Walking on the moon"));

	}

}
