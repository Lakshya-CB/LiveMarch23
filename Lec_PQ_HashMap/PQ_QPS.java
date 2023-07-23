package Lec_PQ_HashMap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_QPS {
	public static void main(String[] args) {
		int[] arr = { 20, 30, 60, 50, 10, 55, 57, 40 };
//		topK(arr, 3);
		medianOfRunningStream(arr);
	}

	public static void topK(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for (int ali : arr) {
			PQ.add(ali);
			if (PQ.size() > k) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}

	public static void medianOfRunningStream(int[] arr) {
		PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());// Left
		PriorityQueue<Integer> Right = new PriorityQueue<>();// Left
		for (int ali : arr) {
			if(Left.isEmpty()||ali<Left.peek()) {
				Left.add(ali);
			}else {
				Right.add(ali);
			}
			if(Left.size()-Right.size()>1) {
				Right.add(Left.poll());
			}else if(Right.size()-Left.size()>1) {
				Left.add(Right.poll());
			}
			System.out.println(Left + " - "+Right);
			if(Left.size()==Right.size()) {
				System.out.println((Left.peek()+Right.peek())/2);
			}else if(Left.size()>Right.size()) {
				System.out.println(Left.peek());
			}else {
				System.out.println(Right.peek());
			}
			System.out.println();
			
		}
	}

}
