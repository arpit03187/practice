package practice.cracking.coding.interview;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

	public static boolean isUnique(String s) {
		
		boolean isUnique = false;
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					isUnique = true;
				}
				else {
					isUnique = false;
				}
			}
		}
		
		return isUnique;
	}
	
	private static boolean checkUniqueUsingMap(String str){
        HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
        
        for(int i = 0; i < str.length(); i++){
            if(charMap.containsKey(str.charAt(i))){
                return false;
            }
            else
                charMap.put(str.charAt(i), 1);
        }
        return true;
    }
	
	 private static boolean hasUniqueCharacters(String str){
	        for(char ch : str.toCharArray()){
	            if(str.indexOf(ch) == str.lastIndexOf(ch))
	                continue;
	            else
	                return false;
	        }
	        return true;
	    }
	
	public static void main(String[] args) {
		System.out.println(hasUniqueCharacters("This i"));
	}
	
}
