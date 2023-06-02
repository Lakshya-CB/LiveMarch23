package Lec_25;

public class partioning {
	public static void main(String[] args) {
		
		kaat("abc","");
	}

	public static void kaat(String table, String bag) {
//		table = abcd
		if(table.isEmpty()) {
			System.out.println(bag);
			return;
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0,chakku); //a
			String remain = table.substring(chakku);// bcd
//			System.out.println(piece+"--"+remain );
			kaat(remain, bag+piece+"-");
			
		}
	}
}
