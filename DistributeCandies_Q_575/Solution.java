package DistributeCandies_Q_575;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
	/*
	 * Alice has n candies, where the ith candy is of type candyType[i]. Alice
	 * noticed that she started to gain weight, so she visited a doctor. The doctor
	 * advised Alice to only eat n / 2 of the candies she has (n is always even).
	 * Alice likes her candies very much, and she wants to eat the maximum number of
	 * different types of candies while still following the doctor's advice. Given
	 * the integer array candyType of length n, return the maximum number of
	 * different types of candies she can eat if she only eats n / 2 of them.
	 */
	public int distributeCandies(int[] candyType) {
		int[] distinct = new int[candyType.length];
		HashMap<Integer, Boolean> list = new HashMap<>();
		for (int i = 0; i < candyType.length; i++) {
			if (!list.containsKey(candyType[i])) {
				list.put(candyType[i], true);
			}
		}
		int count = 0;
		Set<Integer> distinctList = new HashSet<>();
		distinctList = list.keySet();
		Iterator itr = distinctList.iterator();
		while (itr.hasNext()) {
			itr.next();
			count++;
		}
		if (count >= candyType.length / 2) {
			return candyType.length / 2;
		} else {
			return count;
		}
	}
}
