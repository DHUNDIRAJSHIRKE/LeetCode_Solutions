package q_2529_MaximumCountOfPositiveIntegerAndNegativeInteger;

import static q_2529_MaximumCountOfPositiveIntegerAndNegativeInteger.Solution.maximumCount;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
//		int[] nums = { -2, -1, -1, 1, 2, 3 };
		// ans 3

		// Test case 2
//		int[] nums = { -3,-2,-1,0,0,1,2 };
		// ans 3

		// Test case 3
		int[] nums = {5,20,66,1314};
		// ans 4
		
		System.out.println(maximumCount(nums));

	}

}
