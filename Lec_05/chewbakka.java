package Lec_05;

import java.util.Scanner;
 
public class chewbakka {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long ans = 0;
		long mult = 1;
		while (n > 0) {
			long dogit = n % 10;
			if (n != 9 && dogit >= 5) {
				dogit = 9 - dogit;
			}
			ans = ans + dogit * mult;

//			System.out.println(dogit + " - "+mult);

			mult = mult * 10;
			n = n / 10;
		}
		System.out.println(ans);
	}
}
