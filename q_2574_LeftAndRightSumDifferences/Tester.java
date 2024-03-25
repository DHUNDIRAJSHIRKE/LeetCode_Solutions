package q_2574_LeftAndRightSumDifferences;

import static q_2574_LeftAndRightSumDifferences.Solution.leftRightDifference;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 10, 4, 8, 3 };
		System.out.println(Arrays.toString(leftRightDifference(nums1)));//[15, 1, 11, 22]

		// test case 2
		int[] nums2 = { 1 };
		System.out.println(Arrays.toString(leftRightDifference(nums2)));//[0]

	}

}
