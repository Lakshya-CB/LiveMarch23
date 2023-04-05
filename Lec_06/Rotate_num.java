package Lec_06;

public class Rotate_num {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 23;

		int baaaaackup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;

			nod++;
		}
		rot = rot % nod;
		num = baaaaackup;
		System.out.println(nod);

		for (int r = 1; r <= rot; r++) {
			int digit = num % 10;
			int rem = num / 10;

			int mult = (int) Math.pow(10, nod - 1);
//		System.out.println(mult);
			num = digit * mult + rem;
			
			System.out.println(num);
		}
	}
}
