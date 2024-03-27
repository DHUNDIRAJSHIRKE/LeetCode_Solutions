package q_884_UncommonWordsFromTwoSentences;

import static q_884_UncommonWordsFromTwoSentences.Solution.uncommonFromSentences;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";
		System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));// [sweet, sour]

		// test case 2
		s1 = "apple apple";
		s2 = "banana";
		System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));//[banana]
	}

}
