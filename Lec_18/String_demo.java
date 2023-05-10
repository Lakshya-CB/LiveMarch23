package Lec_18;

public class String_demo {
	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = s1;
		String s3 = "hello";
		String s4 = new String("hello");
		String s5 = new String("hello");

		System.out.println((s1 == s2) + " : " + s1.equals(s2));
		System.out.println((s1 == s3) + " :  " + s1.equals(s3));
		System.out.println((s1 == s4) + "  : " + s1.equals(s4));
		System.out.println((s5 == s4) + "  : " + s5.equals(s4));
		
		

	}
}
