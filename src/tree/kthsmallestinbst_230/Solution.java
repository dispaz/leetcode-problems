package tree.kthsmallestinbst_230;

import tree.TreeNode;

import java.util.Stack;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack();

        while(root != null){
            stack.add(root);
            root = root.left;
        }

        while(k > 0){
            root = stack.pop();
            if(--k == 0) return root.val;
            root = root.right;
            while(root != null){
                stack.add(root);
                root = root.left;
            }
        }

        return -1;
    }
}
