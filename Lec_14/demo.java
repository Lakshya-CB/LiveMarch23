package Lec_14;

public class demo {
	public static void main(String[] args) {
		int[][] mat = new int[5][];
		for (int[] row : mat) {
			System.out.println(row);
		}
		System.out.println("===========");
		System.out.println(mat);
		System.out.println("===========");
		mat[0] = new int[5];
		for (int[] row : mat) {
			System.out.println(row);
		}
		System.out.println("===========");
		
		mat[2] = new int[9];
		for (int[] row : mat) {
			System.out.println(row);
		}
		System.out.println("=*===*==*==*===");
		for(int i=1;i<=5;i++) {
			mat[i-1]= new int[i];
		}
		for (int[] row : mat) {
			System.out.println(row.length);
		}
		System.out.println("===========");
		
	}
}
