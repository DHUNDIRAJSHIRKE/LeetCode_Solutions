package q_1299_ReplaceElementsWithGreatestElementOnRightSide;

/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, 
and replace the last element with -1.

After doing so, return the array.
*/

/*
Constraints:

1 <= arr.length <= 10^4
1 <= arr[i] <= 10^5
*/

class Solution {
	public static int[] replaceElements(int[] arr) {
		int rightMax = -1;
		int l = arr.length;
		int[] ret = new int[l];
		for (int i = l - 1; i >= 0; i--) {
			ret[i] = rightMax;
			if (rightMax < arr[i]) {
				rightMax = arr[i];
			}
		}
		return ret;

	}
}
