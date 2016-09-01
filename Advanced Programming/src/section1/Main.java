package section1;
//problem 11044
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader instream = new BufferedReader(new InputStreamReader(System.in));
		int t  =Integer.parseInt(instream.readLine());
		for(int i = 0; i < t; i++) {
			String[] pair = instream.readLine().split(" ");
			int n = Integer.parseInt(pair[0]);
			int m = Integer.parseInt(pair[1]);
			int rows = (n)/3;
			int cols = (m)/3;
			System.out.println(rows*cols);
		}
	}
}
