import java.util.Comparator;
import java.lang.Integer;

public class UCSComparator implements Comparator<Path> {

	@Override
    public int compare(Path p1, Path p2) {
        // Compare paths based on their accumulated costs
        // Return a negative value if p1 has lower cost than p2,
        // Return a positive value if p2 has lower cost than p1,
        // Return 0 if both paths have the same cost
        return Integer.compare(p1.getCost(), p2.getCost());
	}
}