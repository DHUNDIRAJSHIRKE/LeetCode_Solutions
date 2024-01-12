package q_1704_DetermineIfStringHalvesAreAlike;
import static q_1704_DetermineIfStringHalvesAreAlike.Solution.halvesAreAlike;
public class Tester {

	public static void main(String[] args) {
		
		String s;
		
		//Test case 1
		s= "book";
		//true
		
		//Test case 2
//		s = "textbook";
		//false
		
		System.out.println(halvesAreAlike(s));
	}

}
