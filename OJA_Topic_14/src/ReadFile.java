import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//In the revised example below, the writeToFile() method has chosen to declare the exception
//as part of its signature and not handle it. The responsibility of handling the exception is
//passed to the calling method (main).

public class ReadFile {
	public static void main(String[] args) {
		try {
			ReadFile rf = new ReadFile();
			rf.readFromFile();
		} catch (IOException e) {
			System.out.println("Unable to read from the file at this time.");
		}
	}// main

	public void readFromFile() throws IOException {
		// Create a File object
		//Hello_World.txt passed to constructor
		File file = new File("Hello_World.txt");
		// Create a FileReader object
		FileReader fr = new FileReader(file);
		// Create a BufferedReader object.
		// It requires a reference to a FileReader object.
		BufferedReader br = new BufferedReader(fr);
		// Read in the first line
		String line = br.readLine();
		// Read in remaining lines (if any)
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		System.out.println("The contents of the text file have been successfully read!");
	}// method

}
