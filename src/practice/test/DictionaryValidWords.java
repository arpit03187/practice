package practice.test;

import java.util.Set;
import java.util.TreeSet;

// ebay question

public class DictionaryValidWords {

    private static final Set<String> dictionary = new TreeSet<String>();
    static {
        dictionary.add("baby");
        dictionary.add("car");
        dictionary.add("seat");
//        dictionary.add("awe");
//        dictionary.add("we");
//        dictionary.add("some");
//        dictionary.add("awesome");
//        dictionary.add("foo");
//        dictionary.add("bar");
    }

    private DictionaryValidWords() {}

    /**
     * Returns set of valid words given an input string.
     * It eliminates duplicates.
     * 
     * @param str   The input string whose valid words need to be found out.
     * @return      List of valid words nested in the string.
     */
    public static Set<String> findValidStrings(String str) {
        if (str.length() ==  0) {
            throw new IllegalArgumentException("Strings of length 0 are illegal");
        }

        final Set<String> validWords = new TreeSet<String>(); 
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                sb.append(str.charAt(j)); // O(1) complexity.
                if (dictionary.contains(sb.toString())) {
                    validWords.add(sb.toString());
                }
            }
        }
        return validWords;
    }
    
    public static void main(String[] args) {
    	Set<String> validWords = findValidStrings("babycarseat");
    	
    	for(String word: validWords) {
    		System.out.print(word + " ");
    	}
	}
}
