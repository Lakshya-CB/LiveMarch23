package Lec_29;

public class OOps_swap {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Name = "A";
		s1.Age = 10;

		Student s2 = new Student();
		s2.Name = "B";
		s2.Age = 20;

		System.out.println(s1.Name + s1.Age);
		System.out.println(s2.Name + s2.Age);
//		Test1(s1, s2);
		int myAge = 100;
		String myName = "lal badshah";
		Test3(s1, s2.Name, s2.Age, myAge, myName);

		System.out.println(s1.Name + s1.Age);
		System.out.println(s2.Name + s2.Age);
	}

	public static void Test3(Student s1, String Name,
			int Age, int myAge, String myName) {
		s1.Name = "";
		s1.Age = 0;

		Name = "";
		Age = 0;

		myName = "";
		myAge = 0;
	}

	public static void Test2(Student s1, Student s2) {
		String temp_s = s1.Name;
		s1.Name = s2.Name;
		s2.Name = temp_s;

		int temp_i = s1.Age;
		s1.Age = s2.Age;
		s2.Age = temp_i;
	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}
}
