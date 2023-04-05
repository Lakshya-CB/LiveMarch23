package Lec_07;

public class Rotate_num {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 3;
		int baaaackup = num;
		
		int nod =0;
		while(num>0) {
			num= num/10;
			nod++;
		}
		rot = rot%nod;
		
		int mult = (int)Math.pow(10, rot);
		System.out.println(mult);
		num = baaaackup;
//		/////////////////////////////////
		int p1 = num/mult;
		int p2 = num%mult;
		
		int mult2 = (int)Math.pow(10,nod-rot);
		System.out.println(p1+p2*mult2);
		
	}
}
