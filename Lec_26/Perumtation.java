package Lec_26;

import java.util.Arrays;

public class Perumtation {
	public static void main(String[] args) {
		int r = 2;
		int total = 3;
		perm(r, "", new boolean[total], total);
	}

	public static void perm(int r, String path, boolean[] picked, 
			int total) {
		if (r == 0) {
			System.out.println(path);
			System.out.println(Arrays.toString(picked));
			System.out.println("============");
			return;
		}
		for (int curr = 0; curr < total; curr++) {
//			curr!
			if (picked[curr] == false) {
				picked[curr] = true;
				perm(r - 1, path + "b" + curr, picked, total);
				picked[curr] = false;
			}
		}
	}
}
