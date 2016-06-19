public class JFT12Ex3 {
	
	public static void main (String[] args) {
		
		String s1 = new String("dinghy");
		String s2 = "dinghy";
		String s3 = s2;
		s1.concat("rubber");
		s2.concat(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1 + " " + s2);
		
		
	System.out.println("abc");
    String cde = "cde";
    System.out.println("abc" + cde);
    String c = "abc".substring(2,3);
    String d = cde.substring(1, 2);
    System.out.println(c);
    System.out.println(d);
		
	}
}