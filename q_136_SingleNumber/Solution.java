package q_136_SingleNumber;

import java.util.HashMap;
/*Given a non-empty array of integers nums, every element appears twice except for one.
 *Find that single one.
 *You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {				
				map.put(nums[i], 0);
			}else {
				map.put(nums[i], 1);
			}
		}
		for(int i = 0 ; i<nums.length;i++) {
			if(map.get(nums[i]) != null && map.get(nums[i])==0) {
				return nums[i];
			}
		}
		return 0;
    }
}