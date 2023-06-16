package Lec_30;

public class Longest_K_Unique {
	public static void main(String[] args) {
		String str = "abbcdabcbbcba";
//		String str = "abc";
		
		for(int s =0;s<str.length();s++) {
			for(int e = s+1;e<=str.length();e++) {
				String ss = str.substring(s,e);
				System.out.println(ss + " - "+numOfUnique(ss));
			}
			
		}
	}
	public static int numOfUnique(String ss) {
		int[] freq = new int[26];
		int ans=0;
		for(int i=0;i<ss.length();i++) {
			if(freq[ss.charAt(i)-'a']==0) {
				ans++;
			}
			freq[ss.charAt(i)-'a']++;
		}
		return ans;
	}
	
}
