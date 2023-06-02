package Lec_26;

public class Blocked_Maze_path {
	public static void main(String[] args) {
		int[][] maze = { 
				{ 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0 }, 
				{ 0, 1, 0, 0 }, 
				{ 0, 0, 1, 0 } };
		solve(0, 0, "", maze,new boolean[maze.length][maze[0].length]);
	}

	public static void solve(int r, int c, String path,
			int[][] maze, boolean[][] Visited) {
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(path);
			return;
		}
		if (r > maze.length - 1 || c > maze[0].length - 1 
				|| r < 0 || c < 0|| maze[r][c]==1 || Visited[r][c]) {
			return;
		}
		Visited[r][c] = true;
		solve(r - 1, c, path + "U", maze,Visited);
		solve(r + 1, c, path + "D", maze,Visited);
		solve(r, c - 1, path + "L", maze,Visited);
		solve(r, c + 1, path + "R", maze,Visited);
		Visited[r][c] = false;
	}
}
