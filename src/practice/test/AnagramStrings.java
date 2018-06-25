package practice.test;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		System.out.println(checkAnagram("hello", "Hello"));

	}

	public static boolean checkAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		return sort(str1).equals(sort(str2));
	}

	public static String sort(String s1) {

		char[] a = s1.toLowerCase().toCharArray();
		Arrays.sort(a);
		return new String(a);
	}

}
