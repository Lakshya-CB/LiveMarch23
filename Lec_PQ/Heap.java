package Lec_PQ;

import java.util.ArrayList;

public class Heap<Ui extends Comparable<Ui>> {
	ArrayList<Ui> AL;

	public Heap() {
		// TODO Auto-generated constructor stub
		AL = new ArrayList<>();
	}

	public void add(Ui ali) {
		AL.add(ali); // CBT
		upheapify(AL.size() - 1);

	}

	private void upheapify(int child) {
		int parent = (child - 1) / 2;
//		if (AL.get(child) - AL.get(parent)<0) { //min heap!!
		if (AL.get(child).compareTo(AL.get(parent)) < 0) {
			swap(child, parent);
			upheapify(parent);
		}
	}

	private void swap(int i, int j) {
		Ui temp = AL.get(i);
		AL.set(i, AL.get(j));
		AL.set(j, temp);
	}

	public Ui peek() {
		return AL.get(0);
	}

	public Ui poll() {
		Ui ans = AL.get(0);
		AL.set(0, AL.get(AL.size() - 1));
		AL.remove(AL.size() - 1);
		downHeapify(0);
		return ans;
	}

	private void downHeapify(int p) {
		int L = 2 * p + 1;
		int R = 2 * p + 2;
		int min = p;
		if (L < AL.size() && AL.get(min).compareTo(AL.get(L)) > 0) {
			min = L;
		}
		if (R < AL.size() && AL.get(min).compareTo(AL.get(R)) > 0) {
			min = R;
		}
		if (p != min) {
			swap(min, p);
			downHeapify(min);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return AL + "";
	}

}
