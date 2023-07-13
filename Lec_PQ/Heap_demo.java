package Lec_PQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_demo {
	public static void main(String[] args) {
//		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder()); //max heap => max
//		PriorityQueue<Integer> PQ = new PriorityQueue<>(); // min heap=> rank
		Heap PQ = new Heap();
		PQ.add(10);
		PQ.add(100);
		PQ.add(3);
		PQ.add(6);
		PQ.add(16);
		System.out.println(PQ);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		
		
	}
}
