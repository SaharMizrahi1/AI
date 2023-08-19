
public class UCSSearch extends Algorithm {

	public UCSSearch(Maze maze) {
		super(maze);
		this.comparator= new UCSComparator();// set Algorithm::comparator as a UCSComparator
	}

	public Solution search() {
		PriorityQueue<Path> frontier = new PriorityQueue<Path>(comparator);
		
		
		return null;
	}
	
	

}


