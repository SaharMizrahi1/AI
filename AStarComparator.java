import java.util.Comparator;

public class AStarComparator implements Comparator<Path> {
	
	@Override
	public int compare(Path p1, Path p2) {
		// your implementation...

		int costAndHeuristicP1 = p1.getCost() + p1.getHeuristicEstimate();
		int costAndHeuristicP2 = p2.getCost() + p2.getHeuristicEstimate();
		return costAndHeuristicP1 - costAndHeuristicP2;



	}
	
}
