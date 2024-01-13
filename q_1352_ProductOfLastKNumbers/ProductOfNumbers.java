package q_1352_ProductOfLastKNumbers;

import java.util.ArrayList;

/*
 * Design an algorithm that accepts a stream of integers and retrieves the product of the last k integers of the stream.

Implement the ProductOfNumbers class:

ProductOfNumbers() Initializes the object with an empty stream.
void add(int num) Appends the integer num to the stream.
int getProduct(int k) Returns the product of the last k numbers in the current list. 
You can assume that always the current list has at least k numbers.
The test cases are generated so that, at any time, the product of any contiguous sequence of numbers will fit into a single 32-bit integer without overflowing.
 * 
 */




/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers(); obj.add(num); int param_2 =
 * obj.getProduct(k);
 */

/*
Constraints:

0 <= num <= 100
1 <= k <= 4 * 104
At most 4 * 104 calls will be made to add and getProduct.
The product of the stream at any point in time will fit in a 32-bit integer.
*/

class ProductOfNumbers {
	ArrayList<Integer> list;

	public ProductOfNumbers() {
		list = new ArrayList<Integer>();

	}

	public void add(int num) {
		list.add(num);
	}

	public int getProduct(int k) {
		int product = 1;
		int l = list.size();
		for (int i = l - 1; i >= (l - k); i--) {
			product *= list.get(i);
			if (product == 0) {
				return 0;
			}
		}
		return product;
	}
}
