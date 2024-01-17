package Lec_Tree;

import java.util.LinkedList;
import java.util.Queue;

import Lec_Tree.BinaryTree.Node;

public class BST {

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

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
//		System.out.println(nn.data);
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "=>" + nn.data + "<=";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
		print(nn.left);
		print(nn.right);
	}

	public BST(int[] lvl) {
		Queue<Node> Q = new LinkedList<>();
		root = new Node(lvl[0]);
		Q.add(root);
		int idx = 1;
		while (!Q.isEmpty() && idx < lvl.length) {
			Node nn = Q.poll();
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}

	}

	public int min() {
		return min(root);
	}

	private int min(Node nn) {
		if (nn.left == null) {
			return nn.data;

		}
		return min(nn.left);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn.right == null) {
			return nn.data;

		}
		return max(nn.right);
	}

	public boolean isBST() {
		return isBST(root);
	}

	private boolean isBST(Node nn) {
		if (nn == null) {

		}
		boolean self = max(nn.left) < nn.data && nn.data < min(nn.right);
		boolean L = isBST(nn.left);
		boolean R = isBST(nn.right);
		return L && R && self;
	}

	public void add(int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data < ali) {
			nn.right = add(nn.right, ali);
		} else {
			nn.left = add(nn.left, ali);
		}
		return nn;
	}

	public void remove(int ali) {
		root = remove(root, ali);
	}

	private Node remove(Node nn, int ali) {
		if (nn.data < ali) {
			nn.right = remove(nn.right, ali);
		} else if (nn.data > ali) {
			nn.left = remove(nn.left, ali);
		} else {
//			remove!!
			if (nn.left == null && nn.right == null) {
				return null;
			}
			if(nn.left==null && nn.right!=null) {
				return nn.right;
			}
			if(nn.left!=null && nn.right==null) {
				return nn.left;
			}
			/////////////////////////
			nn.data = min(nn.right);
			nn.right = remove(nn.right, nn.data);
		}
		return nn;
	}

}
