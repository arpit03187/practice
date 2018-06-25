package practice.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Prints the number that appear odd number of times in an array of integers
 * 
 * @author arpit.srivastava
 *
 */
public class OddNumberOfTimes {
	
	public int oddNumberOfTimes(int num[]) {
		Map<Integer, Integer> intNumberMap = new HashMap<>();
		Integer x = null;
		int key = 0;
		
		if(num.length == 1) {
			return num[0];
		}
		
		for(int i = 0; i < num.length; i++) {
			
			if(!intNumberMap.containsKey(num[i])) {
				intNumberMap.put(num[i], 1);
			}
			else {
				intNumberMap.put(num[i], intNumberMap.get(num[i])+1);
			}
			
		}
		
		Collection<Integer> values = intNumberMap.values();
		for(Integer value: values) {
			if(value % 2 != 0) {
				x = value;
			}
		}
		
		for(Map.Entry entry: intNumberMap.entrySet()){
            if(entry.getValue().equals(x)){
                key = (int) entry.getKey();
                break; 
            }
        }
		
		return key;
	}
	
	public static void main(String[] args) {
		
		int num[] = {1,1,1,1,2,2,3,3,4,4};
		OddNumberOfTimes odd = new OddNumberOfTimes();
		System.out.println(odd.oddNumberOfTimes(num));
	}

}
