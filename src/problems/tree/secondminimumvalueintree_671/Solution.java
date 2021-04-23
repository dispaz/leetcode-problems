package problems.tree.secondminimumvalueintree_671;

import problems.tree.TreeNode;

public class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        int greatest = greatestThanRoot(root, root.val);
        if(greatest == root.val)
            return -1;
        return greatest;
    }

    private int greatestThanRoot(TreeNode root, int mainmin){
        if(root.left == null && root.right == null || root.val > mainmin){
            return root.val;
        }
        int left = greatestThanRoot(root.left, mainmin);
        int right = greatestThanRoot(root.right, mainmin);
        int min = Math.min(left, right);
        return mainmin < min ? min : Math.max(left, right);
    }
}
