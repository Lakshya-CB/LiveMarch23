package Lec_27;

public class comb_all_type {
	public static void main(String[] args) {
		int n = 4;
		int r = 2;
//		PT(r, -1, "", n);
		seat(0, r, "", n);
	}

	public static void PT(int r, int prev, String path, int n) {
		if (r == 0) {
			System.out.println(path);
			return;
		}
		for (int curr = prev + 1; curr < n; curr++) {
//			curr!
			PT(r - 1, curr, path + "b" + curr, n);
		}
	}

	public static void seat(int curr, int toPlace, String path, int total_seats) {
		if(toPlace==0) {// +ve BC
			System.out.println(path);
			return;
		}
		if(curr==total_seats) {// -ve BC
			return;
		}
		seat(curr+1, toPlace-1, path+"q"+curr, total_seats);// Include
		seat(curr+1, toPlace, path, total_seats);// Exclude
		
	}
}
