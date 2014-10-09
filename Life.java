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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class cwLife {
   static int[] grid ;
   
    public cwLife(int square) {
       cwLife.grid = new int[square];
    }

		public static void main(String[] args) {
			File file = new File("example.txt");
			FileWriter FW = null;
			cwLife cLife = new cwLife(16);
			cwBoard CBoard = new cwBoard(8);
			//WRITE ME
			try {
				FW = new FileWriter(file);
				//wrapped the fileWritter in BufferedWritter
		    	BufferedWriter BW = new BufferedWriter(FW);
		    	BW.write("Hello there!");
		    	BW.newLine();
		    	BW.write("So now we are on to the next step..To draw the Board");
		    	BW.newLine();
		    	System.out.println("Everything is good");
				 int square = grid.length;
			        for (int i = 0; i < square; i++) {
			            for (int j = 0; j < square; j++) {
			                if (grid[i] == j) {
			                	BW.write("* ");
			                } else {
			                	BW.write(". ");
			                }
			            }
				    	BW.newLine();
			        }
			    	BW.newLine();

			    	//closing the door behind itself
			    	BW.close();
				}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
 //Rules:
 // Any live cell with fewer than two live neighbours dies
 // Any live cell with two or three live neighbours lives on
 // Any live cell with more than three live neighbours dies
 // Any dead cell with exactly three live neighbours becomes a live cell

 // In other words:
 // Live cells: If live neighbours == 2 or 3, birth. Else, kill.
 // Dead cells: If live neighbours == 3, birth. Else, kill.
//TODO: The rules of the game are going to be written below
    	//READ ME
		try {
			java.io.FileReader fr = new java.io.FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
	    	//closing the door behind itself
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.err.println("Unable to read file: " + file.toString());
			} catch (NullPointerException ex) {
				System.err.println("Unable to read file: " + file.toString());
			}
		}
	    

	}
