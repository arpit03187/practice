package practice.test;

import java.util.Scanner;

public class PalindromeChecker {

	public static Boolean isPalindrome(String string) {

		StringBuffer buffer = new StringBuffer(string);
		buffer.reverse();

		if (string.equalsIgnoreCase(buffer.toString()))
			return true;

		return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		StringBuffer sb = new StringBuffer(A);
		sb.reverse();
		if (A.equalsIgnoreCase(sb.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println(isPalindrome("java"));

	}
	
}
