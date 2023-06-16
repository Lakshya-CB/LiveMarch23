package Lec_30;

public class client {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
//		s1.Intro();
//		s1.Age = -1;
		s1.setAge(10);
		s1.Intro();
		s1.setAge(20);
		s1.Intro();
		
		s1.setAge(-10);
		
		System.out.println("?????????");
		
	}
}
