package Lec_Graph;

import java.util.*;

class Node {
	public int data;
	public Node next;

	Node() {
		this.data = 0;
		this.next = null;
	}

	Node(int data) {
		this.data = data;
		this.next = null;
	}

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

class LinkedList {
	public Node head;

	LinkedList() {
		head = null;
	}

	public void append(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
			return;
		}
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_node;
	}

	public static Node rev(Node head, int k) {
		Node prev = null;
		Node next = null;
		Node curr = head;
		int count = 0;
		while (count < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if (next != null) {
			head.next = rev(next, k);
		}
		return prev;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		LinkedList list = new LinkedList();
		for(int i=0;i<n;i++) {
			list.append(sc.nextInt());
		}
//		list.append(1);
//		list.append(2);
//		list.append(3);
//		list.append(4);
//		list.append(5);
		System.out.println("Original List: ");
		list.printList();
		Node reversedHead = LinkedList.rev(list.head, k);
		System.out.println("Reversed List: ");
		while (reversedHead != null) {
			System.out.print(reversedHead.data + " ");
			reversedHead = reversedHead.next;
		}
	}
}
