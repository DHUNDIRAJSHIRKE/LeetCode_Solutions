package q_34_FindFirstAndLastPositionOfElementInSortedArray;

import static q_34_FindFirstAndLastPositionOfElementInSortedArray.Solution.searchRange;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
		int[] nums= {5,7,7,8,8,10};
		int target=8;

		// Test case 2
//		int[] nums = {5,7,7,8,8,10};
//		int target = 6;

		// Test case 3
//		int[] nums = {  };
//		int target=0;

		System.out.println(Arrays.toString(searchRange(nums, target)));
	}

}
