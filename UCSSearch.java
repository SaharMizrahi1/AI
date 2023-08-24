
public class UCSSearch extends Algorithm {

	public UCSSearch(Maze maze) {
		super(maze);
		this.comparator= new UCSComparator();// set Algorithm::comparator as a UCSComparator
	}

	public Solution search() {
		PriorityQueue<Path> frontier = new PriorityQueue<Path>(comparator);
		Set<Coordinate> visited = new HashSet<>();
		// Start state
		Coordinate startPoint = new Coordinate(0,0);
		//Goal Point
		Coordinate endPoint = new Coordinate(maze.getD()-1,maze.getD()-1); // matrix limits - 0 to n-1

		Path startPath = new Path();
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
                    if (!visited.contains(nextState)) { //use comparator here?
                       // int costSoFar = currentPath.getCost() + 1; // Increment the cost
                        Path newPath = new Path(currentPath); // uses copy constructor 
                        newPath.addCoordinate(nextState);
                        frontier.add(newPath);
                }
            }
        }
		return null; // No solution found
    }
	
}


   
	
	



