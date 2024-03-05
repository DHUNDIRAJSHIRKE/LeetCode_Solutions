package q_539_MinimumTimeDifference;

import static q_539_MinimumTimeDifference.Solution.findMinDifference;
import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		List<String> timePoints = new ArrayList<>();
		String[] strs1 = { "23:59", "00:00" };
		for (String str : strs1) {
			timePoints.add(str);
		}
		System.out.println(findMinDifference(timePoints));// 1

		timePoints.clear();
		// test case 2
		String[] strs2 = { "00:00", "23:59", "00:00" };
		for (String str : strs2) {
			timePoints.add(str);
		}
		System.out.println(findMinDifference(timePoints));// 0

	}

}
