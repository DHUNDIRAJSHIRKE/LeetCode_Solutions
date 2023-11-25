package q_771_JewelsAndStones;

import java.util.HashMap;

/*
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
 * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".  
 */
public class Solution {
	public static int numJewelsInStones(String jewels, String stones) {
		char[] jewelsArr = jewels.toCharArray();
		char[] stonesArr = stones.toCharArray();
		int count = 0;
		HashMap<Character, Integer> jewelsMap = new HashMap<>();
		for (char c : jewelsArr) {
			jewelsMap.put(c, 1);
		}
		for (char c : stonesArr) {
			if (jewelsMap.containsKey(c)) {
				count++;
			}
		}
		return count;
	}
}
