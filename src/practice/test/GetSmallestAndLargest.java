package practice.test;

import java.util.*;

public class GetSmallestAndLargest {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> subStrings = new ArrayList<>();
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int start = 0;
        int end = s.length()-k;
        
        while(start <= end) {
        	subStrings.add(s.substring(start, start+k));
        	start++;
        }
        
        Collections.sort(subStrings);
        
        largest = subStrings.get(subStrings.size() - 1);
        smallest = subStrings.get(0);
    
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
 
        System.out.println(getSmallestAndLargest(s, k));
    }

}
