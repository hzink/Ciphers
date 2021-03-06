package zink.ciphers;

/**
 * 
 * @author Henry Zink
 * @version 0.1
 *
 */
public class CodeMachine {

	/* DON'T CHANGE THE PARAMETERS */
	
	final char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	//TODO Caesar functions are alpha versions
	public String caesar_encrypt(String str, int factor) {
		char[] input = str.toCharArray();
		String output = "";
		for (int i = 0; i < input.length; i++) {
			char addition = Character.toUpperCase(input[i]);
			if (findLoc(ALPHABET, addition) == -1) {
				output += Character.toString(input[i]); //if input is not in the array, adds it unchanged to 'output'
			} else {
				output += Character.toString(ALPHABET[findLoc(ALPHABET, addition) + factor]);
			} //end if
		} //end for
		return output;
	} //end caesar_encrypt method
	
	public String caesar_decrypt(String str, int factor) {
		//Identical to caesar_encrypt, except for 'minus factor' in for loop
		//Probably could combine these two functions with a boolean parameter and some if statements
		char[] input = str.toCharArray();
		String output = "";
		for (int i = 0; i < input.length; i++) {
			char additionChar = Character.toUpperCase(input[i]);
			if (findLoc(ALPHABET, additionChar) == -1) {
				output += Character.toString(input[i]); //if input is not in the array, adds it unchanged to 'output'
			} else {
				output += Character.toString(ALPHABET[findLoc(ALPHABET, additionChar) - factor]);
			} //end if
		} //end for
		return output;
	} //end caesar_decyprt method
	
	public String alphaEnc(String str) {
		//TODO make this work both ways
		char[] input = str.toCharArray();
		String output = "";
		for (int i = 0; i < input.length; i++) {
			char additionChar = Character.toUpperCase(input[i]);
			int loc = findLoc(ALPHABET, additionChar); 
			if (loc == -1) {
				output += Character.toString(additionChar);
			} else {
				output += Integer.toString(loc + 1);
				output += " ";
			}
		}
		return output;
	}
	
	public String alphaDec(String str) {
		String output = "";
		return output;
	}
	
	public String reverse(String str) {
		//TODO not up to date
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
		for (int i = 0; i < 26; i++) {
			if (input[i] == letter) return i;
			// When the character is found, the value in the array is returned
		}
		return -1; // Error Catch - Add If statement catch to return System.err
	} //end findLoc
	
}
