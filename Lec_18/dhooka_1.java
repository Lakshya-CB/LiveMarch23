package Lec_18;

public class dhooka_1 {
	public static void main(String[] args) {
		int n = 100_000;
		long start = System.currentTimeMillis();

		String str = "";
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (int i = 0; i < n; i++) {
//			str = str + i;// O(n)
			// sum = sum + i;//O(1)
			sb.append(i);
		}
//		str = sb+"";
		str = sb.toString();
		long end = System.currentTimeMillis();

		System.out.println((end - start) / 1000.0);
	}

}
