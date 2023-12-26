package q_2089_FindTargetIndicesAfterSortingArray;

import static q_2089_FindTargetIndicesAfterSortingArray.Solution.targetIndices;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
//		int[] nums= {1,2,5,2,3};
//		int target =2;

		// Test case 2
//		int[] nums = { 1, 2, 5, 2, 3 };
//		int target = 3;

		// Test case 3
		int[] nums = { 1, 2, 5, 2, 3 };
		int target = 5;

		System.out.println(targetIndices(nums, target));
	}

}
