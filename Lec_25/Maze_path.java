package Lec_25;

public class Maze_path {
	public static void main(String[] args) {
		solve(0, 0,"", 2, 2);
	}

	public static void solve(int r, int c, String path, int dest_r, int dest_c) {
		if (r == dest_r && c == dest_c) {
			System.out.println(path);
			return;
		}
		if (r > dest_r || c > dest_c) {
			return;
		}
		solve(r, c + 1, path + "R", dest_r, dest_c);
		solve(r + 1, c, path + "D", dest_r, dest_c);
	}
}
