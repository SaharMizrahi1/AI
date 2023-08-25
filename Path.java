import java.util.ArrayList;
import java.util.List;

public class Path {
    private List<Coordinate> coordinates; // Assuming you have a Coordinate class to store (x, y) positions
    protected Maze maze;


    
    public Path(Maze maze) {
        coordinates = new ArrayList<>();
        this.maze = maze;
       
    }

      // Deep copy constructor
    public Path(Path sourcePath) {
        this.coordinates = new ArrayList<>();
        for (Coordinate coordinate : sourcePath.coordinates) {
            this.coordinates.add(new Coordinate(coordinate.getX(), coordinate.getY()));
        }
        this.maze=sourcePath.maze;
    }

    // ?
    public List<Coordinate> getCoordinates() { 
        List<Coordinate> deepCopy = new ArrayList<>();
        for (Coordinate coordinate : coordinates) {
            deepCopy.add(new Coordinate(coordinate.getX(), coordinate.getY()));
        }
        return deepCopy;
    }

    public void addCoordinate(Coordinate coordinate) {
        coordinates.add(coordinate);
    }

    public Coordinate getLatestCoordinate() {
        if (coordinates.isEmpty()) {
            return null; // Handle the case when there are no coordinates in the path
        }
        return coordinates.get(coordinates.size() - 1);
    }
    
    public int getCost() {
        return coordinates.size() - 1; // Number of moves (edges) between coordinates
    }

    public int getHeuristicEstimate()
    {
        Coordinate currentCoordinate = getLatestCoordinate();
    
        int dx = Math.abs(currentCoordinate.getX() - (maze.getD()-1));
        int dy = Math.abs(currentCoordinate.getY() - (maze.getD()-1));
    
        return dx + dy; // Manhattan Distance heuristic estimate
    }
}