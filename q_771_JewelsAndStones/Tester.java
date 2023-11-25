package q_771_JewelsAndStones;
import static q_771_JewelsAndStones.Solution.numJewelsInStones;
public class Tester {

	public static void main(String[] args) {
		String jewels = "z";
		String stones = "ZZ";
		
		/*
		jewels = "z";
		stones = "ZZ";
		*/
		
		
		/*
		jewels = "aA"; 
		stones = "aAAbbbb";
		*/
		
		int ans  = numJewelsInStones(jewels,stones);
		System.out.println(ans);
	}

}
