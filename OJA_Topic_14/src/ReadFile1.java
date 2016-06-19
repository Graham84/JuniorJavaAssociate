import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {
	public static void main(String[] args) {
		new ReadFile1().readFromFile();
	}// main

	public void readFromFile() {
		// Create a File object
		File file = new File("Hello_World.txt");
		try {
			// Create a FileReader object
			FileReader fr = new FileReader(file);
			// Create a BufferedReader object.
			// It requires a reference to a FileReader object.
			BufferedReader br = new BufferedReader(fr);
			// Read in the first line
			String line = br.readLine();
			//A while loop is then used to read in any other lines
			// Read in remaining lines (if any)
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			System.out.println("The contents of the text file have been successfully read!");
		} catch (IOException e) {
			System.out.println("Unable to read from the file at this time.");
		}
	}// method
}// class
