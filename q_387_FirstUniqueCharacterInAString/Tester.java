package q_387_FirstUniqueCharacterInAString;

import static q_387_FirstUniqueCharacterInAString.Solution.firstUniqChar;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String s = "leetcode";
		System.out.println(firstUniqChar(s));//0

		// test case 2
		s = "loveleetcode";
		System.out.println(firstUniqChar(s));//2

		// test case 3
		s = "aabb";
		System.out.println(firstUniqChar(s));//-1
	}

}
