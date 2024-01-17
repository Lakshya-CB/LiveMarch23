package Lec_Doubts_Random;

public class K_unique_char {
	public static void main(String[] args) {
		String str = "abcabczbcbczzbcbcabc";
		solve(str, 3);
	}

	public static void solve(String str, int k) {
		int e = 0; // char to ins
		int s = 0; // char to del
		int[] freq = new int[26];
		int marks = 0;
		int ans =0;
		while (true) {
			if (marks <= k) {
				if(e==str.length()) {
					break;
				}
//				grow!!
				char ch = str.charAt(e);
				freq[ch - 'a']++;
				if (freq[ch - 'a'] == 1) {
					marks++;
				}
				e++;
			} else {
//				del!!
				char ch = str.charAt(s);
				freq[ch - 'a']--;
				if (freq[ch - 'a'] == 0) {
					marks--;
				}
				s++;
			}
//			e index!! => the next char that you will add!!
//			s index tells you the char that you will del!!
			System.out.println(str.substring(s,e)+"=>"+marks +"--"+(e-s));
			if(marks<=k) {
				ans = Math.max(e-s, ans);
			}
		}
		System.out.println(ans);
	}
}
