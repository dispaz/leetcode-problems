package problems.tree.longestconsecutive_298;

import problems.tree.TreeNode;

public class Solution {
    private int result = 0;
    public int longestConsecutive(TreeNode root) {
        if(root == null){
            return 0;
        }
        int count = lc(root);
        return Math.max(result, count);
    }

    private int lc(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = lc(root.left);
        int right = lc(root.right);
        int max = 1;
        if(root.left != null && root.val + 1 == root.left.val){
            max = Math.max(left + 1, max);
        }

        if(root.right != null && root.val + 1 == root.right.val){
            max = Math.max(right + 1, max);
        }
        result = Math.max(result, max);
        return max;
    }
}
