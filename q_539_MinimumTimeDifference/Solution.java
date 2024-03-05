package q_539_MinimumTimeDifference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given a list of 24-hour clock time points in "HH:MM" format, 
return the minimum minutes difference between any two time-points in the list.
*/

/*
Constraints:

2 <= timePoints.length <= 2 * 104
timePoints[i] is in the format "HH:MM".
*/

class Solution {
	public static int findMinDifference(List<String> timePoints) {
		List<Integer> list = new ArrayList<>();
		int time;
		String[] hoursMinutes;
		for (String timePoint : timePoints) {
			hoursMinutes = timePoint.split(":");
			time = 60 * Integer.parseInt(hoursMinutes[0]) + Integer.parseInt(hoursMinutes[1]);
			if (list.contains(time)) {
				return 0;
			}
			list.add(time);
		}
		Collections.sort(list);
		int min = 1000000;
		int diff;
		for (int i = 0; i < list.size() - 1; i++) {
			diff = list.get(i + 1) - list.get(i);
			if (diff < min)
				min = diff;
		}
		int max = 24 * 60;

		diff = max - list.get(list.size() - 1) + list.get(0);
		if (diff < 0)
			diff *= -1;
		if (diff < min) {
			min = diff;
		}
		return min;
	}
}
