package q_4_MedianOfTwoSortedArrays;

import static q_4_MedianOfTwoSortedArrays.Solution.findMedianSortedArrays;

/*
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
 */

/*Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/


public class Tester {

	public static void main(String[] args) {
		/*
		 * //test case 1 int [] nums1 = {1,3}; int [] nums2 = {2};
		 * System.out.println(findMedianSortedArrays(nums1, nums2));//2.0
		 */

		
		// test case 2
		int[] nums1 = { 1,2 };
		int[] nums2 = { 3,4 };
		System.out.println(findMedianSortedArrays(nums1, nums2));// 2.5

	}

}
