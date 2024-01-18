package q_1003_CheckIfWordIsValidAfterSubstitutions;
import static q_1003_CheckIfWordIsValidAfterSubstitutions.Solution.isValid;
public class Tester {

	public static void main(String[] args) {
		// Test case 1
		String abc = "aabcbc";//true
		
		// Test case 2
		abc = "abccba";//false
		
		// Test case 3
		abc = "abcabcababcc";//true
		
		// Test case 4
		abc = "cababc";//false
		
		// Test case 5
		abc = "aabbcc";//false
		
		
		System.out.println(isValid(abc));

	}

}
