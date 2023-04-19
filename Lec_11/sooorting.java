package Lec_11;

import java.util.Arrays;

public class sooorting {
	public static void main(String[] args) {
		int[] arr = { 50,40,30,20,10};
		System.out.println(Arrays.toString(arr));
		Insertion(arr);
//		System.out.println(Arrays.toString(arr));

	}

	public static void Selection(int[] arr) {
		for (int last = arr.length - 1; last >= 1; last--) {
			int max_id = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[i] > arr[max_id]) {
					max_id = i;
				}
			}
//		swap!!
			int temp = arr[last];
			arr[last] = arr[max_id];
			arr[max_id] = temp;
		}
	}

	public static void Insertion(int[] arr) {

		for (int to_ins = 1; to_ins < arr.length; to_ins++) {
			int idx = to_ins - 1;
			while (idx >= 0 && arr[idx] > arr[idx + 1]) {
				int temp = arr[idx];
				arr[idx] = arr[idx + 1];
				arr[idx + 1] = temp;
				idx--;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
