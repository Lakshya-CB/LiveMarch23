package Lec_30;

public class Student {
//	data members 
//	data parsing 
	private String Name = "gun shudaaa";
	private int Age = 10;
	
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) throws Exception {
		if(age<0) {
//			throw new RuntimeException("bhai beed dunga");
			throw new Exception("bhai kya gana to gane do ?");
		}
		this.Age = age;
	}
	
	public void Intro() {
		System.out.println(Name + " - " + Age);
		System.out.println(this);
	}

//	s1.partyWith(s2.Name);
	public void partyWith(String Name) {
		System.out.println(this.Name + " party with " + Name);
	}
	public Student() {
		
		this.Name ="jadduuu";
	}
	public Student(int I) {
		Age = I;
	}
	public Student(String str) {
		Name = str;
	}
	public Student(String str, int I) {
		
		this.Age= I;
		this.Name = str;
		
	}
	
}
