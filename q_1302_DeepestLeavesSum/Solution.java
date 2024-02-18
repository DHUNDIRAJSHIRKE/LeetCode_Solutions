package q_1302_DeepestLeavesSum;

import java.util.HashMap;
import java.util.Map;

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

/*
 * Given the root of a binary tree, return the sum of values of its deepest
 * leaves.
 */

/*
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [1, 104]. 1 <= Node.val <=
 * 100
 */

class Solution {
	public int deepestLeavesSum(TreeNode root) {
		int count = 1;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(count, root.val);
		if (root.left != null) {
			getSum(map, count + 1, root.left);
		}
		if (root.right != null) {
			getSum(map, count + 1, root.right);
		}
		int max = 0;
		int maxSum = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (max < entry.getKey()) {
				max = entry.getKey();
				maxSum = entry.getValue();
			}
		}
		return maxSum;
	}

	public static void getSum(HashMap<Integer, Integer> map, int count, TreeNode root) {
		count++;
		int temp;
		if (map.containsKey(count)) {
			temp = map.get(count);
			map.put(count, temp + root.val);
		} else {
			map.put(count, root.val);
		}
		if (root.left != null) {
			getSum(map, count + 1, root.left);
		}
		if (root.right != null) {
			getSum(map, count + 1, root.right);
		}
	}
}