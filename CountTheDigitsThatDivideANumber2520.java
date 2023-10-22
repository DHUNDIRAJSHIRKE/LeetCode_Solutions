package CountTheDigitsThatDivideANumber2520;

public class CountTheDigitsThatDivideANumber2520 {
	public int countDigits(int num) {

		int[] number = new int[20];
		int count = 0;
		int n = num;
		int i = 0;
		// in while loop every digit of number is being separated using modulo operator
		while (n != 0) {
			int tem = n % 10;
			n = n / 10;
			number[i++] = tem;
		}
		// in for loop using modulo operator we are checking how many digits divide the
		// number
		for (int j = 0; j < i; j++) {
			if (num % number[j] == 0) {
				count++;
			}
		}
		return count;
	}
}
