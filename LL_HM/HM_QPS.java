package LL_HM;

import java.util.HashMap;
import java.util.HashSet;

public class HM_QPS {
	public static void main(String[] args) {
//		int[] arr = { 15, 4, 7, 11, 2, 5, 5 };
//		_2Sum(arr, 10);
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		Intersection2Arrays(arr1, arr2);
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		longestChain(arr);
	}

	public static int[] _2Sum(int[] arr, int t) {
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int idx = 0; idx < arr.length; idx++) {
			HM.put(arr[idx], idx);
			System.out.println(HM);
		}

//		System.out.println(HM);
		int[] ans = new int[2];
		for (int idx = 0; idx < arr.length; idx++) {
			int ali = arr[idx];
			int toFind = t - ali;
			if (HM.containsKey(toFind) && idx != HM.get(toFind)) {
				System.out.println(ali + " - " + toFind);
				ans[0] = idx;
				ans[1] = HM.get(toFind);
			}
		}
		return ans;
	}

	public static void Intersection2Arrays(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> HM = new HashMap<>();
//		HM.put(null, null)
		for (int ali : arr2) {
//			M1
//			int prev_freq = 0;
//			if (HM.containsKey(ali)) {
//				prev_freq = HM.get(ali);
//			}
//			HM.put(ali, prev_freq + 1);
//////////////////////////////////
			int prev_freq = HM.getOrDefault(ali, 0);
			HM.put(ali, prev_freq + 1);
		}
		System.out.println(HM);
		for (int ali : arr1) {
			if (HM.containsKey(ali) && HM.get(ali) > 0) {
				System.out.println(ali);
				int prev_freq = HM.get(ali);
				HM.put(ali, prev_freq - 1);
			}
		}

	}

	public static void longestChain(int[] arr) {
		HashSet<Integer> Set = new HashSet<>();
		for(int ali: arr) {
			Set.add(ali);
		}
		for(int ali: arr) {
			if(!Set.contains(ali-1)) {
//				ali is the starting point of the chain!!
				int nn = ali;
				while(Set.contains(nn)) {
					System.out.print(nn+"->");
					nn++;
				}
				System.out.println();
			}
		}
	}

}
