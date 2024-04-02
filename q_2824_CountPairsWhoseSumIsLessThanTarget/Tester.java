package q_2824_CountPairsWhoseSumIsLessThanTarget;

import static q_2824_CountPairsWhoseSumIsLessThanTarget.Solution.countPairs;
import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] arr1 = { -1, 1, 2, 3, 1 };
		List<Integer> nums = new ArrayList<>();
		for (int i : arr1) {
			nums.add(i);
		}
		int target = 2;
		System.out.println(countPairs(nums, target));// 3

		nums.clear();

		int[] arr2 = { -6,2,5,-2,-7,-1,3 };
		for (int i : arr2) {
			nums.add(i);
		}
		target = -2;
		System.out.println(countPairs(nums, target));//10
		
		
		
	}

}
