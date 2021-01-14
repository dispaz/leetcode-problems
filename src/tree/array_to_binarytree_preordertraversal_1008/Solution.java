package tree.array_to_binarytree_preordertraversal_1008;

import tree.TreeNode;

public class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++){
            addNode(root, preorder[i]);
        }
        return root;
    }
    private int i = 1;
    TreeNode addNode(TreeNode root, int value){
        System.out.println(i++);
        if(root == null){
            return new TreeNode(value);
        }

        if(root.val > value){
            root.left = addNode(root.left, value);
        }
        else {
            root.right = addNode(root.right, value);
        }
        return root;
    }
}

class Solution2 {
    private int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, Integer.MAX_VALUE);
    }
    public TreeNode bstFromPreorder(int[] arr, int bound) {
        if(i == arr.length || arr[i] > bound){
            return null;
        }
        TreeNode root = new TreeNode(arr[i++]);
        root.left = bstFromPreorder(arr, root.val);
        root.right = bstFromPreorder(arr, bound);
        return root;
    }
}
