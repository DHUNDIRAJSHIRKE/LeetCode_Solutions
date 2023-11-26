package q_2148_CountElementsWithStrictlySmallerAndGreaterElements;

/*Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.
 * 
 * 
 * 
 *
 * 
 * Constraints:

1 <= nums.length <= 100
-105 <= nums[i] <= 105
 * */

public class Solution {
	public static int countElements(int[] nums) {
		int i = 0, j = 0, l = nums.length;
		boolean up = false, down = false;
		int count = 0;
		for (i = 0; i < l; i++) {
			up = false;
			down = false;
			for (j = 0; j < l; j++) {
				if (i != j) {
					if (nums[i] - nums[j] >= 1) {
						down = true;
						if (up && down) {
							// System.out.println("i "+i);
							count++;
							break;
						}
						// System.out.println( "found down i "+ i + " j "+ j);
					}
					if (nums[j] - nums[i] >= 1) {
						up = true;
						if (up && down) {
							// System.out.println("i "+i);
							count++;
							break;
						}
						// System.out.println( " found up i "+ i + " j "+ j);
					}
				}
			}

		}
		return count;
	}
}
