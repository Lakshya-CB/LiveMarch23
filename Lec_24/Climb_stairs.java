package Lec_24;

public class Climb_stairs {
	public static void main(String[] args) {
		kuud(0, "", 4);
	}

	public static void kuud(int curr, String path, int dest) {
		if(curr==dest) { //+ve BC
			System.out.println(path);
			return;
		}
		if(curr>dest) {
			return;
		}
		kuud(curr+1, path+1,dest);
		kuud(curr+2, path+2,dest);
		
	}
}
