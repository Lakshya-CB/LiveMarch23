package Lec_08;

public class array_demo {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		System.out.println(arr);
//		length ?
		System.out.println(arr.length);
//		get!! at inedx i => arr[i]
		int ali = arr[0];
		System.out.println(ali);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
//		System.out.println(arr[-1]);
//		set bhalue at index i
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		
		System.out.println("==========");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
				
		
		
		
	}
}
