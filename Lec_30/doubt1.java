package Lec_30;

import java.util.HashMap;
import java.util.Scanner;

public class doubt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str1 = sc.next();
			int k = sc.nextInt();
			System.out.println(lss(str1, k));
		}
	}

	public static int lss(String str1, int k) {
		int cnt = 0;
		if (str1.length() < k) {
			return -1;
		}
		for (int s = 0; s < str1.length(); s++) {
			for (int e = s + 1; e <= str1.length(); e++) {
//				s to e => find number of unique elements
//				if ((e - s) == k)
//					cnt++;
			}
		}
		return cnt;
	}
}
