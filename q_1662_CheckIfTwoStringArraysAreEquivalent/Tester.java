package q_1662_CheckIfTwoStringArraysAreEquivalent;

import static q_1662_CheckIfTwoStringArraysAreEquivalent.Solution.arrayStringsAreEqual;

public class Tester {

	public static void main(String[] args) {
		// test case 1
//		String[] word1 = { "ab", "c" };
//		String[] word2 = { "a", "bc" };
		// true

		// test case 2
//		String[] word1={"a", "cb"};
//		String[] word2={"ab", "c"};
		// false

		// test case 3
		String[] word1 = { "abc", "d", "defg" };
		String[] word2 = { "abcddefg" };
		// true

		System.out.println(arrayStringsAreEqual(word1, word2));

	}

}
