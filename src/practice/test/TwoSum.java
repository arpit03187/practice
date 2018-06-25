package practice.test;

public class TwoSum {

	public static void main(String[] args) {

		int nums[] = { 2, 7, 4, 5, 11, 15 };

		int a[] = twoSum(nums, 9);

		for (int x = 0; x < a.length; x++) {
			System.out.println(a[x]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target)
					return new int[] { i, j};
			}
		}
		return null;
	}

}
