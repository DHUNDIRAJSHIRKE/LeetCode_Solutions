package q_173_BinarySearchTreeIterator;

import java.util.ArrayList;
import java.util.List;


/*
Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):

BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
int next() Moves the pointer to the right, then returns the number at the pointer.
Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.

You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.
*/

/*
Constraints:

The number of nodes in the tree is in the range [1, 10^5].
0 <= Node.val <= 10^6
At most 10^5 calls will be made to hasNext, and next.
*/



class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class BSTIterator {

	List<Integer> list;
	int index = -1;
	int size;

	public BSTIterator(TreeNode root) {
		list = inorderTraversal(root);
		size = list.size();
	}

	public int next() {
		if (index + 1 <= size - 1) {
			return list.get(++index);
		} else {
			return -1;
		}
	}

	public boolean hasNext() {
		if (index + 1 <= size - 1) {
			return true;
		} else {
			return false;
		}
	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root != null) {

			inTrav(root, list);
		}

		return list;
	}

	public static void inTrav(TreeNode root, List<Integer> list) {
		if (root.left != null) {
			inTrav(root.left, list);
		}
		list.add(root.val);
		if (root.right != null) {
			inTrav(root.right, list);
		}

	}
}

/**
 * Your BSTIterator object will be instantiated and called as such: BSTIterator
 * obj = new BSTIterator(root); int param_1 = obj.next(); boolean param_2 =
 * obj.hasNext();
 */