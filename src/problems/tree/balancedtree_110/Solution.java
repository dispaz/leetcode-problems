package problems.tree.balancedtree_110;

import problems.tree.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return treeDepth(root) != -1;
    }

    private int treeDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        if(Math.abs(left - right) > 1 || left == -1 || right == -1 ){
            return -1;
        }

        return 1 + Math.max(left, right);
    }
}
