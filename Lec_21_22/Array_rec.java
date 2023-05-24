package Lec_21_22;

public class Array_rec {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
//		Print(0, arr);
		Print2(0, arr.length - 1, arr);
	}

	public static void Print(int s, int[] arr) {
		if (s == arr.length) {
			return;
		}
//		BP :Print(0,arr)
//		SP :Print(1,arr)
		System.out.println(arr[s]);
		Print(s + 1, arr);
	}

	public static void Print2(int s, int e, int[] arr) {
		if (s > e) {
			return;
		}
		int mid = (s + e) / 2;
		Print2(s, mid - 1, arr);
		System.out.println(arr[mid]);
		Print2(mid + 1, e, arr);
	}

	public static void printRev(int s, int[] arr) {
//		BP : printRev(s,arr)
//		SP : printRev(s+1,arr)
		if (s == arr.length) {
			return;
		}
		printRev(s + 1, arr);
		System.out.println(arr[s]);
	}

	public static int Max(int s, int[] arr) {
		if (s == arr.length - 1) {
			return arr[s];
		}
//		BP : Max(s,arr)
//		SP : Max(s+1,arr)
//		if(s==arr.length) {
//			return Integer.MIN_VALUE;
//		}
		int sp = Max(s + 1, arr);
		return Math.max(arr[s], sp);

	}

	public static int FirstOcc(int s, int[] arr, int ali) {
		if(s==arr.length) {
			return -1;
		}
//		BP : FO(s,arr,ali)
//		SP : FO(s+1,arr,ali)
		int sp = FirstOcc(s+1, arr, ali);
		if(arr[s] ==ali) {
			return s;
		}
		return sp;
	}

	public static int LastOcc(int s, int[] arr, int ali) {
		if(s==arr.length) {
			return -1;
		}
//		BP : LO(s,arr,ali)
//		SP : LO(s+1,arr,ali)
		int sp = LastOcc(s+1, arr, ali);
		if(sp==-1 && arr[s]==ali) {
			return s;
		}
		return sp;
	}
}
