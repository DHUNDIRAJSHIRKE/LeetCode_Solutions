package q_1379_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree;
/*Given two binary trees original and cloned and given a reference to a node target in the original tree.

The cloned tree is a copy of the original tree.

Return a reference to the same node in the cloned tree.

Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree. */

/*
Constraints:

The number of nodes in the tree is in the range [1, 104].
The values of the nodes of the tree are unique.
target node is a node from the original tree and is not null.
*/

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == target){
            return cloned;
        }
        TreeNode answer = null;
        if(original.left!=null){
            answer = traverse(original.left,cloned.left,target);
            if(answer!=null){
                return answer;
            }
        }
        if(original.right!=null){
            answer = traverse(original.right,cloned.right,target);
            if(answer!=null){
                return answer;
            }
        }
        return answer;
    }
    public static TreeNode traverse(TreeNode original, TreeNode cloned, TreeNode target){
        if(original == target){
            return cloned;
        }
        TreeNode answer = null;
        if(original.left!=null){
            answer = traverse(original.left,cloned.left,target);
            if(answer!=null){
                return answer;
            }
        }
        if(original.right!=null){
            answer = traverse(original.right,cloned.right,target);
            if(answer!=null){
                return answer;
            }
        }
        return answer;
    }
}