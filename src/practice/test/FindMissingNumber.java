package practice.test;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {
	
public static void main (String[] args) {
		
		// [1, 2, 4, ,6, 3, 7, 8]
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(4);
		array.add(6);
		array.add(3);
		array.add(7);
		array.add(8);
		
		int missingn = getMissingNo(array);
		if(missingn != 0){
		    System.out.println("Missing number: " + missingn);
		} else {
		    System.out.println("No Missing number");
		}
	}
	
	public static int getMissingNo(List<Integer> arr){
	    for(int i = 1; i <= arr.size(); i++){
	        if (arr.indexOf(i) == -1){
	            return i;
	        }
	    }
	    
	    return 0;
	}

}
