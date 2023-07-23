package Lec_PQ_HashMap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_demo {
	public static void main(String[] args) {
//		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
////		Min heap!!, rank wali PQ

		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		PQ.add(10);
		PQ.add(6);
		PQ.add(15);
		PQ.add(12);
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
			
		
	}
	
}
