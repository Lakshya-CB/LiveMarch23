package lec_LL;

public class Client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		for (int ali = 10; ali <= 50; ali = ali + 10) {
			LL.addLast(ali);
		}
		System.out.println(LL.getMid());
//		LL.disp();
//		LL.K_Rev(3);
//		LL.disp();
//		LL.Rev();
//		LL.RevRec();
//		LL.disp();

	}
}
