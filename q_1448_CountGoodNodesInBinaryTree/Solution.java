package q_1448_CountGoodNodesInBinaryTree;

/*
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.

Return the number of good nodes in the binary tree.
 */

/*
 * Constraints:

The number of nodes in the binary tree is in the range [1, 10^5].
Each node's value is between [-10^4, 10^4].
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
	public int goodNodes(TreeNode root) {
		int count = 1;
		int highest = root.val;
		if (root.left != null) {
			count += countGood(root.left, highest);
		}
		if (root.right != null) {
			count += countGood(root.right, highest);
		}

		return count;
	}

	public static int countGood(TreeNode root, int highest) {
		int local_count = 0;
		if (root.val >= highest) {
			local_count++;
			highest = root.val;
		}
		if (root.left != null) {
			local_count += countGood(root.left, highest);
		}
		if (root.right != null) {
			local_count += countGood(root.right, highest);
		}
		return local_count;
	}
}
