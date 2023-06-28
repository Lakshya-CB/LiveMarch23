package lec_LL;

import java.util.Stack;

class Node {
	public Node(int ali) {
		// TODO Auto-generated constructor stub
		data = ali;
	}

	int data;
	Node next;
}

public class LinkedList {

	Node head;

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println("end");
	}

	public int size() {
		Node temp = head;
		int cnt = 0;
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya dheek rha hein?");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("kya dheek rha hein?");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kya dheek rha hein?");
		}
		Node temp = head;
		for (int cnt = 0; cnt < idx; cnt++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("Internally : kya dheek rha hein?");
		}
		Node temp = head;
		for (int cnt = 0; cnt < idx; cnt++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addLast(int ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node nn = new Node(ali);
		temp.next = nn;
	}

	public void addAt(int idx, int ali) {
		if (idx < 0 || idx > size()) {
			throw new RuntimeException("kya daal rha hein?");
		}
		if (idx == 0) {
			addFirst(ali);
		} else if (idx == size()) {
			addLast(ali);
		} else {

			Node nn = new Node(ali);
			Node prev = getNodeAt(idx - 1);
			Node after = prev.next;
			nn.next = after;
			prev.next = nn;
		}
	}

	public int removeLast() {
		if (size() <= 1) {
			return removeFirst();
		}
		Node secondLast = getNodeAt(size() - 2);
		Node last = secondLast.next;
		secondLast.next = null;
		return last.data;
	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya nikaal rha hein?");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kya nikaal rha hein?");
		}
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		} else {

			Node prev = getNodeAt(idx - 1);
			Node curr = prev.next;
			Node after = curr.next;

			prev.next = after;

			return curr.data;
		}
	}

	public void printRev() {
		printRev(head);
		System.out.println("Start");
	}

	private void printRev(Node nn) {
		if (nn == null) {
			return;
		}
		Node curr = nn;
		printRev(nn.next);
		System.out.print(curr.data + "<=");
		return;
	}

	public void Rev() {
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node after = curr.next;
//			System.out.println(curr.data);

			curr.next = prev;

			prev = curr;
			curr = after;
		}
		head = prev;
	}

	public void RevRec() {
		RevRec(head);
	}

	private Node RevRec(Node nn) {
		if (nn.next == null) {
			head = nn;
			return nn;
		}
//		BP : puri linkedList rev kar aur uski tail de!!
		Node curr = nn;
		Node tail = RevRec(nn.next);
		tail.next = curr;
		curr.next = null;
		return curr;
	}

	public void K_Rev(int k) {
		Node curr = head;
		Stack<Node> S = new Stack<>();
		Node nhead = null;
		Node ntail = null;
		while (curr != null) {
			Node after = curr.next;
			S.add(curr);

			if (S.size() == k) {
//				stack ke elements nikalo and usse new LinkedList mein daalo!!
				while (!S.isEmpty()) {
					Node temp = S.pop();
//					add this temp at the end of the ntail
					if (nhead == null) {
						nhead = temp;
						ntail = temp;
						ntail.next = null;
					} else {
						ntail.next = temp;
						ntail = temp;
						ntail.next = null;
					}
				}
			}

			curr = after;
		}
		while (!S.isEmpty()) {
			Node temp = S.pop();
//			add this temp at the end of the ntail
			if (nhead == null) {
				nhead = temp;
				ntail = temp;
				ntail.next = null;
			} else {
				ntail.next = temp;
				ntail = temp;
				ntail.next = null;
			}
		}
		head = nhead;
	}

}
