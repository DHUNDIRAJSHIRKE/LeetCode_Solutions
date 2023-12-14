package q_26_RemoveDuplicatesfromSortedArray;
import static q_26_RemoveDuplicatesfromSortedArray.Solution.removeDuplicates;

import java.util.Arrays;
public class Tester {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
		

	}

}
