package Lec_21_22;

public class demo {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("sfasdf");
		StringBuilder s2 = new StringBuilder("sfasdf");
		
		System.out.println(s1==s2);
		System.out.println(s1.toString().equals(s2.toString()));

	}
}
