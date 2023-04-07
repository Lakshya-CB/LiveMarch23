package Lec_08;

public class array_demo_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int table = 3;
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = table;
			table = table + 3;
		}
//		System.out.println(arr);
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx]+" ");
		}
		
	}
}
