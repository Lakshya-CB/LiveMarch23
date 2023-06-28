package lec_LL;

public class Client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		for (int ali = 10; ali <= 110; ali = ali + 10) {
			LL.addLast(ali);
		}
		LL.disp();
		LL.K_Rev(3);
		LL.disp();
//		LL.Rev();
//		LL.RevRec();
//		LL.disp();

	}
}
