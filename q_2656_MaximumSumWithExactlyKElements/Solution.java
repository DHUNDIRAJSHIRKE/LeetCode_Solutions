package q_2656_MaximumSumWithExactlyKElements;


/*You are given a 0-indexed integer array nums and an integer k. 
 * Your task is to perform the following operation exactly k times in order to maximize your score:

Select an element m from nums.
Remove the selected element m from the array.
Add a new element with a value of m + 1 to the array.
Increase your score by m.
Return the maximum score you can achieve after performing the operation exactly k times.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
1 <= k <= 100

*
*/




public class Solution {
	public static int maximizeSum(int[] nums, int k) {
		int max = maximumElement(nums);
		int score = 0;
		while (k > 0) {
			score += max;
			max++;
			k--;
		}
		return score;
	}

	public static int maximumElement(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
