package problems.tree.binarytreemaximumpathsum_124;

import problems.tree.TreeNode;

public class Solution {
    private int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        calculate(root);
        return max;
    }

    private int calculate(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0, calculate(root.left));
        int right = Math.max(0, calculate(root.right));
        max = Math.max(max, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
