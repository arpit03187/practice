package practice.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindDigitsInString {
	
	public static void main(String[] args) {
		
		String [] source = {"sdasdasd123dadad1asda4", "asdadw45@@#@#sf12"};
		List<Integer> list = findDigits(source);
		
		Set<Integer> targetSet = new TreeSet<>(list);
		
		targetSet.stream().forEach(System.out::println);
	}
	
	public static List<Integer> findDigits(String[] s) {
		List<Integer> ints = new ArrayList<>();
		List<String> strings = new ArrayList<>();
		for(int i = 0; i < s.length-1; i ++) {
			
		//System.out.println(s[i]);
		s[i] = s[i].replaceAll("[^-?0-9]+", " ");
		//System.out.println(s[i]);
		//System.out.println(Arrays.toString(s[i].trim().split(" ")));
		String str = Arrays.toString(s[i].trim().split(" "));
	    str = str.substring(1, str.length()-1).replace(",", "");
	    str.replaceAll(" ", "");
	    System.out.println(str);
		strings.add(str);
		}
		return strings
				.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
	}
	
	@Override
	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}
