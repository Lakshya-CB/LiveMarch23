package Lec_04;

public class Pat_01 {
	public static void main(String[] args) {
		int n = 25;

		int row = 1;
		int tots_st = n;
		while (row <= n) {

//			Step 2: Code
			int cnt_st = 0;
			while (cnt_st < tots_st) {
				if (cnt_st + row == n 
						|| row == cnt_st + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cnt_st++;
			}

			System.out.println();
			row++;
		}
	}
}
