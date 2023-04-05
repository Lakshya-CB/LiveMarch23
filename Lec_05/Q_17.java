package Lec_05;

public class Q_17 {
	public static void main(String[] args) {
		int n = 15;
		int r = 1;
		int tots_sp = 1;
		int tots_st = n / 2;
		while (r <= n) {
			int cnt_st1 = 0;
			while (cnt_st1 < tots_st) {
				System.out.print("* ");
				cnt_st1++;
			}

			int cnt_sp = 0;
			while (cnt_sp < tots_sp) {
				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st2 = 0;
			while (cnt_st2 < tots_st) {
				System.out.print("* ");
				cnt_st2++;
			}

			System.out.println();
			r++;
			if (r <= n / 2 + 1) {
				tots_st--;
				tots_sp = tots_sp + 2;
			} else {
				tots_st++;
				tots_sp = tots_sp - 2;
			}
		}
	}
}
