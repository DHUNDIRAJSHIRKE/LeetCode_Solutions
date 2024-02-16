package q_1381_DesignAStackWithIncrementOperation;

/*
Design a stack that supports increment operations on its elements.

Implement the CustomStack class:

CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of elements in the stack.
void push(int x) Adds x to the top of the stack if the stack has not reached the maxSize.
int pop() Pops and returns the top of the stack or -1 if the stack is empty.
void inc(int k, int val) Increments the bottom k elements of the stack by val. 
If there are less than k elements in the stack, increment all the elements in the stack.
*/

/*
Constraints:

1 <= maxSize, x, k <= 1000
0 <= val <= 100
At most 1000 calls will be made to each method of increment, push and pop each separately.
*/

class CustomStack {
	int[] arr;
	int maxSize;
	int index = -1;

	public CustomStack(int maxSize) {
		this.maxSize = maxSize;
		arr = new int[maxSize];
	}

	public void push(int x) {
		if (index + 1 == maxSize) {
			return;
		}
		arr[++index] = x;
	}

	public int pop() {
		if (index < 0) {
			return -1;
		}
		int ret = arr[index];
		index--;
		return ret;
	}

	public void increment(int k, int val) {
		if (index < 0) {
			return;
		}
		for (int i = 0; i < k && i < maxSize; i++) {
			arr[i] += val;
		}
	}
}

/**
 * Your CustomStack object will be instantiated and called as such: CustomStack
 * obj = new CustomStack(maxSize); obj.push(x); int param_2 = obj.pop();
 * obj.increment(k,val);
 */
