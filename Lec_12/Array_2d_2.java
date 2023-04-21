package Lec_12;

public class Array_2d_2 {
	public static void main(String[] args) {
		int[][] mat = { 
				{ 11, 12, 13, 14 }, 
				{ 21, 22, 23, 24 }, 
				{ 31, 32, 33, 34 }, 
				{ 41, 42, 43, 44 } };

		for (int c = 0; c < mat[0].length; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < mat.length; r++) {
					System.out.println(mat[r][c]);
				}
			} else {
				for (int r = mat.length - 1; r >= 0; r--) {
					System.out.println(mat[r][c]);
				}
			}
		}
	}
}
