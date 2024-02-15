package q_1742_MaximumNumberOfBallsInABox;
import static q_1742_MaximumNumberOfBallsInABox.Solution.countBalls;
public class Tester {

	public static void main(String[] args) {
		//test case 1
		int lowLimit=11;
		int highLimit=104;
		System.out.println(countBalls(lowLimit, highLimit));//9
		
		//test case 2
		lowLimit=5;
		highLimit=15;
		System.out.println(countBalls(lowLimit, highLimit));//2
		

		//test case 3
		lowLimit=19;
		highLimit=28;
		System.out.println(countBalls(lowLimit, highLimit));//2
	}

}
