package Lec_PQ_HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BT {
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

	public BT(int[] lvl) {
//		4 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 8 -1 9 -1 -1 -1 -1
		Queue<Node> Q = new LinkedList<>();
		Q.add(new Node(lvl[0]));
		root = Q.peek();
		int idx = 1;
		while (!Q.isEmpty() && idx < lvl.length) {
			Node curr = Q.poll();

			if (idx < lvl.length) {
				curr.left = new Node(lvl[idx]);
				Q.add(curr.left);
			}
			idx++;
			if (idx < lvl.length) {
				curr.right = new Node(lvl[idx]);
				Q.add(curr.right);
			}
			idx++;
		}
	}
	public void print() {
		HashMap<Integer,ArrayList<Integer>> HM = new HashMap<>();
		print(root,0,HM);
//		System.out.println(HM);
		ArrayList<Integer> ax = new ArrayList<>(HM.keySet());
		Collections.sort(ax);
		for(int key: ax) {
//			System.out.println(HM.get(key));
			for(int ali : HM.get(key)) {
				System.out.print(ali + " ");
			}
		}
		
	}
	private void print(Node nn,int axis,HashMap<Integer,ArrayList<Integer>> HM) {
		if(nn==null ||nn.data==-1) {
			return;
		}
//		System.out.println(nn.data + " - "+axis);
		ArrayList<Integer> AL = HM.getOrDefault(axis, new ArrayList<>());
		AL.add(nn.data);
		HM.put(axis, AL);
		
		print(nn.left,axis-1,HM);
		print(nn.right,axis+1,HM);
	}
}

public class Vertical_order {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] lvl = new int[10000];
		int idx =0;
		while(scn.hasNext()&& idx<lvl.length) {
			lvl[idx] = scn.nextInt();
			idx++;
		}
		while(idx<lvl.length) {
			lvl[idx] = -1;
		}
		BT B = new BT(lvl);
		B.print();

	}
}
