package Lec_Rec_sorting;

import java.util.Arrays;

public class sooooooorting {
	public static void main(String[] args) {
//		int[] arr1 = { 10, 20, 30, 50 };
//		int[] arr2 = { 5, 15, 25, 500 };
//		System.out.println(Arrays.toString(merge(arr1, arr2)));
		int[] arr = {10,20,301,9};
//		arr = sort(arr, 0, arr.length-1);
		quick(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] sort(int[] arr, int s, int e) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid= (s+e)/2;
		int[] sp1 = sort(arr, s, mid);
		int[] sp2 = sort(arr, mid+1,e);
		return merge(sp1, sp2);
	}
	
	public static void quick(int[] arr, int s, int e) {
		if(s>=e) {
			return;
		}
		int pivot = arr[(s+e)/2];
		int L = s;
		int R = e;
		while(L<=R) {
			while(arr[L]<pivot) {
				L++;
			}
			while(arr[R]>pivot) {
				R--;
			}
			if(L<=R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp; 
				R--;L++;
			}
		}
		quick(arr, s, R);
		quick(arr, L, e);
		
		
	}
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[idx3] = arr1[idx1];
				idx1++;
				idx3++;
			} else {
				ans[idx3] = arr2[idx2];
				idx2++;
				idx3++;
			}
		}
		while (idx1 < arr1.length) {
			ans[idx3] = arr1[idx1];
			idx1++;
			idx3++;
		}
		while (idx2 < arr2.length) {
			ans[idx3] = arr2[idx2];
			idx2++;
			idx3++;
		}
		return ans;

	}
}
