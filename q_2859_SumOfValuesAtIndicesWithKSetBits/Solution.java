package q_2859_SumOfValuesAtIndicesWithKSetBits;

import java.util.List;

/*
You are given a 0-indexed integer array nums and an integer k.

Return an integer that denotes the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.

The set bits in an integer are the 1's present when it is written in binary.

For example, the binary representation of 21 is 10101, which has 3 set bits.
*/

/*
Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 105
0 <= k <= 10
*/

class Solution {
	public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
		int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			String str = Integer.toBinaryString(i);
			int count = 0;
			// System.out.println(" bin of "+i+" is "+str )
			for (int j = 0; j < str.length(); j++) {
				// System.out.println("char "+ str.charAt(j));
				if (str.charAt(j) == '1') {
					count++;
				}
			}
			if (count == k) {
				sum += nums.get(i);
			}
		}
		return sum;
	}
}
