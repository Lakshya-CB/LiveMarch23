package Lec_09;

public class Arrays_QPS {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);
		Reverse(arr);
		print(arr);

//		reversePrint(arr);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void reversePrint(int[] arr) {
		for (int idx = 4; idx >= 0; idx--) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();

	}

	public static int Max(int[] arr) {
//		int jeb = Integer.MIN_VALUE;
		int jeb = arr[0];

		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int Find(int[] arr, int ali) {
		for (int idx = 0; idx < arr.length; idx++) {
			if (arr[idx] == ali) {
				return idx;
			}
		}
		return -1;
	}

	public static void Reverse(int[] arr) {
		int L = 0;
		int R = arr.length - 1;
		while (L<R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}

}
