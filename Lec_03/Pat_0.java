package Lec_03;

public class Pat_0 {
	public static void main(String[] args) {
		int n = 5;
		int total_st = n;

		int row = 1;
		while (row <= n) {

//			/////////////////
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print("*");
				cnt_st++;
			}
//			////////////////
			
			System.out.println("ayee du kya ?!");
			row++;
		}

	}

}
