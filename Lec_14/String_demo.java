package Lec_14;

public class String_demo {
	public static void main(String[] args) {
		String str = "abcdcba";
		System.out.println(str.length());
//		System.out.println(str[0]);
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));

		System.out.println("=" + find(str, ' '));
		System.out.println(str.indexOf("ello"));
		System.out.println(str.lastIndexOf("ello"));

//		System.out.println(str.startsWith("hellz"));
//		System.out.println(str.endsWith("lol"));
		System.out.println("-*-*-*-*-*-*-*-");
////		System.out.println(str.substring(0, 3));
//		printAllSubstring(str);
//		System.out.println(isPalindrome(str));
		printAllpalinSS2("nniittiinn");
	}

	public static int find(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
	}

	public static void printAllSubstring(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				if (isPalindrome(str.substring(s, e))) {
					System.out.println(str.substring(s, e));
				}
			}
		}
	}

	public static boolean isPalindrome(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static void printAllpalinSS2(String str) {
		for (int c = 0; c < str.length(); c++) {
			grow(str, c, c);
			grow(str, c, c+1);
			
		}
	}

	public static void grow(String str, int L, int R) {
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
				System.out.println(str.substring(L, R + 1));
				L--;
				R++;
			} else {
				break;
			}
		}
	}
}
