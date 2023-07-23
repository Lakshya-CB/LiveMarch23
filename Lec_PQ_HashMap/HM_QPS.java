package Lec_PQ_HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class HM_QPS {
	public static void main(String[] args) {
//		int[] nums = { 2, 7, 11, 15 };
//		int target = 9;
//		sum2(nums, target);
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		Intersection2(arr1, arr2);

		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		LongestChain(arr);
	}

	public static void sum2(int[] arr, int t) {
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int idx = 0; idx < arr.length; idx++) {
			HM.put(arr[idx], idx);
		}
		System.out.println(HM);
		for (int idx = 0; idx < arr.length; idx++) {
			int ali = t - arr[idx];
			if (HM.containsKey(ali)) {
				System.out.println(idx + " - " + HM.get(ali));
				return;
			}
		}
	}

	public static void Intersection2(int[] arr1, int[] arr2) {

		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int ali : arr2) {
//			HM.put(ali, 1);
//			int prev_freq =0;
//			if(HM.containsKey(ali)) {
//				prev_freq = HM.get(ali);
//			}
//			HM.put(ali, prev_freq+1);
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
	public static void LongestChain(int[] arr) {
		HashSet<Integer> HS = new HashSet<>();
		for(int ali : arr) {
			HS.add(ali);
		}
		System.out.println(HS);
		for(int ali : arr) {
			if(!HS.contains(ali-1)) {
				int temp = ali;
				while(HS.contains(temp)) {
					System.out.print(temp +" => ");
					temp++;
				}
				System.out.println();
			}
		}
	}

}
