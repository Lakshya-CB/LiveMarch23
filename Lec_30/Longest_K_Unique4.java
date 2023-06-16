package Lec_30;

import java.util.Scanner;

public class Longest_K_Unique4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while(T>0) {
			T--;
			String str = scn.next();
			int k = scn.nextInt();
			solve(str, k);
		}
	}
	public static int solve(String str, int k) {
//		String str= "abbcdabcbbcba";
//		int k = 2;

		int s = 0;
		int e = 0;
		int score = 0;
		int[] freq = new int[26];
		int len = 0;
		
		while (true) {
//			ending bata rha hein char to add
			if (score <= k) {
				if(e==str.length()) {
					break;
				}
//				substring grow!!
				if(freq[str.charAt(e)-'a']==0) {
					score++;
				}
				freq[str.charAt(e)-'a']++;
				e++;
				
			} else {
//			delete the char at s
				freq[str.charAt(s)-'a']--;
				if(freq[str.charAt(s)-'a']==0) {
					score--;
				}
				s++;
			}
//			now i have added char at e.e++
//			System.out.println(str.substring(s,e)+ " - "+score);
			len = Math.max(e-s, len);
		}
		System.out.println(len);
		return len;
	}

}
