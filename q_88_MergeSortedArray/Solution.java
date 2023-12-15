package q_88_MergeSortedArray;

import java.util.Arrays;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, 
where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored.
nums2 has a length of n.

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109


*/




public class Solution {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] big = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < (m + n)) {
			if (j<m && n>0 && k<n && nums1[j] < nums2[k]) {
				System.out.println("1");
				System.out.println(" j " + j + " nums1[j] " + nums1[j]);
				big[i++] = nums1[j++];
			} else if (k < n && m>0 && j<m && nums1[j] > nums2[k]) {
				System.out.println("2");
				System.out.println( " k "+j+" nums2[k] "+nums2[k]);
				big[i++] = nums2[k++];
			}else if(k==n || j==m) {
				if(j==m) {
					System.out.println("2.1");
					System.out.println( " k "+j+" nums2[k] "+nums2[k]);
					big[i++] = nums2[k++];
				}else {
					System.out.println("2.2");
					System.out.println(" j " + j + " nums1[j] " + nums1[j]);
					big[i++] = nums1[j++];
				}
			}
			else {
				System.out.println("3");
				System.out.println( " j "+j+" nums1[j] "+nums1[j]);
				big[i++] = nums1[j++];
				System.out.println( " k "+k+" nums2[k] "+nums2[k]);
				big[i++] = nums2[k++];
			}
			System.out.println();
			System.out.println("i "+i+ " j "+ j+ " k "+k );
			
		}
		System.out.println(Arrays.toString(big));
		for (i = 0; i < nums1.length; i++) {
			nums1[i] = big[i];
		}
	}
}
