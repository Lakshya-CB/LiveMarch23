package Lec_23;

import java.util.ArrayList;

public class LKC {
	public static void main(String[] args) {
		solve("23", "");
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
	public ArrayList<String> letterCombinations(String digits) {
        if (digits==null ||digits.length()==0 )  {
			ArrayList<String> bresult= new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		
		//678
		String remain= digits.substring(1); //78
		char ch= digits.charAt(0); //6
		
		ArrayList<String> result=  letterCombinations(remain); //6 words of 78
		ArrayList<String> TotalResult= new ArrayList<>(); //24 words of 678
		
		String op =options[ch-'2']; //pqrs
		for(int i=0;i<op.length();i++) {
			
			for(String ali : result) {
				TotalResult.add(op.charAt(i) + ali);
			}
		}
		
		return TotalResult;
		
	}
	static String[] options = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
}
