package q_1512_NumberOfGoodPairs;

import static q_1512_NumberOfGoodPairs.Solution.numIdenticalPairs;

public class Tester {

	public static void main(String[] args) {
		// test case 1
//		int[] nums = {1,2,3,1,1,3};
		// 4

		// test case 2
//		int[] nums = { 1,1,1,1};
		// 6

		// test case 3
		int[] nums = {1,2,3};
		// 0

		System.out.println(numIdenticalPairs(nums));
	}

}
