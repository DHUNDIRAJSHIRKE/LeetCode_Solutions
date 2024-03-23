package q_1773_CountItemsMatchingARule;

import static q_1773_CountItemsMatchingARule.Solution.countMatches;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		List<List<String>> items = new ArrayList<>();
		String ruleKey = "color";
		String ruleValue = "silver";
		String[] item1 = { "phone", "blue", "pixel" };
		List<String> list = new ArrayList<>();
		for (int i = 0; i < item1.length; i++) {
			list.add(item1[i]);
		}
		items.add(list);

		String[] item2 = { "computer", "silver", "lenovo" };
		list = new ArrayList<>();
		for (int i = 0; i < item2.length; i++) {
			list.add(item2[i]);
		}
		items.add(list);

		String[] item3 = { "phone", "gold", "iphone" };
		list = new ArrayList<>();
		for (int i = 0; i < item3.length; i++) {
			list.add(item3[i]);
		}
		items.add(list);
		System.out.println(countMatches(items, ruleKey, ruleValue));// 1

	}

}
