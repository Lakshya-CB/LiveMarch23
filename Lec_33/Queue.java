package Lec_33;

public class Queue {
	int[] arr;
	int s;
	int size;

	public Queue() {
		this(5);
	}

	public Queue(int cap) {
		arr = new int[cap];
	}
	public int size() {
		return size;
	}
	public boolean isFull() {
		return size()==arr.length;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public int peek() {
		return arr[s];
	}
	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("kya add kar rha hein ?");
		}
		int idx = (s+size())%arr.length;
		arr[idx]= ali;
		size++;
	}
	public int poll() {
		int ans = arr[s];
		s = (s+1)%arr.length;
		size--;
		return ans;	
	}
}
