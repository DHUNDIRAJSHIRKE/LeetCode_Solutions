package q_169_MajorityElement;

import java.util.HashMap;
/*Given an array nums of size n, return the majority element.
*The majority element is the element that appears more than ⌊n / 2⌋ times. 
*You may assume that the majority element always exists in the array
*/
public class Solution {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				count = (int) map.get(nums[i]);
				map.put(nums[i], ++count);
				if (count > nums.length / 2) {
					return nums[i];
				}
			}
		}
		return nums[0];
	}
}