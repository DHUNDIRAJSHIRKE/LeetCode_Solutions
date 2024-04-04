package q_2016_MaximumDifferenceBetweenIncreasingElements;

import static q_2016_MaximumDifferenceBetweenIncreasingElements.Solution.maximumDifference;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 7, 1, 5, 4 };
		System.out.println(maximumDifference(nums1));// 4

		// test case 2
		int[] nums2 = { 9, 4, 3, 2 };
		System.out.println(maximumDifference(nums2));// -1

		// test case 3
		int[] nums3 = { 1, 5, 2, 10 };
		System.out.println(maximumDifference(nums3));// 9

	}

}
