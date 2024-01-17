package q_1207_UniqueNumberOfOccurrences;
import static q_1207_UniqueNumberOfOccurrences.Solution.uniqueOccurrences;
public class Tester {

	public static void main(String[] args) {
		//test case 1
//		int[] arr = {1,2,2,1,1,3};//true
		
		//test case 2
//		int[] arr = {1,2};//false
		
		//test case 3
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};//true
		
		
		System.out.println(uniqueOccurrences(arr));

	}

}
