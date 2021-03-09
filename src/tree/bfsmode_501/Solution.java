package tree.bfsmode_501;

import tree.TreeNode;

class Solution {
    int curr;
    int [] res;
    int freq = 0;
    int max = 0;
    int modeCount = 0;

    public int[] findMode(TreeNode root) {
        inorderModeCount(root);
        res = new int[modeCount];
        freq = 0;
        curr = 0;
        inorderMode(root);
        return res;
    }

    void inorderModeCount(TreeNode root){
        if(root == null){
            return;
        }

        inorderModeCount(root.left);

        if(curr != root.val){
            curr = root.val;
            freq = 0;
        }

        freq++;

        if(max < freq){
            max = freq;
            modeCount = 1;
        } else if(max == freq){
            modeCount++;
        }

        inorderModeCount(root.right);
    }

    void inorderMode(TreeNode root){
        if(root == null || modeCount == 0){
            return;
        }

        inorderMode(root.left);

        if(curr != root.val){
            curr = root.val;
            freq = 0;
        }

        freq++;

        if(freq == max){
            res[--modeCount] = curr;
        }

        inorderMode(root.right);
    }
}

class Solution2 {
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
