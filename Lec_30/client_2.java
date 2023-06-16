package Lec_30;

public class client_2 {
	public static void main(String[] args) {

		Student s = new Student("Chottu", 12);

		try {
			s.setAge(13);
			System.out.println(s.getAge());
			s.setAge(20);
			System.out.println(s.getAge());
			System.out.println("try END");
			if(2<3) {
				return ;
			}
		} catch (Exception e) {
			
			System.out.println("milgaya exception!!");
			return;
//			e.printStackTrace();
//			System.err.println(e.getMessage());
		} finally {
			System.out.println("finally start 1");
			System.out.println("finally start 2");
		}
		System.out.println("LOLO");
		int I = 10;
		System.out.println(I + 2);
	}

}
