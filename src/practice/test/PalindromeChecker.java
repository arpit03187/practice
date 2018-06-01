package practice.test;

public class PalindromeChecker {

	public Boolean isPalindrome(String string) {
		
		StringBuffer buffer = new StringBuffer(string);
		buffer.reverse();
		
		if(string.equalsIgnoreCase(buffer.toString()))
			return true;
		
		return false;
		
	}

}
