import java.util.HashSet;
import java.util.List;
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

		if (!maze.isSolvable()){
			return null;
		}

		Path startPath = new Path(maze);
		startPath.addCoordinate(startPoint);
		frontier.add(startPath);

		while (!frontier.isEmpty()) {
			Path currentPath = frontier.poll();
			Coordinate currentState = currentPath.getLatestCoordinate();

			if (!visited.contains(currentState)) {
				visited.add(currentState);

				if (endPoint.equals(currentState)) {
					return new Solution(currentPath, visited.size());
				}
				List<Coordinate> nextStates = maze.getNextStates(currentState);
				for (Coordinate nextState : nextStates) { //check all next steps , if visited or not visited
					if (!visited.contains(nextState)) {
						// int costSoFar = currentPath.getCost() + 1; // Increment the cost
						Path newPath = new Path(currentPath); // uses copy constructor
						newPath.addCoordinate(nextState);
						frontier.add(newPath); //uses comparator
					}
				}
			}
		}



        return null;
    }
}
