package q_2660_DetermineTheWinnerOfABowlingGame;

import static q_2660_DetermineTheWinnerOfABowlingGame.Solution.isWinner;

/*
You are given two 0-indexed integer arrays player1 and player2, 
that represent the number of pins that player 1 and player 2 hit in a bowling game, respectively.

The bowling game consists of n turns, and the number of pins in each turn is exactly 10.

Assume a player hit xi pins in the ith turn. The value of the ith turn for the player is:

2xi if the player hit 10 pins in any of the previous two turns.
Otherwise, It is xi.
The score of the player is the sum of the values of their n turns.

Return

1 if the score of player 1 is more than the score of player 2,
2 if the score of player 2 is more than the score of player 1, and
0 in case of a draw.
*/

/*
Constraints:

n == player1.length == player2.length
1 <= n <= 1000
0 <= player1[i], player2[i] <= 10
*/

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] player1 = { 4, 10, 7, 9 };
		int[] player2 = { 6, 5, 2, 3 };
		System.out.println(isWinner(player1, player2));// 1

		// test case 2
		int[] p1 = { 3, 5, 7, 6 };
		int[] p2 = { 8, 10, 10, 2 };
		System.out.println(isWinner(p1, p2));// 2

	}

}
