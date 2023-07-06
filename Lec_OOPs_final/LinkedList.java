package Lec_OOPs_final;
public class LinkedList <UU>{

	Node head;

	class Node {
		public Node(UU ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		UU data;
		Node next;
	}
	
	
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

	public UU getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya dheek rha hein?");
		}
		return head.data;
	}

	public UU getLast() {
		if (isEmpty()) {
			throw new RuntimeException("kya dheek rha hein?");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public UU getAt(int idx) {
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

	public void addFirst(UU ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addLast(UU ali) {
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

	public void addAt(int idx, UU ali) {
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

	public UU removeLast() {
		if (size() <= 1) {
			return removeFirst();
		}
		Node secondLast = getNodeAt(size() - 2);
		Node last = secondLast.next;
		secondLast.next = null;
		return last.data;
	}

	public UU removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya nikaal rha hein?");
		}
		UU ans = head.data;
		head = head.next;
		return ans;
	}

	public UU removeAt(int idx) {
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
}
