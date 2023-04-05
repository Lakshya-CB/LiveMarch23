package Lec_05;

public class data_type_demo {
	public static void main(String[] args) {
//		byte b = 5;// implicit type casting!!
		byte b = (byte)267;// explicit type casting!!
		System.out.println(b);

		short s = 32767;
		System.out.println(s);

		int i = Integer.MAX_VALUE;
		System.out.println(i);
		System.out.println(Integer.MIN_VALUE);
		
//
		long l = 200;
		System.out.println(l);
	}
}

