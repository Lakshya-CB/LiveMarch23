package Lec_09;

public class Rotate_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.println(-13%5);
		print(arr);
		Rotate(arr, 3);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}
	public static void Reverse(int[] arr,int L, int R) {
		while (L<R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}
	public static void Rotate(int[] arr, int rot) {
		rot = rot %arr.length;
		if(rot<0) {
			rot = rot+arr.length;
		}
		Reverse(arr, 0, arr.length-1);
		Reverse(arr,0, rot-1);
		Reverse(arr,rot,arr.length-1);
		
	}
	
}
