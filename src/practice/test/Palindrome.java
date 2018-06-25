package practice.test;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();

		System.out.println(isValidPalindrome(original));
		
		System.out.println(IsPalindrome(original.replaceAll("[^\\\\w\\\\s]","")));

	}

	static boolean isValidPalindrome(String givenWord) {

		// Testing the incoming string to make sure its no NULL or of 0 length
		if (givenWord == null || givenWord.length() == 0)
			return false;

		// Setting the initial index values
		int frontIndex = 0;
		int backIndex = givenWord.length() - 1;

		// Indicates if a match between characters have been found
		boolean matchFound = false;

		// Moving through all the characters looking checking for a palindrome
		while (frontIndex <= backIndex) {

			// Trying to find an alpha character by moving left to right
			while (!Character.isLetterOrDigit(givenWord.charAt(frontIndex)) && frontIndex < backIndex)
				frontIndex++;
			char frontChar = Character.toLowerCase(givenWord.charAt(frontIndex));

			// Checking to make sure the character is an alpha character and if it isn't,
			// checking to see if another
			// match has been found already.
			if (!Character.isLetterOrDigit(frontChar) && !matchFound)
				return false;

			// Trying to find an alpha character by moving right to left
			while (!Character.isLetter(givenWord.charAt(backIndex)) && frontIndex < backIndex)
				backIndex--;
			char backChar = Character.toLowerCase(givenWord.charAt(backIndex));

			// Do the characters match?
			if (frontChar != backChar)
				return false;

			// Preparing for next loop pass
			frontIndex++;
			backIndex--;
			matchFound = true;
		}

		// The word is a palindrome
		return true;
	}
	
	public static boolean IsPalindrome(String text)
    {
        return isPalindrome(0, text.length() - 1, text);
    }

    private static boolean isPalindrome(int indexOfFirst, int indexOfLast, String text)
    {
        if (indexOfFirst >= indexOfLast)
            return true;

        if (text.toCharArray()[indexOfFirst] != text.toCharArray()[indexOfLast])
            return false;

        return isPalindrome(indexOfFirst + 1, indexOfLast - 1, text);
    }

}
