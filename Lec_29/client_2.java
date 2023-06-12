package Lec_29;

public class client_2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Name = "pappu";
		s1.Age = 10;

		Student s2 = s1;
		s2.Name = "chomu";

		System.out.println(s1.Name + " : " + s2.Age);
	}
}
