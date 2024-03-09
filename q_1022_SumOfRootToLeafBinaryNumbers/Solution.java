package q_1022_SumOfRootToLeafBinaryNumbers;

import java.util.ArrayList;


/*
You are given the root of a binary tree where each node has a value 0 or 1. Each root-to-leaf path represents a binary number starting with the most significant bit.

For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return the sum of these numbers.

The test cases are generated so that the answer fits in a 32-bits integer.
*/

/*
Constraints:

The number of nodes in the tree is in the range [1, 1000].
Node.val is 0 or 1.
*/

class Solution {
	public int sumRootToLeaf(TreeNode root) {
		int sum = 0;
		int n;
		String str = "";
		ArrayList<String> list = new ArrayList<>();
		if (root != null) {
			getLists(root, list, str);
			for (int i = 0; i < list.size(); i++) {
				n = Integer.parseInt(list.get(i), 2);
				sum += n;
			}
		}
		return sum;
	}

	public static ArrayList<String> getLists(TreeNode root, ArrayList<String> list, String str) {
		str = str + "" + root.val;
		if (root.left != null) {
			getLists(root.left, list, str);
		}
		if (root.right != null) {
			getLists(root.right, list, str);
		}
		if (root.right == null && root.left == null) {
			list.add(str);
		}
		return list;
	}
}


/**
 * Definition for a binary tree node. 
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