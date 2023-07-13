package Lec_PQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_QPS {
	public static void main(String[] args) {
//		int[][] arr = { { 10, 20, 30 }, { 15, 35 }, { 5, 7, 12, 25 }, { 17, 22, 40 } };
//		mergeKSorted(arr);
		int[] arr = { 1, 0, 1, 3, 2, 4, 2 };
		MedianOfARuningStream(arr);
	}

	public static void topK(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for (int ali : arr) {
			PQ.add(ali); // logk
			if (PQ.size() > k) {
				PQ.poll();// logk
			}
		}
		System.out.println(PQ);
	}

	static class pair implements Comparable<pair> {
		public pair(int i, int r, int j) {
			// TODO Auto-generated constructor stub
			data = i;
			arr_idx = r;
			ali_idx = j;

		}

		int data;
		int ali_idx;
		int arr_idx;

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
//			this.compareTo(o)

			return this.data - o.data;
		}
	}

	public static void mergeKSorted(int[][] arr) {
		PriorityQueue<pair> PQ = new PriorityQueue<>();
		for (int r = 0; r < arr.length; r++) {
			PQ.add(new pair(arr[r][0], r, 0));
		}
		while (!PQ.isEmpty()) {
			pair curr = PQ.poll();
			System.out.println(curr.data);
			curr.ali_idx++;
			if (curr.ali_idx < arr[curr.arr_idx].length) {
				curr.data = arr[curr.arr_idx][curr.ali_idx];
				PQ.add(curr);
			}

		}
	}

	public static void MedianOfARuningStream(int[] arr) {
		PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> Right = new PriorityQueue<>();
		for (int ali : arr) {
			if (Left.isEmpty() || Left.peek() >= ali) {
				Left.add(ali);
			} else {
				Right.add(ali);
			}
			if (Left.size() - Right.size() > 1) {
				Right.add(Left.poll());

			} else if (Right.size() - Left.size() > 1) {
				Left.add(Right.poll());
			}
			System.out.println(Left + " - " + Right);
			if (Left.size() == Right.size()) {
				System.out.println((Left.peek() + Right.peek() + 0.0) / 2);
			} else if (Left.size() - Right.size() == 1) {
				System.out.println(Left.peek());
			} else if (Left.size() - Right.size() == -1) {
				System.out.println(Right.peek());
			}

			System.out.println("==============");
		}

	}
}
