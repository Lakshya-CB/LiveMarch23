package Lec_33;

public class Client_Q {
	public static void main(String[] args) {
		Queue Q = new Queue_Dy();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);

		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());

		Q.add(60);
		Q.add(70);
		Q.add(80);
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		Q.add(90);
		Q.add(100);
		Q.add(110);
		for (int i = 1; i <= 10; i++) {
			Q.add(i * 1000);
		}
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		while (!Q.isEmpty()) {
			System.out.print(Q.poll()+" - ");
		}
	}
}
