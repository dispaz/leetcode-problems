package problems.tree.symmetric;

import problems.tree.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmRec(root.left, root.right);
    }

    private boolean isSymmRec(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        else if (left == null || right == null) return false;

        if(left.val != right.val) return false;
        boolean r1 = isSymmRec(left.left, right.right);
        if(!r1) return false;
        return isSymmRec(left.right, right.left);
    }
}
