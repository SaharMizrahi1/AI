
// you need to complete the implementation of the class

import java.io.FileWriter;
import java.io.IOException;
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

        System.out.print("(search " + nodesExplored + " nodes; path length " + path.getCoordinates().size() + "): "); // nodesExplored - not final - need to check
        for (Coordinate coordinate : coordinates) {
            System.out.print("(" + (coordinate.getX() + 1) + "," + (coordinate.getY() + 1) + ")");
            if (coordinate != coordinates.get(coordinates.size() - 1)) {
                System.out.print(" ");
            }
        }
        System.out.println();
	}


    //Print output into a txt file
    public String generateOutput(String algorithmName) {
        List<Coordinate> coordinates = path.getCoordinates();
        StringBuilder output = new StringBuilder();
        output.append(algorithmName);
        output.append("(search ").append(nodesExplored).append(" nodes; path length ").append(path.getCoordinates().size()).append("): ");
        for (Coordinate coordinate : coordinates) {
            output.append("(").append(coordinate.getX() + 1).append(",").append(coordinate.getY() + 1).append(")");
            if (coordinate != coordinates.get(coordinates.size() - 1)) {
                output.append(" ");
            }
        }

        return output.toString();
    }

    public void writeToTxt(String filePath,String algorithmName) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(generateOutput(algorithmName) + "\n"); // Append the output with a newline
        }
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
