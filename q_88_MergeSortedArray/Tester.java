package q_88_MergeSortedArray;
import static q_88_MergeSortedArray.Solution.merge;

import java.util.Arrays;
public class Tester {

	public static void main(String[] args) {
		/*Test case 1
		int [] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int [] nums2 = {2,5,6};
		int n = 3;
		*/
		
		//Test case 2 
		/*
		int [] nums1 = {1};
		int m = 1;
		int [] nums2 = {};
		int n = 0;
		*/ 
		 
		//Test case 3
		int [] nums1 = {2,0};
		int m = 1;
		int [] nums2 = {1};
		int n = 1;
		
		merge(nums1, m, nums2, n);
		
		System.out.println(Arrays.toString(nums1));
	}

}
