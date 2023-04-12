package Lec_10;

public class Kadance {
	public static void main(String[] args) {
//		int[] arr = { 5, 10, -2, 1, -15, 6, 60, -70, 50, 10 };
		int[] arr = { -5, -10, -2, -1};
		System.out.println(MaxSubarraySum(arr));

	}

	public static int MaxSubarraySum(int[] arr) {
		int sum = 0;
		int ans = arr[0];
		for (int ali : arr) {
			sum = sum + ali;
			if (ans < sum) {
				ans = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}

		return ans;
	}
}
