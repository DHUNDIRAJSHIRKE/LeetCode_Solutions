package q_2103_RingsAndRods;

import java.util.Arrays;

/*There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.

You are given a string rings of length 2n that describes the n rings that are placed onto the rods. 
Every two characters in rings forms a color-position pair that is used to describe each ring where:

The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
For example, "R3G2B1" describes n == 3 rings: 
a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.

Return the number of rods that have all three colors of rings on them.



Constraints:

rings.length == 2 * n
1 <= n <= 100
rings[i] where i is even is either 'R', 'G', or 'B' (0-indexed).
rings[i] where i is odd is a digit from '0' to '9' (0-indexed).


*
*/

public class Solution {
	public static int countPoints(String rings) {
		int twiceL = rings.length();
		char[] chArr = rings.toCharArray();
		int pos = 0;
		int[] R = new int[10];
		int[] G = new int[10];
		int[] B = new int[10];

		for (int i = 0; i < twiceL/2; i++) {
			pos = Integer.parseInt(String.valueOf(chArr[(2*i+1)]));
//			System.out.println(pos);
			if (chArr[2 * i] == 'R') {
				R[pos] = 1;
			} else if (chArr[2 * i] == 'G') {
				G[pos] = 1;
			} else {
				B[pos] = 1;
			}
		}
//		System.out.println(Arrays.toString(R));
//		System.out.println(Arrays.toString(G));
//		System.out.println(Arrays.toString(B));	
		int count = 0;
		for (int i = 0; i <10; i++) {
			if (R[i] == 1 && G[i] == 1 && B[i] == 1) {
				count++;
			}
		}
		return count;

	}
}
