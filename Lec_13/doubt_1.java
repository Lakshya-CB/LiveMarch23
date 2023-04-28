package Lec_13;

import java.util.Arrays;
import java.util.Scanner;

public class doubt_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int arr[] = new int[i];
		int arr1[] = new int[i];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			arr1[j] = sc.nextInt();
		}
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		printIntersection(arr, arr1);
	}

	static void printIntersection(int[] arr, int[] arr1) {
		int i = 0, j = 0, k = 0;

		System.out.print("[");

		while (i < arr.length && j < arr.length) {
			if (arr[i] == arr1[j]) {
				System.out.print(arr[i]+" ");
				i++;
				j++;
			}
			if (arr[i] > arr1[j]) {
				j++;
			} else if (arr[i] < arr1[j]) {
				i++;
			}
		}
		System.out.print("]");
	}

	public static void A_Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
