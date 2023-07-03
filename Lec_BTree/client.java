package Lec_BTree;

public class client {
	public static void main(String[] args) {
		int[] in = { 40, 20, 50, 10, 30, 60 };
		int[] pre = { 10, 20, 40, 50, 30, 60 };

		BTree BT = new BTree(pre, in);
		BT.disp();
	}
}
