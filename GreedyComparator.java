import java.util.Comparator;

public class GreedyComparator implements Comparator<Path> {
	
	@Override
	public int compare(Path p1, Path p2) {
		// your implementation...

		int heuristicEstimateP1 = p1.getHeuristicEstimate(goalCoordinate);
	    int heuristicEstimateP2 = p2.getHeuristicEstimate(goalCoordinate);
	    
	    return heuristicEstimateP1 - heuristicEstimateP2;
		
	}
}
		