package Lec_23;

public class Sub_seq {
	public static void main(String[] args) {
		SS("abc", "");
	}

	public static void SS(String str, String team) {
		if (str.isEmpty()) {
			System.out.println(team+")");
			return;
		}
//		str = "abcd"
//		team = "Z"
		String remain = str.substring(1);// bcd
		char ch = str.charAt(0);
		SS(remain, team + ch);
		SS(remain, team);

	}
}
