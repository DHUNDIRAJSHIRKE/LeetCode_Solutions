package q_387_FirstUniqueCharacterInAString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> order = new HashMap<>();
		HashMap<Character, Integer> map = new HashMap<>();
		List<Character> list = new ArrayList<>();
		char[] alphabets = s.toCharArray();
		int temp;
		for (int i = 0; i < alphabets.length; i++) {

			if (!map.containsKey(alphabets[i])) {
				map.put(alphabets[i], 1);
			} else {
				temp = map.get(alphabets[i]);
				map.put(alphabets[i], temp + 1);
			}

			if (!order.containsKey(alphabets[i])) {
				order.put(alphabets[i], i);
			}

			if (!list.contains(alphabets[i])) {
				list.add(alphabets[i]);
			}

		}
//		System.out.println(order);

		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i) + "  " + map.get(list.get(i)));
			if (map.get(list.get(i)) == 1) {
				return order.get(list.get(i));
			}
		}
		return -1;
	}
}