package Lec_02;

public class SumNat {
	public static void main(String[] args) {
		int n = 5;
		int cnt = 1;
		int sum =0;
		while(cnt<=n) {
			System.out.println(cnt);
			cnt = cnt+1;
			sum = sum +cnt; //B
		}
		System.out.println(sum);
	}
}
