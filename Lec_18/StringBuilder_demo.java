package Lec_18;

public class StringBuilder_demo {
	public static void main(String[] args) {
		String str = "abcd";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		sb.setCharAt(2, '?');//O(1)
		System.out.println(sb);
		sb.append("asdsdh ioh d;saoih");//O(1)
		System.out.println(sb);
		sb.insert(3, 'U'); //O(n)
		System.out.println(sb);
		sb.delete(0, 7);
		System.out.println(sb);
	}
}
