package practice.test;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
	    int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {0,1,2,2,3,0,4,2 };
		System.out.println(removeElement(nums, 3));
	}
	
	
//	public static void removeElement2(int nums, int val) {
//		
//		List<Integer> numbers = IntS
//	}
}
