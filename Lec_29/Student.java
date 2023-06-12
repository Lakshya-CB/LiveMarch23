package Lec_29;

public class Student {
//	data members 
//	data parsing 
	String Name = "gun shudaaa";
	int Age = 10;

	public void Intro() {
		System.out.println(Name + " - " + Age);
		System.out.println(this);
	}

//	s1.partyWith(s2.Name);
	public void partyWith(String Name) {
		System.out.println(this.Name + " party with " + Name);
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
		Name = "jaaduuu";
		Age = 9;
	}
	public Student(int lai) {
		// TODO Auto-generated constructor stub
		Name = "jaaduuu";
		Age = lai;
	}
	public Student(String str) {
		// TODO Auto-generated constructor stub
		Name = str;
		Age = 0;
	}
}
