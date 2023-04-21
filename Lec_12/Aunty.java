package Lec_12;

public class Aunty {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 11, 12, 13, 14 ,15}, 
				};

		int rs = 0;
		int re = arr.length - 1;
		int cs = 0;
		int ce = arr[0].length - 1;
		int max_cnt = arr.length *arr[0].length;
		int cnt =0;
//		////////////////////
		while (rs <= re && cs <= ce) {
			for (int r = rs; r <= re && cnt<max_cnt; r++) {
				System.out.println(arr[r][cs]);
				cnt++;
			}

			for (int c = cs + 1; c <= ce && cnt<max_cnt; c++) {
				System.out.println(arr[re][c]);
				cnt++;
			}
			for (int r = re - 1; r >= rs && cnt<max_cnt; r--) {
				System.out.println(arr[r][ce]);
				cnt++;
			}
			for (int c = ce - 1; c >= cs + 1 && cnt<max_cnt; c--) {
				System.out.println(arr[rs][c]);
				cnt++;
			}
			rs++;
			cs++;
			re--;
			ce--;
		}
	}

}
