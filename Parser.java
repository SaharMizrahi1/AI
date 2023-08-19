import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

    public Maze parse(String filePath) throws FileNotFoundException, IOException {
    	
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            
        	String sizeLine = reader.readLine();
        	int d = Integer.parseInt(sizeLine.trim());
        	Maze maze = new Maze(d);
        	
        	for (int i = 0; i < d; i++) {
        		String[] line = reader.readLine().trim().split(" ");
        		for (int j = 0; j < d; j++) {
        			boolean b = line[j].equals("1");
        			maze.set(i, j, b);
        		}
        	}
        	
            return maze;
        }
    }
}
