package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * (Size/animals)*eco*animals = size*eco
 * @author David
 *
 */
public class EcoPremium {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader instream = new BufferedReader(new InputStreamReader(System.in));
		//read first input, number of tests
		int t  =Integer.parseInt(instream.readLine());
		for(int i = 0; i < t; i++) {
			int sum = 0;
			//read second input, number of farmers in test
			int f = Integer.parseInt(instream.readLine());
			for(int j = 0; j < f; j++) {
				String[] values = instream.readLine().split(" ");
				int size = Integer.parseInt(values[0]);
				int ecoPremium = Integer.parseInt(values[2]);
				sum += size*ecoPremium;
			}
			System.out.println(sum);
		}
	}
}
