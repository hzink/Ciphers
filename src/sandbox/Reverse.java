package sandbox;

public class Reverse {

	public static void main(String[] args) {
		
		String message = "This is a message.";
		char[] input = message.toCharArray();
		String output = "";
		int i = input.length - 1;
		while (i >= 0) {
			System.out.print(input[i]);
			String active = Character.toString(input[i]);
			output += active;
			i--;
			
		}
		
		System.out.println(output);
		
	} //end main
	
} //end class
