package q_2053_KthDistinctStringInAnArray;

import java.util.ArrayList;

/*
 
A distinct string is a string that is present only once in an array.
Given an array of strings arr, and an integer k, return the kth distinct string present in arr. 
If there are fewer than k distinct strings, return an empty string "".
Note that the strings are considered in the order in which they appear in the array.

*/


 /*

Constraints:

1 <= k <= arr.length <= 1000
1 <= arr[i].length <= 5
arr[i] consists of lowercase English letters.

*/

class Solution {
	public static String kthDistinct(String[] arr, int k) {
		ArrayList<String> repeat = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i].equals(arr[j])) {
					repeat.add(arr[i]);
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (!repeat.contains(arr[i])) {
				list.add(arr[i]);
			}
		}

		if (list.size() < k) {
			return "";
		} else {
			return list.get(k - 1);
		}
	}
}
