package Lec_OOPs_final;

public class student implements Comparable<student>{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + age + "," + name + "}";
	}

	int age;
	String name;

	public student(int a, String s) {
		age = a;
		name = s;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(student o) {
//		this.compareTo(o) => this -o
//		A.compareTo(B) = > A-B;
		return this.age - o.age;
	}
}
