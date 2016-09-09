package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Advanced Programming Section 2 - 839 - Not So Mobile
 * 
 * @author David Tran 2016-09-08
 */

public class NotSoMobile {

	int wl, dl, wr, dr;
	BufferedReader instream;
	String[] values;
	String str;

	public void run() throws IOException {
		instream = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(instream.readLine());

		// for every testcase
		for (int i = 0; i < t; i++) {
			boolean run = true;
			String str;
			while (true) {

				if ((str = instream.readLine()).equals("") && run) {
//				if ((str = instream.readLine()).isEmpty() && run) {
					run = false;
					continue;
				} else {
					values = str.split(" ");
					if (check(str)) {
						System.out.println("YES");
						if(!((t - i) == 1)) {
							System.out.println();
						}
						break;
					} else {
						System.out.println("NO");
						if(!((t - i) == 1)) {
							System.out.println();
						}
						break;
					}
					
				}
			}
		}
	}

	public boolean check(String string) throws IOException {
		int wl, dl, wr, dr;
		wl = Integer.parseInt(values[0]);
		dl = Integer.parseInt(values[1]);
		wr = Integer.parseInt(values[2]);
		dr = Integer.parseInt(values[3]);
		if (wl == 0 && wr == 0) {
			wl = check();
			wr = check();
		} else if (wl == 0) {
			wl = check();
		} else if (wr == 0) {
			wr = check();
		}
		if ((wl * dl) == (wr * dr)) {
			// return the sum of weights
			return true;
		} else
			return false;

	}

	public int check() throws IOException {
		int wl, dl, wr, dr;
		String[] values = instream.readLine().split(" ");
		wl = Integer.parseInt(values[0]);
		dl = Integer.parseInt(values[1]);
		wr = Integer.parseInt(values[2]);
		dr = Integer.parseInt(values[3]);
		if (wl == 0 && wr == 0) {
			wl = check();
			wr = check();
		} else if (wl == 0) {
			wl = check();
		} else if (wr == 0) {
			wr = check();
		}
		// check if jämvikt
		if ((wl * dl) == (wr * dr)) {
			// return the sum of weights
			return wl + wr;
		}
		return 0;
	}

	public void readLine() throws IOException {
		str = instream.readLine();
		if (str == null) {
		} else
			this.values = instream.readLine().split(" ");
	}

	public static void main(String[] args) throws IOException {
		NotSoMobile nsm = new NotSoMobile();
		nsm.run();
	}
}
