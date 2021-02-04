package tree.bfsmode_501;

import tree.TreeNode;

public class Solution {
    int currentVal;
    int [] res;
    int count = 0;
    int max = 0;
    int modeCount = 0;

    public int[] findMode(TreeNode root) {
        inorder(root);
        res = new int[modeCount];
        count = 0;
        modeCount = 0;
        inorder(root);
        return res;
    }

    void calculateCount(int value){
        if(value != currentVal){
            currentVal = value;
            count = 0;
        }

        count++;

        if(max < count){
            max = count;
            modeCount = 1;
        } else if(max == count) {
            if(res != null){
                res[modeCount] = value;
            }
            modeCount++;
        }

    }

    void inorder(TreeNode root){
        TreeNode n = root;
        while(n != null){
            if(n.left == null){
                calculateCount(n.val);
                n = n.right;
            } else {
                TreeNode prev = n.left;
                while(prev.right != null && prev.right != n){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = n;
                    n = n.left;
                } else {
                    prev.right = null;
                    calculateCount(n.val);
                    n = n.right;
                }
            }
        }
    }
}
