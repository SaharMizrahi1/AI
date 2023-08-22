
public class UCSSearch extends Algorithm {

	public UCSSearch(Maze maze) {
		super(maze);
		this.comparator= new UCSComparator();// set Algorithm::comparator as a UCSComparator
	}

	public Solution search() {
		PriorityQueue<Path> frontier = new PriorityQueue<Path>(comparator);
		Coordinate startPoint = new coordinate(0,0);
		Path p = new Path();
		p.addCoordinate(startPoint);
		frontier.add(p);
		
		
		return null;
	}
	
	

}


