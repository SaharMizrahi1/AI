import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class GreedySearch extends Algorithm {

	public GreedySearch(Maze maze) {
		super(maze);
		this.comparator= new GreedyComparator();// set Algorithm::comparator as a GreedyComparator
	}

	public Solution search() {
		PriorityQueue<Path> frontier = new PriorityQueue<Path>(comparator);
		Set<Coordinate> visited = new HashSet<>();
		// Start state
		Coordinate startPoint = new Coordinate(0,0);
		//Goal Point
		Coordinate endPoint = new Coordinate(maze.getD()-1,maze.getD()-1); // matrix limits - 0 to n-1
		Path startPath = new Path(maze);
		startPath.addCoordinate(startPoint);
		frontier.add(startPath);



        return null;
    }
}
