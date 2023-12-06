package q_1812_DetermineColorOfAChessboardSquare;


/*You are given coordinates, a string that represents the coordinates of a square of the chessboard.
 * Below is a chessboard for your reference.
 * Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square.
The coordinate will always have the letter first, and the number second.
*/


public class Solution {
	public static boolean squareIsWhite(String coordinates) {
		char[] charCo = coordinates.toCharArray();
		int rank = charCo[0]-96;
		int col = charCo[1] -48;
		System.out.println(rank+" "+col);
		if((rank+col)%2==1) {
			return true;
		}
		return false;
	}
}
