package Lec_09;

public class Rotate_ {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.println(-13%5);
		print(arr);
		Rotate(arr, -1);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void Rotate(int[] arr, int rot) {
		rot = rot %arr.length;
		if(rot<0) {
			rot = rot+arr.length;
		}
		for (int r = 1; r <= rot; r++) {
			int jeeb = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = jeeb;
		}
	}
	
}
