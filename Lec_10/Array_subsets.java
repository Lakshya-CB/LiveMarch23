package Lec_10;

public class Array_subsets {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -30, 40 };

		M2(arr);
	}

	public static void M1(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
				int sum = 0;
				for (int i = s; i <= e; i++) {
					sum = sum + arr[i];
//					System.out.print(arr[i] + " ");
				}
				System.out.println("=>" + sum);// B
			}
		}
	}

	public static void M2(int[] arr) {
		int ans = 0;
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;// B

			for (int e = s; e < arr.length; e++) {

				sum = sum + arr[e];
				System.out.println("=>" + sum);// B
				if (sum > ans) {
					ans = sum;
				}
			}
		}
		System.out.println("answer is "+ans);
	}
}
