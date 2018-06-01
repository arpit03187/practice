package practice.test;

import java.util.ArrayList;
import java.util.List;

public class PermutationCombination {

	public static void main(String a[]) {
		List<String> output = PermutationCombination.generatePermutations("xyz");
		System.out.println("Result size: " + output.size());
		output.stream().forEach(System.out::println);
		System.out.println("------------------");

		output = PermutationCombination.generatePermutations("ABCD");
		System.out.println("Result size: " + output.size());
		output.stream().forEach(System.out::println);
	}

	public static List<String> generatePermutations(String input) {

		List<String> strList = new ArrayList<String>();
		PermutationCombination.permutations("", input, strList);
		return strList;
	}

	private static void permutations(String consChars, String input, List<String> opContainer) {
		if (input.isEmpty()) {
			opContainer.add(consChars + input);
			return;
		}

		for (int i = 0; i < input.length(); i++) {
			permutations(consChars + input.charAt(i), input.substring(0, i) + input.substring(i + 1), opContainer);
		}
	}

}
