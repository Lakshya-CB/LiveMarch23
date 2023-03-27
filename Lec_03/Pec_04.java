package Lec_03;

public class Pec_04 {
	public static void main(String[] args) {
		int n = 20;
		int row = 1;
		int tots_sp = n-1;
		int tots_st =1;
//		step : 1
		while (row <= n) {
			
//			Step 2: space print karo!!1
			int cnt_sp = 0;
			while(cnt_sp < tots_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//			Step 2: star print karo!!1			
			int cnt_st =0;
			while(cnt_st< tots_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
			
			row++;
			tots_sp--;
			tots_st++;
			System.out.println();
		}

	}
}
