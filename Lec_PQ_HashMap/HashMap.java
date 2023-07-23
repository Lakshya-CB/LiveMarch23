package Lec_PQ_HashMap;

import java.util.ArrayList;

public class HashMap {
	class Node {
		public Node(String key, Integer val) {
			// TODO Auto-generated constructor stub
			K = key;
			V = Val;

		}

		String K;
		int V;
		Node next;
	}

	int size = 0;
	ArrayList<Node> Buckets;

	public HashMap() {
		Buckets = new ArrayList<>();
		for (int cnt = 1; cnt <= 4; cnt++) {
			Buckets.add(null);
		}
	}

	public void put(String Key, Integer Val) {
		int bn = HasFn(Key);
		Node head = Buckets.get(bn);
		Node nn = head;
		while (nn != null) {
			if (nn.K.equals(Key)) {
				nn.V = Val;
				return;
			}
			nn = nn.next;
		}
		nn = new Node(Key, Val);
		nn.next = head;
		Buckets.set(bn, nn);
		size++;
//		//////////////////////
		double avg_size_bc = (size * 1.0) / Buckets.size();
		if (avg_size_bc > 0.75) {
			rehash();
		}

	}

	private void rehash() {
		ArrayList<Node> old = Buckets;
		Buckets = new ArrayList<>();
		for (int cnt = 1; cnt <= old.size() * 2; cnt++) {
			Buckets.add(null);
		}
		for (Node head : old) {
			Node nn = head;
			while (nn != null) {
				put(nn.K, nn.V);
				nn = nn.next;
			}
		}

	}

	private int HasFn(String key) {
		// TODO Auto-generated method stub
		int i = key.hashCode();
		i = i % Buckets.size();
		if (i < 0) {
			i = i + Buckets.size();
		}
		return key.hashCode();
	}
}
