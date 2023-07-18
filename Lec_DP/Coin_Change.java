package Lec_DP;

import java.util.Scanner;

public class Coin_Change {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(CoinC(A, 0, "", arr, new Integer[A + 1][arr.length]));
	}

	public static int CoinC(int A, int idx, String str, int[] coins) {
//		1<=N<=250 1<=m<=50 1 <= Si <= 50
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		int sp1 = CoinC(A - coins[idx], idx, str + coins[idx], coins);// Include
		int sp2 = CoinC(A, idx + 1, str, coins);// Exclude
		return sp1 + sp2;
	}

	public static int CoinC(int A, int idx, String str, int[] coins, Integer[][] dp) {
//		1<=N<=250 1<=m<=50 1 <= Si <= 50
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}
		int sp1 = CoinC(A - coins[idx], idx, str + coins[idx], coins, dp);// Include
		int sp2 = CoinC(A, idx + 1, str, coins, dp);// Exclude
//		(A,idx)!! dp[A][idx]!!
		dp[A][idx] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int Amount, int[] coins) {
		int[][] dp = new int[Amount + 10][coins.length + 10];

		for (int A = 0; A <= Amount; A++) {
			for (int idx = coins.length; idx >= 0; idx--) {
//				dp[A][idx] !!
				if(A==0) {
					dp[A][idx] = 1;
					continue;
				}
				if(idx == coins.length) {
					dp[A][idx] = 0;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];// Include
				}
				int sp2 = dp[A][idx + 1];// Exclude
				dp[A][idx] = sp1 + sp2;
			}

		}

		return dp[Amount][0];
	}

//	public static void CoinC(int A, int idx, String str, int[] coins) {
////		1<=N<=250 1<=m<=50 1 <= Si <= 50
//		if(A==0) {
//			System.out.println(str);
//			return;
//		}
//		if (A < 0||idx==coins.length) {
//			return;
//		}
//		CoinC(A - coins[idx], idx, str + coins[idx], coins);// Include
//		CoinC(A, idx + 1, str, coins);// Exclude
//
//	}
}
