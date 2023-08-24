
// you need to complete the implementation of the class
public class Solution {

	private Path path;

	public Solution(Path path) { // shaked added
        this.path = path;
    }
	
	public void print() {
		// implement - shaked added

		List<Coordinate> coordinates = path.getCoordinates();

        System.out.print("UCS(search " + nodesExplored + " nodes; path length " + path.getCost() + "): "); // nodesExplored - not final - need to check
        for (Coordinate coordinate : coordinates) {
            System.out.print("(" + (coordinate.getX() + 1) + "," + (coordinate.getY() + 1) + ")");
            if (coordinate != coordinates.get(coordinates.size() - 1)) {
                System.out.print(",");
            }
        }
        System.out.println();
	}
}
