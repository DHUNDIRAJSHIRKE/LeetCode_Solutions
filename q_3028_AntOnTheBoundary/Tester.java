package q_3028_AntOnTheBoundary;

import static q_3028_AntOnTheBoundary.Solution.returnToBoundaryCount;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 2, 3, -5 };
		System.out.println(returnToBoundaryCount(nums1));// 1

		// test case 2
		int[] nums2 = { 3, 2, -3, -4 };
		System.out.println(returnToBoundaryCount(nums2));// 0

		// test case 3
		int[] nums3 = { -10, 10, 8 };
		System.out.println(returnToBoundaryCount(nums3));// 1

	}

}
