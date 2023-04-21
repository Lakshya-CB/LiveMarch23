package Lec_12;

public class ARray_2d_1 {
	public static void main(String[] args) {
		int[][] mat = new int[5][3];
		System.out.println(mat.length);
		System.out.println(mat[0].length);
//		int cnt =1;
//		for(int r=0; r<mat.length;r++) {
//			for(int c=0;c<mat[0].length;c++) {
//				mat[r][c] = cnt;
//				cnt++;
//			}
//		}

		for (int[] row : mat) {
//			System.out.println(row);
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
		
	}
}
