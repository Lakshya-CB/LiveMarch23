package Lec_18;

public class String_demo2 {
	public static void main(String[] args) {
		String str = new String("uxzcbj");
		String str2 = str.substring(0, 2);
		
		String str21 = str2.intern();
//		str2.
		System.out.println(str21==str2);
		

	}
}
