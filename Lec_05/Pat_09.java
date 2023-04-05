package Lec_05;

public class Pat_09 {
	public static void main(String[] args) {
		int n = 10;
		int r = 1;
		int total_sp = n - 1;
		int total_st = 1;
		int start_row_num = n;
		while (r <= n) {
//			step 2!!!!!!!
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int num = start_row_num;

			int cnt_st = 0;
			while (cnt_st < total_st) {
				if (num == 10) {
					System.out.print("0 ");
				} else {
					System.out.print(num + " ");
				}
				if (cnt_st < total_st / 2) {
					num++;
				} else {
					num--;
				}
				cnt_st++;
			}

			r++;
			start_row_num--;
			total_sp--;
			total_st = total_st + 2;
			System.out.println();
		}

	}
}
