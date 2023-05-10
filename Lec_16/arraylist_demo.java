package Lec_16;

import java.util.ArrayList;

public class arraylist_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		System.out.println(AL);
		AL.add(null);
		System.out.println(AL);
		AL.add(null);
		System.out.println(AL);
		AL.add(null);
		System.out.println(AL);
		AL.add(40);
		System.out.println(AL);
		
//		AL size?
		System.out.println(AL.size());
		AL.add(50);
		System.out.println(AL);
		System.out.println(AL.size());
		
		///////////////
//		indexing
		System.out.println(AL.get(0));
		System.out.println(AL.get(AL.size()-1));
////		System.out.println(AL.get(10000));
		int ali = AL.get(0);
		System.out.println(ali);
////		update ith index!~!
//		
//		AL.set(2, null);
//		System.out.println(AL);
//		
//		AL.add(100);
//		System.out.println(AL);
//		
//		AL.add(1,5);
//		System.out.println(AL);
//		
//		AL.add(AL.size(),500);
//		System.out.println(AL);
////		delete!!
//		
//		AL.remove(3);
//		System.out.println(AL);
		
	}
}
