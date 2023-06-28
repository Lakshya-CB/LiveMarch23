package Lec_33;

import java.util.ArrayList;

public class client {
	public static void main(String[] args) {
//		c1 
		C obj1 = new C();
		System.out.println(obj1.dataP);
		System.out.println(obj1.dataC);

		////////////////////////////////
		System.out.println(obj1.data); // variable ka collision is resolved by RHS
		System.out.println(((P) obj1).data);
		System.out.println("=============");

		obj1.funP();
		obj1.funC();

		obj1.fun(); // C
		((P) obj1).fun(); // P

		System.out.println("=============");

		////////////////////////////////
//		c2
		P obj2 = new C(); // compiler only looks at LHS
//		JVM deekhta hein RHS
		System.out.println(obj2.dataP);
		System.out.println(((C) obj2).data);
		System.out.println(((C) obj2).dataC);

		////////////////////////////////////////
//		c3
		P obj3 = new P();
		
		Object O = new C();
		System.out.println(O);
		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(10);
		
		// System.out.println(((C)obj3).dataP);
//		System.out.println(((C)obj3).data);
//		
//		///////////////
//		c4 : => obj4 =>
//		C obj4  = new P();

	}
}
