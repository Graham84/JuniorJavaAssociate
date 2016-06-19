import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 07/02/16
 * 
 * Purpose: Java program to handle a checked exception declared in methodB passed to methodA and caught in the main method
 */

public class JFT14Ex10 {

	// main
	public static void main(String[] args) {
		try {
			JFT14Ex10 j = new JFT14Ex10();
			j.methodA();
			
			//new JFT14Ex10().methodA();
		}
		// exception handled in main method
		catch (IOException e) {
			System.out.println("Unable to write to the file at this time");
		}
	}

	public void methodA() throws IOException {
		methodB();
	}

	public void methodB() throws IOException {

		// Create a File object
		File file = new File("Output.txt");
		// the following statement can generate a java.io.IOException.
		// Create a FileWriter object
		FileWriter fw = new FileWriter(file, true);

		// Create a BufferedWriter object
		// It requires a reference to a FileWriter object
		BufferedWriter bw = new BufferedWriter(fw);

		// Create a PrintWriter object
		// It requires a reference to a BufferedWriter object
		PrintWriter pw = new PrintWriter(bw);

		// Use the PrintWriter object to write to the text file
		pw.println("Hello world!");

		// Confirmation message
		System.out.println("I am learning Java programming!");

		// Close the PrintWriter stream
		pw.close();

	}

}
