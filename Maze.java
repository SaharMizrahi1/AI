
public class Maze {

	private boolean[][] maze;
	private int d;
	
	public Maze(int d) {
		this.d = d;
		maze = new boolean[d][d];
	}
	
	public void set(int i, int j, boolean b) {
		maze[i][j] = b;
	}
}
