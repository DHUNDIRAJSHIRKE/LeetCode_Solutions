package q_705_DesignHashSet;

import java.util.ArrayList;

/*
Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
*/

/*
Constraints:

0 <= key <= 106
At most 104 calls will be made to add, remove, and contains.
*/

class MyHashSet {
	ArrayList<Integer> list;

	public MyHashSet() {
		list = new ArrayList<Integer>();
	}

	public void add(int key) {
		if (!list.contains(key))
			list.add(key);
	}

	public void remove(int key) {
		Integer k = key;
		list.remove(k);
	}

	public boolean contains(int key) {
		return list.contains(key);
	}
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj
 * = new MyHashSet(); obj.add(key); obj.remove(key); boolean param_3 =
 * obj.contains(key);
 */
