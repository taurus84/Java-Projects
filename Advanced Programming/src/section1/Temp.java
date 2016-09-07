package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Advanced Programming
 * Section 1 - 10878 - Box of bricks
 * @author David Tran
 */

public class Temp {

	//| o   .  o| = A
	
	public static void main(String[] args) throws IOException {
		BufferedReader instream = new BufferedReader(new InputStreamReader(System.in));
		String readLine;
		while((readLine = instream.readLine()) != null) {
			if(readLine.contains("-")) {
				continue;
				
				
			} else if(readLine.contains("|")) {
				readLine = readLine.replace("|", "");
				readLine = readLine.replace(".", "");
				char c = 0;
				int counter = 1;
				for(int i = 0; i < readLine.length(); i++) {
					if(readLine.charAt(i) == 'o') {
						c += Math.pow(2, 8-counter);
						counter++;
					} else if(readLine.charAt(i) == ' ') {
						counter++;
					}
					
				}
				System.out.print(c);
			}
		}
	}
}

