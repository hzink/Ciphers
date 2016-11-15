package sandbox;

public class Reverse {

	public static void main(String[] args) {
		
		String message = "This is a message.";
		char[] input = message.toCharArray();
		char[] output = {};
		int i = input.length - 1;
		int j = 0;
		while (i >= 0) {
			System.out.println(input[i]);
			output[j] = input[i];
			i--;
			j++;
		}
		
	} //end main
	
} //end class
