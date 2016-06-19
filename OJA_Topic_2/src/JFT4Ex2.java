/*
 * Written by: Graham Ó Síocháin
 * 
 * Date:22/11/15
 * 
 * Purpose: Java program to calculate the VAT payable and total purchase price for a bottle of whiskey
 * 
 */

public class JFT4Ex2 {

	public static void main(String[] args) {
		
		double price = 14.50;
		double VATRate = 0.23;
		double VATDue = price * VATRate;
		
		System.out.println("Whiskey Price: €" + price);
		System.out.println("VAT Due: €" + (VATDue));
		System.out.println("Total Price: €" + (price + VATDue));

	}

}
