package q_3000_MaximumAreaOfLongestDiagonalRectangle;
import static q_3000_MaximumAreaOfLongestDiagonalRectangle.Solution.areaOfMaxDiagonal;
public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[][] dimensions1 = {{9,3},{8,6}};
		System.out.println(areaOfMaxDiagonal(dimensions1));//48
		
		//test case 2
		int[][] dimensions2 = {{3,4},{4,3}};
		System.out.println(areaOfMaxDiagonal(dimensions2));//12

	}

}
