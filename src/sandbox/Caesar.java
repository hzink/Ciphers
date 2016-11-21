package sandbox;

//OUT OF DATE

public class Caesar {
	
	final char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	public String caesar_encrypt(String str, int factor) {
		char[] input = str.toCharArray();
		String output = "";
		for (int i = 0; i < input.length; i++) {
			char additionChar = Character.toUpperCase(input[i]);
			int loc = findLoc(ALPHABET, additionChar);
			if (loc == -1) {
				output += Character.toString(input[i]); //if input is not in the array, adds it unchanged to 'output'
			} else {
				loc += factor;
				if (loc > ALPHABET.length) { 
					loc -= ALPHABET.length; 
					} else if (loc < ALPHABET.length) { 
						loc += ALPHABET.length; 
						} else {
							output += Character.toString(ALPHABET[findLoc(ALPHABET, additionChar) + factor]);
				} //end if
			} //end if
		} //end for
		return output;
	} //end caesar_encrypt method
	
	public static void main(String[] args) {
		
	}
		/*
		int factor = 1;
		
		//System.out.println("String Hello");
		String hello = "hello";
		char[] input = hello.toCharArray();
		//for (int i = 0; i < input.length; i++) System.out.println(input[i]);
		
		//System.out.println(findLoc(ALPHABET, 'H'));
		//System.out.println(findLoc(ALPHABET, 'E'));
		
		String output = "";
		for (int i = 0; i < input.length; i++) {
			output += Character.toString(ALPHABET[findLoc(ALPHABET, Character.toUpperCase(input[i])) + factor]);
			//TODO Add catch for unknown letters - i.e. if statement that catches -1 and adds '?' to output
		}
		
		System.out.println(output);
		
	} //end main */
		
	public static int findLoc(char[] input, char letter) {
		// Takes input char array (input) and character to find (letter)
		for (int i = 0; i < 26; i++) {
			if (input[i] == letter) return i;
			// When the character is found, the value in the array is returned
		}
		return -1; // Error Catch - Add If statement catch to return System.err
	} //end findLoc

} //end class
