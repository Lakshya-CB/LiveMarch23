package Lec_DP;

public class climb_stair {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(solve(0, n));
	}

	public static int solve(int curr, int dest) {
		if (curr == dest) {
			return 1;
		}
		if (curr > dest) {
			return 0;
		}
		int sp1 = solve(curr + 1, dest);
		int sp2 = solve(curr + 2, dest);
		return sp1 + sp2;
	}

	public static int solveTD(int curr, int dest, Integer[] dp) {
		if (curr == dest) {
			return 1;
		}
		if (curr > dest) {
			return 0;
		}
		if (dp[curr] != null) {
			return dp[curr];
		}
		int sp1 = solveTD(curr + 1, dest, dp);
		int sp2 = solveTD(curr + 2, dest, dp);
//		solve(curr) =>dp[curr]!!
		dp[curr] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int dest) {
		int[] dp = new int[dest + 2];
//		if (curr == dest) {
//			return 1;
//		}
//		if (curr > dest) {
//			return 0;
//		}
		dp[dest]=1;
		
		for (int curr = dest-1; curr >= 0; curr--) {
			int sp1 = dp[curr + 1];
			int sp2 = dp[curr + 2];
//			solve(curr) =>dp[curr]!!
			dp[curr] = sp1 + sp2;
		}
		return dp[0];
	}
}
