package Lec_DP;

public class dp_basics {
	public static void main(String[] args) {
		int n = 5000;
//		System.out.println(FiboTD(n, new Integer[n + 1]));
		System.out.println(FboBU(n));
	}

	public static int Fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}

	public static int FiboTD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = FiboTD(n - 1, dp);
		int sp2 = FiboTD(n - 2, dp);
//		Fibo(n) => dp[n]!!
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int FboBU(int N) {
//		Step 5: dp array ka size!!
		
		int[] dp = new int[N+100];
//		Step 4: Base case
		dp[1] = 1;

//		Step 1: smallest to biggest!
		for (int n = 2; n <= N; n++) { //
//			code copy pastta 
//			from TD ,and use DP array
			
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
//			Fibo(n) => dp[n]!!
			dp[n] = sp1 + sp2;
		}
//		Step 3: return bugest problem!!
		return dp[N];

	}

}
