package Lec_01;

public class Report_Card {
	public static void main(String[] args) {
		int num = 73;
		if (50 <= num && num < 60) {
			System.out.println("E");
		} else if (60 <= num && num < 70) {
			System.out.println("D");
		} else if (num >= 90) {
			System.out.println("A");
		} else if (num >= 80 && num < 90) {
			System.out.println("B");
		} else if (num >= 70 && num < 80) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

	}
}
