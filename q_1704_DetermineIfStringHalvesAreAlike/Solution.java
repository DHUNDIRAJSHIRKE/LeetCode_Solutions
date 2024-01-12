package q_1704_DetermineIfStringHalvesAreAlike;

import java.util.ArrayList;
import java.util.Arrays;

/*You are given a string s of even length. Split this string into two halves of equal lengths, 
 * and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). 
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.*/



/*
Constraints:

2 <= s.length <= 1000
s.length is even.
s consists of uppercase and lowercase letters.
*/




class Solution {
	public static boolean halvesAreAlike(String s) {
		ArrayList<Character> list = new ArrayList<>();
		char[] whole = s.toCharArray();
		char[] f = new char[whole.length / 2];
		char[] sec = new char[whole.length / 2];
		for (int i = 0; i < whole.length / 2; i++) {
			f[i] = whole[i];
		}
		for (int i = whole.length / 2 + 1; i < whole.length + 1; i++) {
			sec[i - sec.length - 1] = whole[i - 1];
		}

		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(sec));
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		list.add('A');
		list.add('E');
		list.add('I');
		list.add('O');
		list.add('U');

		int c1 = 0;
		int c2 = 0;
		for (int i = 0; i < f.length; i++) {
			if (list.contains(f[i])) {
				c1++;
				System.out.print(" "+ f[i]);	
			}
			
		}
		System.out.println();
		for (int i = 0; i < sec.length; i++) {
			if (list.contains(sec[i])) {
				c2++;
				System.out.print(" "+ sec[i]);
			}
			
		}
		System.out.println();
		if (c1 == c2) {
			return true;
		} else {
			return false;
		}
	}
}
