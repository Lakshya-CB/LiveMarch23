package Lec_31;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
//		Stack<Integer> S = new Stack<>();
//		S.push(10);
//
//		S.push(20);
//		S.push(30);
//		S.push(40);
//
//		System.out.println(S);
////
////		System.out.println(S.pop());
////		System.out.println(S);
////		System.out.println(S.peek());
////		reverse_print(S);
//		printRev_R(S);
//		System.out.println(S);
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		nextGr8er2(arr);

	}

	public static void printRev_R(Stack<Integer> S) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		printRev_R(S);
		System.out.println(ali);
		S.add(ali);

	}

	public static void print(Stack<Integer> S) {
		Stack<Integer> Ex = new Stack<>();
		while (!S.isEmpty()) {
			int ali = S.pop();
			System.out.print(ali + " ");
			Ex.add(ali);
		}
		System.out.println();
		while (!Ex.isEmpty()) {
			int ali = Ex.pop();
//			System.out.print(ali+ " ");
			S.add(ali);
		}
	}

	public static void reverse_print(Stack<Integer> S) {
		Stack<Integer> Ex = new Stack<>();
		while (!S.isEmpty()) {
			int ali = S.pop();
//			System.out.print(ali+ " ");
			Ex.add(ali);
		}
//		System.out.println();
		while (!Ex.isEmpty()) {
			int ali = Ex.pop();
			System.out.print(ali + " ");
			S.add(ali);
		}
		System.out.println();
	}

	public static void nextGr8er(int[] arr) {
		Stack<Integer> S = new Stack<>(); // potential A's
		for (int B : arr) {
			while (!S.isEmpty() && B > S.peek()) {
				int A = S.pop();
				System.out.println(A + "=>" + B);
			}
			S.add(B);
		}
		while (!S.isEmpty() ) {
			int A = S.pop();
			System.out.println(A + "=>" + -1);
		}
	}
	public static void nextGr8er2(int[] arr) {
		Stack<Integer> S = new Stack<>(); // potential A's
		int[] ans = new int[arr.length];
		for (int idx =0;idx<arr.length;idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && B > arr[S.peek()]) {
				int A_idx = S.pop();
//				System.out.println(A + "=>" + B);
				ans[A_idx] = B;
			}
			S.add(idx);
		}
		System.out.println(Arrays.toString(ans));
	}
}
