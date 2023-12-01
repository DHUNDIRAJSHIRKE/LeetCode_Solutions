package q_2833_FurthestPointFromOrigin;

/*You are given a string moves of length n consisting only of characters 'L', 'R', and '_'. 
 * The string represents your movement on a number line starting from the origin 0.

In the ith move, you can choose one of the following directions:

move to the left if moves[i] = 'L' or moves[i] = '_'
move to the right if moves[i] = 'R' or moves[i] = '_'
Return the distance from the origin of the furthest point you can get to after n moves.
*/

public class Solution {
	public static int furthestDistanceFromOrigin(String moves) {
		int x = 0;
		int underscore = 0;
		char[] arr = moves.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '_') {
				underscore++;
			}
			if (arr[i] == 'L') {
				x--;
			}
			if (arr[i] == 'R') {
				x++;
			}
		}
		if (x <= 0) {
			return -x + underscore;
		}
		return x + underscore;
	}
}
