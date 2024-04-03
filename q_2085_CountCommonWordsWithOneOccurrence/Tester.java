package q_2085_CountCommonWordsWithOneOccurrence;

import static q_2085_CountCommonWordsWithOneOccurrence.Solution.countWords;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String[] words1_1 = { "leetcode", "is", "amazing", "as", "is" };
		String[] words2_1 = { "amazing", "leetcode", "is" };
		System.out.println(countWords(words1_1, words2_1));// 2

		// test case 2
		String[] words1_2 = { "b", "bb", "bbb" };
		String[] words2_2 = { "a", "aa", "aaa" };
		System.out.println(countWords(words1_2, words2_2));// 0

		// test case 3
		String[] words1_3 = { "a", "ab" };
		String[] words2_3 = { "a", "a", "a", "ab" };
		System.out.println(countWords(words1_3, words2_3));// 1
	}

}
