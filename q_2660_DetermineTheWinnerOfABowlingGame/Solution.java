package q_2660_DetermineTheWinnerOfABowlingGame;



class Solution {
	public static int isWinner(int[] player1, int[] player2) {
		int l = player1.length;
		int score1 = 0;
		int score2 = 0;
		for (int i = 0; i < l; i++) {
			if (i == 0) {
				score1 += player1[i];
				score2 += player2[i];
			} else if (i == 1) {
				if (player1[i - 1] == 10) {
					score1 += player1[i] * 2;
				} else {
					score1 += player1[i];
				}
				if (player2[i - 1] == 10) {
					score2 += player2[i] * 2;
				} else {
					score2 += player2[i];
				}
			} else {
				if (player1[i - 1] == 10 || player1[i - 2] == 10) {
					score1 += player1[i] * 2;
				} else {
					score1 += player1[i];
				}
				if (player2[i - 1] == 10 || player2[i - 2] == 10) {
					score2 += player2[i] * 2;
				} else {
					score2 += player2[i];
				}
			}
		}
		if (score1 == score2) {
			return 0;
		} else {
			if (score1 > score2) {
				return 1;
			} else {
				return 2;
			}
		}
	}
}
