package Lec_16;

public class Wrapper_classes {
	public static void main(String[] args) {
//		long l = 10;
//		Long L = 10l;
//
//		short s = 10;
//		Short S = 100;
//
//		byte b = 1;
//		Byte B = 1;
//
//		double d = 1;
//		Double D = 1d;
//
//		float f = 1;
//		Float F = 1f;
//
//		boolean bl = true;
//		Boolean Bl = true;
//		char ch = 'a';
//		Character Ch = 'a';
		////////////////////////////
		int i = 23;// stack
		Integer I = 100; // Heap;
		i = I;// unboxing!!
		
		I = i; //autoboxing!!
		System.out.println(i);
	}
}
