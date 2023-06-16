package Lec_31;

public class client {
	public static void main(String[] args) {
		Stack S = new Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		
		S.print();
		
		System.out.println(S.peek());
		
		System.out.println(S.pop());
		S.print();
		
		System.out.println(S.pop());
		S.print();
		System.out.println(S.pop());
		S.print();
		System.out.println(S.pop());
		S.print();
		System.out.println(S.pop());
		S.print();
		
		
	}
}
