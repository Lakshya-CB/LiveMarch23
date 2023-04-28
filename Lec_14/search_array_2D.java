package Lec_14;

public class search_array_2D {
	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		int ali = 24;
		System.out.println(find(mat, ali));
	}

	public static boolean find(int[][] mat, int ali) {

		int r = mat.length - 1;
		int c = 0;
		while(r>=0 && c<mat[0].length) {
			if(mat[r][c]==ali) {
				return true;
			}else if(ali>mat[r][c]) {
				c++;
			}else {
				r--;
			}
		}
		return false;
	}
}
