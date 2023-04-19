package Lec_11;

import java.util.Scanner;

public class array_product {
	public static void main(String args[]) {
		Scanner obj1 = new Scanner(System.in);
		int test_cases = obj1.nextInt();
		for (int i = 0; i < test_cases; i++) {
			int nod = obj1.nextInt();
			int[] arr = new int[nod];
			for (int j = 0; j < nod; j++) {
				arr[j] = obj1.nextInt();
			}
			func1(arr);
		}
	}

	public static void func1(int[] arr) {
//        MAX_VALUE_OF_ARRAY
		int max = arr[0];
		int max_ka_idx = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				max_ka_idx = i;
			}
		}

		int fix_first_half = arr[0];
		int water_first_half = 0;
		for (int i = 1; i < max_ka_idx; i++) {
			if (fix_first_half < arr[i]) {
				fix_first_half = arr[i];
			}
			water_first_half = water_first_half + fix_first_half - arr[i];
		}

		int fix_second_half = arr[arr.length - 1];
		int water_second_half = 0;
		for (int i = arr.length - 2; i > max_ka_idx; i--) {
			if (fix_second_half < arr[i]) {
				fix_second_half = arr[i];
			}
			water_second_half = water_second_half + fix_second_half - arr[i];
		}
		

		int water = water_first_half + water_second_half;
		System.out.println(water);
	}
}
