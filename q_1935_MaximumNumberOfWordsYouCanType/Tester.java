package q_1935_MaximumNumberOfWordsYouCanType;

import static q_1935_MaximumNumberOfWordsYouCanType.Solution.canBeTypedWords;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
//		String text="leet code";
//		String brokenLetters ="e";
		// 0

		// Test case 2
//		String text = "hello world";
//		String brokenLetters = "ad";
		// 1

		// Test case 3
		String text = "leet code";
		String brokenLetters = "lt";
		// 1

		System.out.println(canBeTypedWords(text, brokenLetters));
	}

}
