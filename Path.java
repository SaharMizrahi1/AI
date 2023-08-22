import java.util.ArrayList;
import java.util.List;

public class Path {
    private List<Coordinate> coordinates; // Assuming you have a Coordinate class to store (x, y) positions
    
    public Path() {
        coordinates = new ArrayList<>();
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