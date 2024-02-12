package q_284_PeekingIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Design an iterator that supports the peek operation on an existing iterator in addition to the hasNext and the next operations.

Implement the PeekingIterator class:

PeekingIterator(Iterator<int> nums) Initializes the object with the given integer iterator iterator.
int next() Returns the next element in the array and moves the pointer to the next element.
boolean hasNext() Returns true if there are still elements in the array.
int peek() Returns the next element in the array without moving the pointer.
Note: Each language may have a different implementation of the constructor and Iterator, but they all support the int next() and boolean hasNext() functions.
*/

/*
Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 1000
All the calls to next and peek are valid.
At most 1000 calls will be made to next, hasNext, and peek.
*/


class PeekingIterator implements Iterator<Integer> {
	List<Integer> list;
	int index = -1;

	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		list = new ArrayList<>();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return list.get(index + 1);
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		return list.get(++index);
	}

	@Override
	public boolean hasNext() {
		if (index + 1 < list.size()) {
			return true;
		} else {
			return false;
		}
	}
}