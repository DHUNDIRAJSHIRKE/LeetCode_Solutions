package q_26_RemoveDuplicatesfromSortedArray;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
The remaining elements of nums are not important as well as the size of nums.
Return k.


Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.


*
*
*/



public class Solution {
	public static int removeDuplicates(int[] nums) {
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]);
//				System.out.println("Added : " + nums[i]);
				count++;
			}
		}
//		int x = 0;
		int[] temp = new int[count];
		for (int i = 0; i < temp.length; i++) {
			
			temp[i] = list.get(i);
//			System.out.println(" tep["+i+"] = " +temp[i]);
		}
		Arrays.sort(temp);
//		System.out.println(" Temp " + Arrays.toString(temp));
		for (int i = 0; i < temp.length; i++) {
			nums[i] = temp[i];
		}
//		System.out.println(" nums " + Arrays.toString(nums));
		return count;
	}

}
