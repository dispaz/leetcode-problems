package problems.tree.issubtree_572;

import problems.tree.TreeNode;

public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null) return false;
        if(isSame(s, t)) return true;

        return isSubtree(s.right, t) || isSubtree(s.left, t);
    }

    public boolean isSame(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null || s.val != t.val) return false;

        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}
