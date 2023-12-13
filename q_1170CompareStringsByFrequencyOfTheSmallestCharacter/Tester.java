package q_1170CompareStringsByFrequencyOfTheSmallestCharacter;

import static q_1170CompareStringsByFrequencyOfTheSmallestCharacter.Solution.numSmallerByFrequency;

import java.util.Arrays;
public class Tester {

	public static void main(String[] args) {
		
		/*Test Case 1
		String[] queries = {
				"bbb","cc"	
		};
		String[] words = {
				"a","aa","aaa","aaaa"	
		};
		*/
		
		/*Test Case 2*/
		 String[] queries = {
				 "cbd"	 	
		};
		String[] words = {
				"zaaaz"	
		};
		System.out.println(Arrays.toString(numSmallerByFrequency(queries,words)));
		
	}

}
