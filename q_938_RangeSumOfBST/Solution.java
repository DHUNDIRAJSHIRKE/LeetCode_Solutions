package q_938_RangeSumOfBST;

/*
Given the root node of a binary search tree and two integers low and high, 
return the sum of values of all nodes with a value in the inclusive range [low, high].

Constraints:

The number of nodes in the tree is in the range [1, 2 * 104].
1 <= Node.val <= 105
1 <= low <= high <= 105
All Node.val are unique.

*/
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int tem =0;
        if(root.val<=high && root.val>=low){
            tem += root.val;
        }
        if(root.left!=null && root.val>low){
            tem += rangeSumBST(root.left,low, high);
        }
        if(root.right!=null && root.val<high){
            tem += rangeSumBST(root.right,low, high);
        }
        return tem;
    }
}