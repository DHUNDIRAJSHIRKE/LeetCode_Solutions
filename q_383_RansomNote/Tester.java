package q_383_RansomNote;

import static q_383_RansomNote.Solution.canConstruct;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
		String ransomNote = "aa";
		String magazine = "aab";
		//true
		
		// Test case 2
//		ransomNote = "aa";
//		magazine = "ab";
		//false
		
		// Test case 3
//		ransomNote = "a";
//		magazine = "b";
		//false
		
		System.out.println(canConstruct(ransomNote, magazine));
		

	}

}
