package practice.test;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CharacterCount {
	
	public static void main(String[] args) {
		characterCount("pcmbz");
	}
	
	public static void characterCount(String s) {
		Map<Character, Integer> countMap = new HashMap<>();
		Set<Character> unique = new LinkedHashSet<>();
		
		for(int i= 0; i < s.length() ; i++) {
			if(countMap.containsKey(s.charAt(i))) {
				countMap.put(s.charAt(i), countMap.get(s.charAt(i))+1);
			}
			else {
				countMap.put(s.charAt(i), 1);
				unique.add(s.charAt(i));
			}
		}
	}

}
