package Lec_33;

public class Stack {
	public int[] arr;
	public int tos = -1;

	public Stack() {
		this(5);
	}

	public Stack(int cap) {
		arr = new int[cap];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("Full hun bhai");
		}
		tos++;
		arr[tos] = ali;
	}

	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("kya nikal rha hein ?");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("kya dheek rha hein ?");

		}
		return arr[tos];
	}

	public void print() {
		for (int idx = 0; idx <= tos; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}
}
