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
    
    public int getCost() {
        return coordinates.size() - 1; // Number of moves (edges) between nodes
    }
}