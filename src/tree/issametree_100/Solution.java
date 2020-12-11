package tree.issametree_100;

import tree.TreeNode;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        } else if (p == null && q != null || p != null && q == null){
            return false;
        }

        if(p.val != q.val) return false;
        boolean lTree = isSameTree(p.left, q.left);
        if(!lTree) return false;
        boolean rTree = isSameTree(p.right, q.right);
        return lTree && rTree;
    }
}
