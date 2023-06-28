package Lec_33;

public class Dynamic_Stack extends Stack{
	@Override
	public void add(int ali) {
		if(isFull()) {
//			grow!!
			int[] big  = new int[super.arr.length*2];
			for(int i =0;i<arr.length;i++) {
				big[i]  = arr[i];
			}
			arr = big;
		}
		
		super.add(ali);
	}
}
