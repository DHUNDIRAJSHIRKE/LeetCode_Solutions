package q_1608_SpecialArray;

/*You are given an array nums of non-negative integers. 
 * nums is considered special if there exists a number x such that,
 * there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Return x if the array is special, otherwise, return -1. 
It can be proven that if nums is special, the value for x is unique.
*/



public class Solution {
	public static int specialArray(int[] nums) {
		int count = 0;
		int l = nums.length;
		for(int i = l-1; i>=0;i--) {						
			count =0;
			System.out.println("Starting new X    i = "+i+ "value : "+nums[i]);
			for(int j = 0 ; j<l;j++) {
				if(nums[j]>=(i+1)) {
					System.out.println(" increasing count for i = "+i+" nums[j]"+nums[j]+" count = "+(count+1));
					count++;
				}
			}
			System.out.println("for "+"i count is "+count);
			if(count == i+1){
				return (i+1);
			}
		}
		return -1;
	}
}
