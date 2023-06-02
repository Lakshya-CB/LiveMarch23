package Lec_25;

import java.util.ArrayList;
import java.util.List;

public class partioning2 {
	public static void main(String[] args) {
		List<String> AL_bag = new ArrayList<>();
		kaat("nitttin", "", AL_bag);
	}

	public static void kaat(String table, String bag, List<String> AL_bag) {
//		table = abcd
		if (table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL_bag);
			System.out.println("=============");
			return;
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku); // a
			String remain = table.substring(chakku);// bcd

//			fix 1: Make your List behave like a immutable srting
//			List<String> nn_bag = new ArrayList<>(AL_bag);
//			nn_bag.add(piece);
//			kaat(remain, bag + piece + "-", nn_bag);
//			fix 2:
			if (isPalin(piece)) {
				AL_bag.add(piece);
				kaat(remain, bag + piece + "-", AL_bag);
				AL_bag.remove(AL_bag.size() - 1); // explicit backtracking!
			}
		}
	}

	private static boolean isPalin(String str) {
		// TODO Auto-generated method stub
		int s =0;
		int e = str.length()-1;
		while(s<e) {
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
			s++;e--;
		}
		return true;
	}
}
