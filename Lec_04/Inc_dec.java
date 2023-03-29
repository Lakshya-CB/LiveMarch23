package Lec_04;

import java.util.Scanner;

public class Inc_dec {
	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		int n = snc.nextInt();
		int prev = Integer.MAX_VALUE;
		int dec_state = 1;
		int ans = 1;
		while (n > 0) {
			int curr = snc.nextInt();
			System.out.println(curr + " - " + prev);
			if (dec_state ==1 && curr > prev) {
				dec_state = 0;
			}
			if(dec_state==0 &&  curr<prev) {
//				answer should be false!!!!!!
				ans = 0;
			}
			if(curr==prev) {
//				answer should be false!!!!!!
				ans = 0;
			}
			prev = curr;
			n--;
		}
		if(ans==0){
			System.out.println("false");
		}else{
			System.out.println("true");
		}
	}
}
