package q_2656_MaximumSumWithExactlyKElements;

import static q_2656_MaximumSumWithExactlyKElements.Solution.maximizeSum;

public class Tester {

	public static void main(String[] args) {

		/* test case 1 
 		int[] nums = {1,2,3,4,5};
		int k = 3;
		*/
		
		
		// test case 1
		int[] nums = {5,5,5};
		int k = 2;
		

		
		/* test case 1
		int[] nums = {};
		int k = 0;
		*/


		System.out.println(maximizeSum(nums, k));

	}

}
