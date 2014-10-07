/**
 * 
 */

/**
 * Conway's Game of Life 
 * @author abiolaakanni
 * @date 10/06/2014
 *
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class cwLife {
	
    static int grid[] ;
    
    public cwLife(int square) {
        grid = new int[square];
    }
 

    public void printBoard(int grid[]) {
        int square = grid.length;
        for (int i = 0; i < square; i++) {
            for (int j = 0; j < square; j++) {
                if (grid[i] == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

	public static void main(String[] args) {
		cwLife cw = new cwLife(8);
		cw.printBoard(grid);
		File file = new File("example.txt");

		BufferedReader br = null;

		try {
			java.io.FileReader fr = new java.io.FileReader(file);
			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Unable to close file: " + file.toString());
			} catch (NullPointerException ex) {
			}
		}

	}

}
