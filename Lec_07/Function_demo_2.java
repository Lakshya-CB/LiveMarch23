package Lec_07;

public class Function_demo_2 {
	public static void main(String[] args) {
		System.out.println("bro!");
		fun1();
		System.out.println("Bye!");
	}

	public static void fun1() {
		System.out.println("fun1 start");
		fun2();
		System.out.println("fun1 end");
	}

	public static void fun2() {
		System.out.println("fun2 start");
		fun3();
		System.out.println("fun2 end");
	}

	public static void fun3() {
		System.out.println("fun3 start");
		System.out.println("fun3 end");
	}
}
