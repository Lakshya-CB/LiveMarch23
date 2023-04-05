package Lec_06;

import java.util.Scanner;

public class boston {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long T = sc.nextInt();
		int k = 0;
		while (k < T) {
			long m = sc.nextInt();
			long n = sc.nextInt();
			while (true) {
				if (m < n) {
					System.out.println("Harshit");
					break;
				}
				if (n < m) {
					System.out.println("Aayush");
					break;
				}
				if (n == m && m != 0 && n != 0) {
					System.out.println("Harshit");
					break;
				}
			}
			k++;
		}
	}
}
