public class Palindrome {
    public static boolean isPalindrome(String str) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	
    	int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    	
    	/*boolean isPalindrome = true;
        String myString = "";
        str = str.trim();
        str = str.replaceAll("\\.", ""); 
    	
        for (int i = str.length() - 1; i >= 0; i--)
            myString = myString + str.charAt(i);
        
        return myString.equals(str);
       
	}		*/    

    public static void main(String[] args) {
        System.out.println(isPalindrome("Noel sees Leon."));
    }
}