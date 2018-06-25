package practice.test;

public class URLify {

	public static String replace(String s, int len) {

		char arr[] = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {
			if (arr[i] == 32)
				sb.append("%20");
			else
				sb.append(arr[i]);

		}

		return sb.toString();
	}
	
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != 32) {
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "Mr John Smith";
		System.out.println(replace(s, findLastCharacter(s.toCharArray())));
	}

}
