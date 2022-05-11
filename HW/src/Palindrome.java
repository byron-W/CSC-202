import java.util.*;

public class Palindrome {
	public static void main(String[] args) throws Exception {
		Scanner scnr = new Scanner(System.in);
		// Tells the user what to do and how to stop the program
		System.out.println("Enter a string to check if it's a palindome\nType \"Stop\" to stop checking");
		String input = scnr.nextLine(); // The next line of strings from the keyboard
		while (!input.toLowerCase().equals("stop")) { // Constantly ask for a string until the user stops the program
			System.out.println(checkPalindrome(input));
			input = scnr.nextLine();
		}
		scnr.close();
	}

	public static boolean checkPalindrome(String str) { // Recursive palindrome checker
		// Remove any punctuation and spaces and put the words in an array
		String[] words = str.toLowerCase().split("[^A-Za-z0-9]+");
		String formattedStr = ""; // Create an empty string
		for (String x : words) {
			formattedStr += x; // Add all the words into one string without spaces
		}
		if (formattedStr.length() == 1) // If the word/phrase has an odd amount of letters
			return true;
		// If the word/phrase has an even amount of letters
		else if (formattedStr.length() == 2 && formattedStr.charAt(0) == formattedStr.charAt(1))
			return true;
		// Checks if the first and last char are equal
		else if (formattedStr.charAt(0) == formattedStr.charAt(formattedStr.length() - 1))
			return checkPalindrome(formattedStr.substring(1, formattedStr.length() - 1));
		else
			return false; // If none of the above conditionals were true
	}
}