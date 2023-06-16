package Lec_30;

public class Longest_K_Unique2 {
	public static void main(String[] args) {
//		1
//		rrtafdfsdfghjyughjmghnvb
//		20
		String str = "rrtafdfsdfghjyughjmghnvb";
//		String str = "abc";

		for (int s = 0; s < str.length(); s++) {
			int unique = 0;
			int[] freq = new int[26];
			for (int e = s; e < str.length(); e++) {
//				add char(e) in my ss
				String ss = str.substring(s, e + 1);
				if (freq[str.charAt(e) - 'a'] == 0) {
					unique++;
				}
				freq[str.charAt(e) - 'a']++;
				System.out.println(ss +" - "+unique);
			}
		}
	}


}
