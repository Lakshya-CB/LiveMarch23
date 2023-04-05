package Lec_07;

public class function_demo_3 {
	public static void swap(int a, int b) {
		mr_worldwide = 2;
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
	}

	public static void main(String[] args) {

		int a = 1;
		int b = 20;
		System.out.println(mr_worldwide);
		System.out.println(a + " : " + b);
		swap(a, b);
		System.out.println(a + " : " + b);
		System.out.println(mr_worldwide);
	}

	static int mr_worldwide = 99;

}
