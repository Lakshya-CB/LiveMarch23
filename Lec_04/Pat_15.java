package Lec_04;

public class Pat_15 {
	public static void main(String[] args) {
		int n = 8;
		int r = 1;
		int tots_sp = 0;
		int tots_st = n;
		while (r <= 2 * n - 1) {
			int cnt_sp = 0;
			while (cnt_sp < tots_sp) {

				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st = 0;
			while (cnt_st < tots_st) {
				System.out.print("* ");
				cnt_st++;
			}

			System.out.println();
			if (r < n) {
				tots_sp = tots_sp + 2;
				tots_st--;
			} else {
				tots_sp = tots_sp - 2;
				tots_st++;
			}
			r++;
		}
	}
}
