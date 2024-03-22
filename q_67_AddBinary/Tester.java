package q_67_AddBinary;

import static q_67_AddBinary.Solution.addBinary;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String a = "11";
		String b = "1";
		System.out.println(addBinary(a, b));//100

		// test case 2
		a = "1010";
		b = "1011";
		System.out.println(addBinary(a, b));//10101

	}

}
