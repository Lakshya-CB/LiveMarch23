package Lec_03;

public class Pat_02 {
	public static void main(String[] args) {
		int n = 15;
		int r = 1;
		int tots_st= 1;
		while (r <= n) {
			
			int cnt_st = 0;
			while(cnt_st<tots_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
			
			System.out.println();
			r++;
			tots_st++;
		}

	}
}
