package q_49_GroupAnagrams;

import static q_49_GroupAnagrams.Solution.groupAnagrams;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs1));// [[eat, tea, ate], [bat], [tan, nat]]

		// test case 2
		String[] strs2 = { "" };
		System.out.println(groupAnagrams(strs2));//[[]]

		// test case 3
		String[] strs3 = { "a" };
		System.out.println(groupAnagrams(strs3));//[[a]]
	}

}
