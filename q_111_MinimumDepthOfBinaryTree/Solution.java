package q_111_MinimumDepthOfBinaryTree;

import java.util.ArrayList;
import java.util.List;

/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.
*/

/*
Constraints:

The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000S
*/



/*
  Definition for a binary tree node.
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

class Solution {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		getDepth(list, root, count);
		int min = Integer.MAX_VALUE;
		for (Integer num : list) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	public static void getDepth(List<Integer> list, TreeNode root, int count) {
		count++;
		if (root.left == null && root.right == null) {
			list.add(count);
			return;
		} else {
			if (root.left != null) {
				getDepth(list, root.left, count);
			}
			if (root.right != null) {
				getDepth(list, root.right, count);
			}
		}
	}
}
