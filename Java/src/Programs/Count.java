package Programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Programmet räknar antal tecken i en fil och skriver ut antalet UTAN spacetecken.
 * @author David Tran
 * Date: 2 December 2015
 */
public class Count {
	
	public static void main(String[] args) throws IOException {
		int nbrOfChars = 0;
		String str;
		BufferedReader br = new BufferedReader(new FileReader("src/Programs/count.txt"));
		
		while((str = br.readLine()) != null) {
			String[] strArray = str.split(" ");
			for(int i = 0; i < strArray.length; i++) {
				nbrOfChars += strArray[i].length();
			}
		}
		System.out.println(nbrOfChars);
		
	}
}
