package Lec_BTree;

public class BTree {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void disp() {
		disp(root);
	}

	private void disp(Node nn) {
		if (nn == null) {
			return;
		}
//		10K 
		System.out.println(nn.data);
		disp(nn.left);
		disp(nn.right);
	}

	public BTree(int[] pre, int[] in) {
		root = createTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node createTree(int[] pre, int pre_s, int pre_e, int[] in, int in_s, int in_e) {
		if(pre_s>pre_e ||in_s>in_e) {
			return null;
		}
		
//		print(pre, pre_s, pre_e);
//		System.out.println("in_idx" +in_s+"-"+ in_e);
//		print(in, in_s, in_e);
//		System.out.println("======================");
		Node nn = new Node(pre[pre_s]);

		int f = -1;
		int l_size = 0;
		for (int idx = in_s; idx <= in_e; idx++) {
			if (in[idx] == pre[pre_s]) {
				f = idx;
				break;
			}
			l_size++;
		}
		nn.left = createTree(pre, pre_s + 1, pre_s + l_size, in, in_s, f - 1);
		nn.right = createTree(pre, pre_s + l_size + 1, pre_e, in, f + 1, in_e);

		return nn;
	}
	private void print(int[] arr, int s, int e) {
		for(int idx =s;idx<=e;idx++) {
			System.out.print(arr[idx]+ " ");
			
		}
		System.out.println();
	}
}
