package Lec_04;

public class Pat_23 {
	public static void main(String[] args) {
		int n = 5;
		int r = 1;
		int total_sp = n - 1;
		int total_st = 1;
		int start_row_num = 1;
		while (r <= n) {
//			step 2!!!!!!!
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("\t");
				cnt_sp++;
			}

			int num = start_row_num;
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print(num + "\t");
				if (cnt_st < total_st / 2) {
					num++;
				} else {
					num--;
				}
				cnt_st++;
			}
			start_row_num++;
			r++;
			total_sp--;
			total_st = total_st + 2;
			System.out.println();
		}

	}
}
