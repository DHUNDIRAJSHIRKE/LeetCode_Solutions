package q_2942_FindWordsContainingCharacter;
import static q_2942_FindWordsContainingCharacter.Solution.findWordsContaining;
public class Tester {

	public static void main(String[] args) {
		
		//Test case 1
		String[] words = {"leet","code"};
		char x = 'e';
		
		
		//Test case 2
//		String[] words = {"abc","bcd","aaaa","cbc"};
//		char x = 'a';
		
		//Test case 3
//		String[] words = {"abc","bcd","aaaa","cbc"};
//		char x = 'z';
		
		
		System.out.println(findWordsContaining(words, x));
		
		

	}

}
