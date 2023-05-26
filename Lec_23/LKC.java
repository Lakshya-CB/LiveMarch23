package Lec_23;

public class LKC {
	public static void main(String[] args) {
		solve("234", "");
	}

	public static void solve(String buttons, String ans) {
//		BP : buttons : 246
		if(buttons.isEmpty()) {
			System.out.println(ans);
			return;
		}
		String remain = buttons.substring(1);// 46
		char ch = buttons.charAt(0); //2
		String op = options(ch); //abc
		for(int i=0;i<op.length();i++) {
			solve(remain, ans+op.charAt(i));
		}
		
		
	}
	public static String options(char ch) {
		String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return arr[ch-'2'];
	}
}
