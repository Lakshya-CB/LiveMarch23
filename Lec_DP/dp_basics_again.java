package Lec_DP;

public class dp_basics_again {
	public static void main(String[] args) {
		int n = 5;
//		System.out.println(Fibo_TD(n, new Integer[n + 1]));
		System.out.println(Fibo_BU(n));
	}

//	 Top Down approach, memoizatin
	public static int Fibo_TD(int n, Integer[] arr) {
		if (n <= 1) {
			return n;
		}
		if (arr[n] != null) {
			return arr[n];
		}
		int sp1 = Fibo_TD(n - 1, arr);
		int sp2 = Fibo_TD(n - 2, arr);
//		Fibo(n) = sp1+sp2;
		arr[n] = sp1 + sp2;
		return sp1 + sp2;
	}

//	Bottoms Up!! Tabulation!!
	public static int Fibo_BU(int N) {
		int[] dp = new int[N + 1];
		dp[1] = 1;
		for (int n = 2; n <= N; n++) {
//			dp[n]!!! = Fibo(n-1)+Fibo(n-2)
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
//			Fibo(n) = sp1+sp2;
			dp[n] = sp1 + sp2;
		}
		return dp[N];
	}
}
