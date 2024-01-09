package q_2149_RearrangeArrayElementsBySign;
import static q_2149_RearrangeArrayElementsBySign.Solution.rearrangeArray;

import java.util.Arrays;
public class Tester {

	public static void main(String[] args) {
		// Test case 1
		//int[] nums = {3,1,-2,-5,2,-4};
		//[3, -2, 1, -5, 2, -4]
		
		//Test case 2
		int[] nums = {-1,1};
		//[1, -1]	
		
		System.out.println(Arrays.toString(rearrangeArray(nums)));

	}

}
