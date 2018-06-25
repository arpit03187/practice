package practice.test;

public class CharacterFrequencies {
	
	public static String charToFrequency(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char current = str.charAt(0);
        int count = 1;

        StringBuilder output = new StringBuilder();

        for (int i=1; i<str.length(); i++) {
            if (str.charAt(i) == current) {
                count++;
            } else {
                output.append(count).append(current);
                current = str.charAt(i);
                count = 1;
            }
        }

        output.append(count).append(current);
        return output.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(charToFrequency("aaabbccc"));
	}

}
