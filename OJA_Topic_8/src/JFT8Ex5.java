
public class JFT8Ex5 {

	public static void main(String[] args) {
		
		String[] artists = {"Michael Jackson", "Frankie Goes To Hollywood", "Queen", "Simple Minds", "Rick Astley"};
		int counter = 5;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("No: " + counter + " " + artists[i]);
			counter--;
		}
		
		System.out.println(counter);
		counter = 10;
		/*Arrays.toString(artists)*/
		
		for (String artist: artists) {
			System.out.println(counter + " " + artist);
			counter--;
		}
	}

}
