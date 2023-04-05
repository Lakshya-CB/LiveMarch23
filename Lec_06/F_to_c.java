package Lec_06;

public class F_to_c {
	public static void main(String[] args) {
		int minF = 0;
		int maxF = 100;
		int step = 20;

		int F = minF;
		while (F <= maxF) {

			int C = (int)((5 / 9.0) * (F - 32));
//			int C =  5* (F - 32)/9;
			
			System.out.println(F + "\t" + C);

			F = F + step;
		}
	}
}
