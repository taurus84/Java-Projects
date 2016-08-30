package adventOfCode;

public class Dec11th {
	
	public String generatePassword(String str) {
		double start = stringToInt(str);
		String password = "";
		boolean found = false;
		
		while(!found) {
			start++;
			password = intToString(start);
			if(checkForIOL(password) && checkDoubleLetters(password) && followedLetters(password)) {
				found = true;
			}
			System.out.println(password);
		}
		System.out.println(password);
		return password;
		
	}
 
	public int charToInt(char a) {
		return a - 96;
	}
	
	public String intToChar(int nbr) {
		return Character.toString(Character.toChars(nbr + 96)[0]);
	}
	
	//base 26
	public double stringToInt(String str) {
		int counter = str.length() -1;
		double sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += Math.pow(26, counter)*charToInt(str.charAt(i));
			counter--;
		}
		return sum;
	}
	
	public String intToString(double nbr) {
		float heltal = 0, rest = 0;
		int counter = 7;
		String result = "", str1;
		while(heltal == 0) {
			heltal = (int) (nbr/Math.pow(26, counter));
			counter--;
		} counter++;
		
		for(int i = counter; i >= 0; i--) {
			heltal = (int) (nbr/Math.pow(26, i));
			rest = (int) (nbr%Math.pow(26, i));
			str1 = (intToChar((int) heltal));
			nbr -= (heltal*Math.pow(26, i));
			result += str1; 
		}
		return result;
	}
	
	public boolean checkForIOL(String str) {
		if(str.contains("i") || str.contains("o") || str.contains("l")) {
			return false;
		}
		return true;
	}
	
	public boolean checkDoubleLetters(String str) {
		boolean found1 = false;
		char firstFoundChar = '0';
		for(int i = 0; i < str.length()-1; i++) {
			if(!found1) {
				if(str.charAt(i) == str.charAt(i+1)) {
					found1 = true;
					firstFoundChar = str.charAt(i);
					i++;
				} 
			} else {
				if(str.charAt(i) == str.charAt(i+1)) {
					if(str.charAt(i) != firstFoundChar) {
						return true;
					}
				}
			}
		} return false;
	}
	
	public boolean followedLetters(String str) {
		for(int i = 0; i < str.length() - 2; i++) {
			if(charToInt(str.charAt(i)) == charToInt(str.charAt(i+1)) - 1 && 
					charToInt(str.charAt(i)) == charToInt(str.charAt(i+2)) - 2) {
				return true;
			}
		} return false;
	}
	
	
	
	public static void main(String[] args) {
		for(int i = 'q'; i <= 'x'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		Dec11th dc = new Dec11th();
		System.out.println(dc.stringToInt("hepxcrrq"));
		
//		System.out.println(Math.pow(26, 0)*5);
		System.out.println(dc.intToString(66000194634.0));
//		dc.generatePassword("hepxcrrq");
//		System.out.println(dc.stringToInt("aae"));
//		System.out.println(dc.intToString(707));
//		if(dc.followedLetters("aadsfghij")) {
//			System.out.println("Det funkade");
//		} else
//			System.out.println("Nix!");
		
	}
	
}
