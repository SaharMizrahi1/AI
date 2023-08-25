
// you need to complete the implementation of the class

import java.util.List;

public class Solution {

	private Path path;
	private int nodesExplored;
	
	public Solution(Path path,int nodesExplored) { // shaked added
        this.path = path;
		 this.nodesExplored = nodesExplored;
		 
    }
	
	public void print() {
		// implement - shaked added

		List<Coordinate> coordinates = path.getCoordinates();

        System.out.print("(search " + nodesExplored + " nodes; path length " + (path.getCost()+1) + "): "); // nodesExplored - not final - need to check
        for (Coordinate coordinate : coordinates) {
            System.out.print("(" + (coordinate.getX() + 1) + "," + (coordinate.getY() + 1) + ")");
            if (coordinate != coordinates.get(coordinates.size() - 1)) {
                System.out.print(",");
            }
        }
        System.out.println();
	}

    public int GetnodesExplored()
    {
        return nodesExplored;
    }

    
    public Path GetPath()
    {
        return path;
    }




}
