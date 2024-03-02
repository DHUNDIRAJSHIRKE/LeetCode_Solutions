package q_724_FindPivotIndex;

import static q_724_FindPivotIndex.Solution.pivotIndex;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(nums1));// 3

		// test case 2
		int[] nums2 = { 1, 2, 3 };
		System.out.println(pivotIndex(nums2));// -1

		// test case 3
		int[] nums3 = { 2, 1, -1 };
		System.out.println(pivotIndex(nums3));// 0

	}

}
