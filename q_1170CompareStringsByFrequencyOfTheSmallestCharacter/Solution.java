package q_1170CompareStringsByFrequencyOfTheSmallestCharacter;
/*
 * Let the function f(s) be the frequency of the lexicographically smallest character in a non-empty string s. 
 * For example, if s = "dcce" then f(s) = 2 because the lexicographically smallest character is 'c', which has a frequency of 2.

You are given an array of strings words and another array of query strings queries. 
For each query queries[i], count the number of words in words such that f(queries[i]) < f(W) for each W in words.

Return an integer array answer, where each answer[i] is the answer to the ith query.




Constraints:

1 <= queries.length <= 2000
1 <= words.length <= 2000
1 <= queries[i].length, words[i].length <= 10
queries[i][j], words[i][j] consist of lowercase English letters.


 * 
 * */

public class Solution {
	public static int[] numSmallerByFrequency(String[] queries, String[] words) {
		int qL = queries.length;
		int wL = words.length;
		int count = 0;
		// char[] charArr = new char[qL];
		int[] intArrQ = new int[qL];
		for (int i = 0; i < qL; i++) {
			// charArr[i] = queries[i].toCharArray();
			intArrQ[i] = f(queries[i]);
		}
		int[] intArrW = new int[wL];
		for (int i = 0; i < wL; i++) {
			intArrW[i] = f(words[i]);
		}
		for (int i = 0; i < qL; i++) {
			count = 0;
			for (int j = 0; j < wL; j++) {

				if (intArrQ[i] < intArrW[j]) {
					count++;
				}
			}
			intArrQ[i] = count;
		}
		return intArrQ;
	}

	public static int f(String s) {
//		int l = s.length();
		char[] sChar = s.toCharArray();
		char min = Character.MAX_VALUE;
		for (int i = 0; i < sChar.length; i++) {
			if(sChar[i]<min) {
				min = sChar[i];
			}
		}
		int count=0;
		for(int i = 0 ; i<sChar.length;i++) {
			if(sChar[i]==min) {
				count++;
			}
		}
		return count;
	}
}
