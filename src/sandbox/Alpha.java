package sandbox;

public class Alpha {

	final static char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	final static int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
			14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
	
	public static void main(String[] args) {
		System.out.println(alphaDec("12345"));
	} //end main
	
	
	public static String alphanumeric(String str) {
		char[] input = str.toCharArray();
		String output = "";
		for (int i = 0; i < input.length; i++) {
			char additionChar = Character.toUpperCase(input[i]);
			System.out.println("additionChar " + additionChar); //TODO This is a debug function
			int loc = findLoc(ALPHABET, additionChar); //TODO This is a debug function
			System.out.println("loc " + loc);
			if (loc == -1) {
				output += Character.toString(additionChar);
				System.out.println("Character added without change"); //TODO This is a debug function
			} else {
				output += Integer.toString(loc + 1);
				output += " ";
			}
		}
		return output;
	}
	
	public static String alphaDec(String str) {
		final char[] NUMBERS = new char[26];
		for (int i = 1; i < 26; i++) NUMBERS[i] = Integer.toString(i).charAt(0);
		System.out.println(NUMBERS);
		char[] input = str.toCharArray();
		String output = "";
		for (int i = 0; i < input.length; i++) {
			
		}
		return output;
	}
	
	
	public static int findLoc(char[] input, char letter) {
		// Takes input char array (input) and character to find (letter)
		for (int i = 0; i < 26; i++) {
			if (input[i] == letter) return i;
			// When the character is found, the value in the array is returned
		}
		return -1; // Error Catch - Add If statement catch to return System.err
	} //end findLoc

} //end class
