package Lec_07;

public class global_2 {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println(global_2.val);
		fun(20);
	}

	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(global_2.val);
		val = val + 60;
		global_2.val = val + 10;
		System.out.println(val);
		System.out.println(global_2.val);
	}

}
