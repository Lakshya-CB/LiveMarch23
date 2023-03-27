package Lec_02;

public class Fibo__ {
	public static void main(String[] args) {
		int n = 5;

		int cnt = 0;
		int a = 0;
		int b = 1;
		int c = -1;
		while (cnt < n) {
			c = a + b;
//			1
			a = b;
			b = c;

			cnt++;
		}
		System.out.println(c);
		System.out.println(b);
		System.out.println(a); // answer!!

	}
}
