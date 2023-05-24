package Lec_21_22;

public class Rec_basics_2 {
	public static void main(String[] args) {
//		System.out.println(Fac(5));
		System.out.println(Pow(2, 3));
	}

	public static int Fac(int n) {
		if (n == 0) {
			return 1;
		}
//		BP : Fac(n)
//		SP : Fac(n-1)
		int sp = Fac(n - 1);
		return n * sp;
	}

	public static int Pow(int a, int b) {
		if(b==0) {
			return 1;
		}
		int sp = Pow(a, b - 1);
		return sp * a;
	}
	public static int Fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int sp1 = Fibo(n-1);
		int sp2 = Fibo(n-2);
		return sp1+sp2;
	}
}
