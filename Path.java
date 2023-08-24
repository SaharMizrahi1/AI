import java.util.ArrayList;
import java.util.List;

public class Path {
    private List<Coordinate> coordinates; // Assuming you have a Coordinate class to store (x, y) positions
    
    public Path() {
        coordinates = new ArrayList<>();
    }

      // Deep copy constructor
    public Path(Path sourcePath) {
        this.coordinates = new ArrayList<>();
        for (Coordinate coordinate : sourcePath.coordinates) {
            this.coordinates.add(new Coordinate(coordinate.getX(), coordinate.getY()));
        }
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
        return coordinates.size() - 1; // Number of moves (edges) between nodes
    }
}