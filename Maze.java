
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
	public int getD() {
		return d;
	}
	//hellper function

	public List<Coordinate> getNextStates(Coordinate current) {
        int x = current.getX();
        int y = current.getY();

        List<Coordinate> nextStates = new ArrayList<>();

        // Check adjacent cells (up, down, left, right) and add valid coordinates to nextStates
        if (isValid(x - 1, y) && !isBlocked(x - 1, y)) {
            nextStates.add(new Coordinate(x - 1, y));
        }
        if (isValid(x + 1, y) && !isBlocked(x + 1, y)) {
            nextStates.add(new Coordinate(x + 1, y));
        }
        if (isValid(x, y - 1) && !isBlocked(x, y - 1)) {
            nextStates.add(new Coordinate(x, y - 1));
        }
        if (isValid(x, y + 1) && !isBlocked(x, y + 1)) {
            nextStates.add(new Coordinate(x, y + 1));
        }

        return nextStates;
    }

    private boolean isValid(int x, int y) {
        return x >= 0 && x < d && y >= 0 && y < d; // Check if the coordinates are within the maze bounds
    }

    private boolean isBlocked(int x, int y) {
        return !maze[x][y]; // Check if the cell is blocked (true) or open (false)
    }




}
