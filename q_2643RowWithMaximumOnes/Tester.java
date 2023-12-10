package q_2643RowWithMaximumOnes;
import static q_2643RowWithMaximumOnes.Solution.rowAndMaximumOnes;

import java.util.Arrays;
public class Tester {

	public static void main(String[] args) {
		//test case 1
		int[][] mat = {
				{0,0},{1,1},{0,0}
		};
		
		/*Test case 2 
		int[][] mat = {
				{0,0,0},{0,0,0}	
		};*/
		
		/*Test case 3 
		int[][] mat = {
				{0,1},{1,0}	
		};*/
		
		System.out.println(Arrays.toString(rowAndMaximumOnes(mat)));

	}

}
