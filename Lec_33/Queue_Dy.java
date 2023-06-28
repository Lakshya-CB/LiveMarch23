package Lec_33;

public class Queue_Dy extends Queue {
	@Override
	public void add(int ali) {
		// TODO Auto-generated method stub
		if(isFull()) {
//			grow
			int[] big = new int[arr.length*2];
			for(int idx =0;idx<arr.length;idx++) {
				big[idx] = arr[(s+idx)%arr.length];
			}
			s=0;
			arr = big;
		}
		super.add(ali);
		
		
	}
}
