package tree.countcomplete_222;

import tree.TreeNode;

public class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int hLeft = getHeight(root.left), hRight = getHeight(root.right);
        if(hLeft == hRight){
            return (1 << hRight) + countNodes(root.right);
        } else {
            return (1 << hRight) + countNodes(root.left); //add last left node from right subtree
        }
    }

    private int getHeight(TreeNode n){
        if(n == null) return 0;

        return 1 + getHeight(n.left);
    }
}
