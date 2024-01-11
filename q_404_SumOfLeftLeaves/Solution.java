/*
Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

*/

/*
Constraints:

The number of nodes in the tree is in the range [1, 1000].
-1000 <= Node.val <= 1000
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum =0;
        if(root.left!=null){
            if(root.left.left ==null && root.left.right ==null ){
                sum+=root.left.val;
            }else{
                sum+= addLeft(root.left);
            }
        }
        if(root.right!=null){
                sum += addLeft(root.right);
        }
        return sum;
    }
    public static int addLeft(TreeNode root){
         int temp =0;
         if(root.left!=null){
            if(root.left.left ==null && root.left.right ==null ){
                temp+=root.left.val;
            }else{
                temp+= addLeft(root.left);
            }
        }
        if(root.right!=null){
                temp += addLeft(root.right);
        }
        return temp;
    }
}