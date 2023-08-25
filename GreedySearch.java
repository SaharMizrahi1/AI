
public class GreedySearch extends Algorithm {

	public GreedySearch(Maze maze) {
		super(maze);
		this.comparator= new GreedyComparator();// set Algorithm::comparator as a GreedyComparator
	}
}
