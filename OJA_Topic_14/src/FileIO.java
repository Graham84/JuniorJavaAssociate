import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileIO {
	
	//main method
	public static void main(String[] args) {
		new FileIO().writeToFile();
	}

	public void writeToFile(){
		//Create a File object
		File file = new File("Hello_World.txt");
		
		try {
			//It is important to note that the following statement can generate a java.io.IOException.
			
			//Create a FileWriter object
			FileWriter fw = new FileWriter(file,true);
			
			//Create a BufferedWriter object
			//It requires a reference to a FileWriter object
			BufferedWriter bw = new BufferedWriter(fw);
			
			//Create a PrintWriter object
			//It requires a reference to a BufferedWriter object
			PrintWriter pw = new PrintWriter(bw);
			
			//Use the PrintWriter object to write to the text file
			pw.println("Hello world!");
			
			//Confirmation message
			System.out.println("Message written to text file");
			
			//Close the PrintWriter stream
			pw.close();
			
		} catch(IOException e) {
			System.out.println("Unable to write to the file at this time");
		}
		
		
	}//end method
	
}//end class
