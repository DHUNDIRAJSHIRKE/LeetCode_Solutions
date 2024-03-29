package q_1773_CountItemsMatchingARule;

import java.util.List;

/*
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
*/

/*
Constraints:

1 <= items.length <= 104
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters.
*/

class Solution {
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		for (List<String> list : items) {
			if (ruleKey.equals("type") && ruleValue.equals(list.get(0))) {
				count++;
			} else if (ruleKey.equals("color") && ruleValue.equals(list.get(1))) {
				count++;
			} else if (ruleKey.equals("name") && ruleValue.equals(list.get(2))) {
				count++;
			}
		}
		return count;
	}
}
