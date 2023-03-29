package Lec_04;

public class Pat_13 {
	public static void main(String[] args) {
		int n = 5;
		int r = 1;
		int tots_st = 1;
		while (r <= 2 * n - 1) {

			int cnt_st = 0;
			while (cnt_st < tots_st) {
				System.out.print("* ");
				cnt_st++;
			}

			System.out.println();
			r++;
			if (r <= n) {
				tots_st++;
			} else {
				tots_st--;
			}
		}
	}
}
