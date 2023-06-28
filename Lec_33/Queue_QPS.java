package Lec_33;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_QPS {
	public static void main(String[] args) {
		int[] arr = { -20, 10, -5, 4, 6, -9, -80, 60, 50 };
		int k = 3;
		Queue<Integer> Q = new LinkedList<>();

		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}		
		System.out.println(arr[Q.peek()]);
		for (int s = 1; s <= arr.length - k; s++) {
			int e = s + k - 1;
			if(arr[e]<0) {
				Q.add(e);
			}
			if(Q.peek()<s) {
				Q.poll();
			}
			System.out.println(arr[Q.peek()]);
			
		}

	}
}
