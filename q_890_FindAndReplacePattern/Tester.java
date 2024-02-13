package q_890_FindAndReplacePattern;
import static q_890_FindAndReplacePattern.Solution.findAndReplacePattern;
public class Tester {

	public static void main(String[] args) {
		// test case 1
		String[] words1 = {"abc","deq","mee","aqq","dkd","ccc"}; 
		String pattern = "abb";
		System.out.println(findAndReplacePattern(words1, pattern));//[mee, aqq]
		
		// test case 2
		String[] words2 = {"a","b","c"}; 
		pattern = "a";
		System.out.println(findAndReplacePattern(words2, pattern));//[a, b, c]
		

	}

}
