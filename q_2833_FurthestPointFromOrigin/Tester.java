package q_2833_FurthestPointFromOrigin;
import static q_2833_FurthestPointFromOrigin.Solution.furthestDistanceFromOrigin;
public class Tester {

	public static void main(String[] args) {
//		String moves = "L_RL__R";	
		String moves = "_______";
		int ans = furthestDistanceFromOrigin(moves);
		System.out.println("Farthest distance is : "+ans);
	}

}
