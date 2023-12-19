package q_1941_CheckIfAllCharactersHaveEqualNumberOfOccurrences;

import java.util.ArrayList;

/*Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).


Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.
*/



public class Solution {
	public static boolean areOccurrencesEqual(String s) {
		char[] charArr = s.toCharArray();
//		System.out.println(Arrays.toString(charArr));
		int count = 0;
		ArrayList<Character> list = new ArrayList<>();
		for(char c : charArr) {
			if(!list.contains(c)) {
				count++;
				list.add(c);
			}
		}
		if(list.isEmpty()) {
			return false;
		}
		char[] distinct = new char[count];
		for(int i = 0 ; i<count ;i++) {
			distinct[i] = list.get(i);
		}
//		System.out.println(Arrays.toString(distinct));
		int[] countsChar = new int[count];
//		System.out.println(Arrays.toString(distinct));
		for(int i = 0 ; i<count;i++) {
			for(int j = 0; j<charArr.length;j++) {
				if(distinct[i]== charArr[j]) {
					countsChar[i]++;
				}
			}
		}
//		System.out.println(Arrays.toString(countsChar));
		int check = countsChar[0];
//		System.out.println();
		for(int k : countsChar) {
			if(k!=check) {
				return false;
			}
		}
		return true;
		
	}
}
