import java.util.Arrays;

public class AreAnagrams {

	public static boolean areAnagrams(String a, String b) {
		//throw new UnsupportedOperationException("Waiting to be implemented.");

		boolean status = true;

		// false if not the same length
		if (a.length() != b.length()) {
			status = false;
	
		} else {
			
			char[] aArray = a.toLowerCase().toCharArray();
			char[] bArray = b.toLowerCase().toCharArray();

			// sort arrays
			Arrays.sort(aArray);
			Arrays.sort(bArray);

			status = Arrays.equals(aArray, bArray);

		}

		// Output
		if (status) {
			System.out.println(a + "and " + b + "are anagrams");
		} else {
			System.out.println(a + " and " + b + "are not anagrams");
		}
	}

	public static void main(String[] args) {
		System.out.println(areAnagrams("momdad", "dadmom"));
	}
}
