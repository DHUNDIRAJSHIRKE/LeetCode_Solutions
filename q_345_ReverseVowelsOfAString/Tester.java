package q_345_ReverseVowelsOfAString;
import static q_345_ReverseVowelsOfAString.Solution.reverseVowels;
import static q_345_ReverseVowelsOfAString.Solution1.reverseVowels;
public class Tester {

	public static void main(String[] args) {
		// Test case 1
		String s = "hello";
		System.out.println(Solution.reverseVowels(s));//holle
		System.out.println(Solution1.reverseVowels(s));//holle
		
		// Test case 2
		s = "leetcode";
		System.out.println(Solution.reverseVowels(s));//leotcede
		System.out.println(Solution1.reverseVowels(s));//leotcede

	}

}
