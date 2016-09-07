package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Advanced Programming
 * Section 1 - 591 - Box of bricks
 * @author David Tran
 *
 */
public class BoxOfBricks {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader instream = new BufferedReader(new InputStreamReader(System.in));
		//read number of towers
		int n, set = 1;
		while((n = Integer.parseInt(instream.readLine())) !=0 ) {
			int sum = 0, minMoves = 0;
			//read line with height of each tower
			String[] towers = instream.readLine().split(" ");
			for(int i = 0; i < n; i++) {
				sum += Integer.parseInt(towers[i]);
			}
			int average = sum / n;
			for(int i = 0; i < n; i++) {
				int towerHeight = Integer.parseInt(towers[i]);
				if(towerHeight > average) {
					minMoves += towerHeight - average; 
				}
			}
			System.out.println("Set #" + set);
			System.out.println("The minimum number of moves is " + minMoves + ".");
			System.out.println();
			set++;
		}
	}
}
