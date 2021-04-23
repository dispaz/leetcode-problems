package problems.tree.cousinsbinarytree_993;

import problems.tree.TreeNode;

public class Solution {
    TreeNode l = null;
    TreeNode r = null;
    int leftDepth = -1;
    int rightDepth = -2;

    public boolean isCousins(TreeNode root, int x, int y) {

        getDepth(root, null, x, y, 0);
        return l != r && leftDepth == rightDepth;
    }

    public void getDepth(TreeNode n, TreeNode parent, int x, int y, int level){
        if(n == null) return;
        if(n.val == x) {
            l = parent;
            leftDepth = level;
        } else if(n.val == y) {
            r = parent;
            rightDepth = level;
        } else {
            getDepth(n.left, n, x, y, level + 1);
            getDepth(n.right, n, x, y, level + 1);
        }
    }
}
