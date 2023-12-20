package q_2000_ReversePrefixOfWord;

import static q_2000_ReversePrefixOfWord.Solution.reversePrefix;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
		String word = "abcdefd";
		char ch = 'd';

		// Test case 2
//		String word = "xyxzxe";
//		char ch = 'z';

		// Test case 3
//		String word = "abcd";
//		char ch = 'z';

		System.out.println(reversePrefix(word, ch));

	}

}
