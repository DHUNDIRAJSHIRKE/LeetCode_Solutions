package q_191_NumberOf1Bits;
import static q_191_NumberOf1Bits.Solution.hammingWeight;
public class Tester {

	public static void main(String[] args) {

		// test case 1
		int n = 00000000000000000000000000001011;
		System.out.println(hammingWeight(n));//3
	
		// test case 2
		n = 00000000000000000000000010000000;
		System.out.println(hammingWeight(n));//1

		// test case 3
		n = -3;
		System.out.println(hammingWeight(n));//31
		
		
	}
}
