package zink.ciphers;

public class CodeMachine {

	/* DON'T CHANGE THE PARAMETERS */
	
	final char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '?'};
	
	public String caesar_encrypt(String str, int factor) {
		char[] input = str.toCharArray();
		String output = "";
		for (int i = 0; i < input.length; i++) {
			output += Character.toString(ALPHABET[findLoc(ALPHABET, Character.toUpperCase(input[i])) + factor]);
		}
		return output;
	} //end caesar_encrypt method
	
	public String caesar_decrypt(String str, int factor) {
		//Identical to caesar_encrypt, except for 'minus factor' in for loop
		//Probably could combine these two functions with a boolean parameter and some if statements
		char[] input = str.toCharArray();
		String output = "";
		for (int i = 0; i < input.length; i++) {
			output += Character.toString(ALPHABET[findLoc(ALPHABET, Character.toUpperCase(input[i])) - factor]);
		}
		return output;
	} //end caesar_decyprt method
	
	public String alphanumeric(String str) {
		return "alphanumeric";
	}
	
	public String reverse(String str) {
		char[] input = str.toCharArray();
		String output = "";
		for (int i = input.length - 1; i >= 0; i--) {
			output += Character.toString(input[i]);
		} //end for
		return output;
	} //end reverse method
	
	public static void main(String[] args) { 
		//TODO Remove main
	}

	public int findLoc(char[] input, char letter) {
		// Takes input char array (input) and character to find (letter)
		for (int i = 0; i < 25; i++) {
			if (input[i] == letter) return i;
			// When the character is found, the value in the array is returned
		}
		return 25; // Error Catch - Add If statement catch to return System.err
	} //end findLoc
	
}
