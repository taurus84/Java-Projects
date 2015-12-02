package Programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class minMax {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/Programs/minMax.txt"));
		String str;
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0, nbrOfValues = 0, nbr;
		
		while((str = br.readLine()) != null) {
			String[] strArray = str.split(" ");
			for(int i = 0; i < strArray.length; i++) {
				nbr= Integer.parseInt(strArray[i]);
				sum += nbr;
				if(nbr < min) {
					min = nbr;
				}
				if(nbr > max) {
					max = nbr;
				}
				nbrOfValues++;
			}
		}
		String result = "Number of values in file: " + nbrOfValues + 
						"\nHighest value in file: " + max + 
						"\nSmallest value in file: " + min + 
						"\nSum of all values: " + sum + 
						"\nAverage of all values: " + (double)sum/nbrOfValues;
		System.out.println(result);
	}
}
