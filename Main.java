import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Parser parser = new Parser();
		Maze maze = parser.parse(args[0]);
		String outputFilePath = "output.txt"; // Change the file name if needed


		AStarSearch astar = new AStarSearch(maze);
		Solution solution1 = astar.search();
		if (solution1 == null) {
			writeNotSolvable(outputFilePath);
			System.out.println("There is no solution For this Maze ");
			return;
		} else {
			System.out.print("Astar ");
			solution1.print();
			solution1.writeToTxt(outputFilePath, "Astar "); // Append the solution to the output file
		}


		System.out.print("UCS ");
		UCSSearch ucs = new UCSSearch(maze);
		Solution solution2 = ucs.search();
		solution2.print(); //remove
		solution2.writeToTxt(outputFilePath, "UCS "); // Append the solution to the output file


		System.out.print("Greedy ");
		GreedySearch greedy = new GreedySearch(maze);
		Solution solution3 = greedy.search();
		solution3.print();//remove later
		solution3.writeToTxt(outputFilePath, "Greedy "); // Append the solution to the output file


		}
	// Method to write a "not solvable" message to the output file
	private static void writeNotSolvable(String filePath) {
		try (FileWriter writer = new FileWriter(filePath, true)) {
			writer.write("Maze Not solvable\n");
		} catch (IOException e) {

		}
	}


}