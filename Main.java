import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Parser parser = new Parser();
		Maze maze = parser.parse(args[0]);
		 
		ReportMaker reportMaker = new ReportMaker();
		// System.out.print("Astar ");
		// AStarSearch astar = new AStarSearch(maze);
		// Solution solution1 = astar.search();
		// solution1.print();
		
		System.out.print("UCS ");
		UCSSearch ucs = new UCSSearch(maze);
		Solution solution2 = ucs.search();
		solution2.print();
		reportMaker.createReport(new Coordinate(0, 0), new Coordinate(maze.getD()-1,maze.getD()-1), maze, ucs.getClass().getName(), solution2);

		
		// System.out.print("Greedy ");
		// GreedySearch greedy = new GreedySearch(maze);
		// Solution solution3 = greedy.search();
		// solution3.print();
	}
}
