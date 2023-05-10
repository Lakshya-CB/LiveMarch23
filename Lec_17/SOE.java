package Lec_17;

public class SOE {
	public static void main(String[] args) {
		int n = 25;
		solve(n);
	}

	public static void solve(int n) {
		boolean[] isComposite = new boolean[n + 1];
		for (int div = 2; div * div <= n; div++) {
			if (isComposite[div] == false) {
				for (int table = div * div; table <= n; table = table + div) {
//				System.out.println("composite="+table);
					isComposite[table] = true;
				}
			}
//			System.out.println("==========");
		}
		for (int num = 2; num <= n; num++) {
			if (isComposite[num] == false) {
				System.out.println(num);
			}
		}
	}
}
