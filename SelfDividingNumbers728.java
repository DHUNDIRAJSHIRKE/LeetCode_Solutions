package selfDividingNumbers728;
import java.util.List;
import java.util.ArrayList;
public class SelfDividingNumbers728 {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			int n = countDigits(i);
			if (n != 0) {
				intList.add(n);
			}
		}
		return intList;
	}

	public static int countDigits(int num) {
		int[] number = new int[20];
		int n = num;
		int i = 0;
		boolean flag = true;
		boolean skip = false;
		// in while loop every digit of number is being separated using modulo operator
		while (n != 0) {
			int tem = n % 10;
			if (tem == 0) {
				skip = true;
			}
			n = n / 10;
			number[i++] = tem;
		}
		// in for loop using modulo operator we are checking how many digits divide the
		// number
		if (skip) {
			return 0;
		}
		if (!skip) {
			for (int j = 0; j < i; j++) {
				if (number[j] > 0) {
					if (num % number[j] != 0) {
						flag = false;
					}
				}
			}
		}
		if (flag) {
			return num;
		}
		return 0;
	}
}
