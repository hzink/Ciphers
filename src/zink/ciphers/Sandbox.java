package zink.ciphers;

public class Sandbox {
	
	static char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	public static void main(String[] args) {
		log("String Hello");
		char[] hello = {'H', 'E', 'L', 'L', 'O'};
		for (int i = 0; i < hello.length; i++) System.out.println(hello[i]);
		System.out.println(findLoc(ALPHABET, 'H'));
		System.out.println(findLoc(ALPHABET, 'E'));
		
		char[] output = new char[hello.length];
		for (int i = 0; i < hello.length; i++) {
			output[i] = ALPHABET[hello[i + findLoc(hello, hello[i])]];
		}
		System.out.println(output);
		
	}
	
	public static int findLoc(char[] input, char letter) {
		// Takes input char array (input) and character to find (letter)
		for (int i = 0; i < 25; i++) {
			if (input[i] == letter) return i;
			// When the character is found, the value in the array is returned
		}
		return -1; // Error Catch - Add If statement catch to return System.err
	}
	
	public static void log (String output) {
		System.out.println(output);
	}

}
