package Lec_02;

public class prime {
	public static void main(String[] args) {
		int n = 6;
		int divisor = 1;
		int num_Fac = 0;
		while (divisor <= n) {
			int rem = n % divisor;
			if (rem == 0) {
				num_Fac++;
			}
			System.out.println(divisor + " - " + rem);
			divisor++;
		}
		if(num_Fac==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
	}
}
