package q_1184_DistanceBetweenBusStops;


/*A bus has n stops numbered from 0 to n - 1 that form a circle. 
 *We know the distance between all pairs of neighboring stops where distance[i] is the distance between the stops number i and (i + 1) % n.

The bus goes along both directions i.e. clockwise and counterclockwise.

Return the shortest distance between the given start and destination stops.
*/




public class Solution {
	public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
		int sum1 = 0;
		int sum2 = 0;
		int sum = 0;
		if (start < destination) {
			for (int i = start; i < destination; i++) {
				sum1 += distance[i];
			}
		} else {
			for (int i = destination; i < start; i++) {
				sum1 += distance[i];
			}
		}
		for (int i = 0; i < distance.length; i++) {
			sum += distance[i];
		}
		sum2 = sum - sum1;
		if (sum1 < sum2) {
			return sum1;
		} else {
			return sum2;
		}
	}
}
