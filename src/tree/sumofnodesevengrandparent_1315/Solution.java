package tree.sumofnodesevengrandparent_1315;

import tree.TreeNode;

public class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        return sumHelper(root, 0, 0);
    }

    public int sumHelper(TreeNode current, int parent, int grandparent){
        int sum = 0;
        if(current == null){
            return sum;
        }

        if(grandparent != 0 && grandparent % 2 == 0){
            sum += current.val;
        }

        sum += sumHelper(current.left, current.val, parent);
        sum += sumHelper(current.right, current.val, parent);
        return sum;
    }
}

class Solution2 {
    public int sumEvenGrandparent(TreeNode root) {
        int result = 0;
        if(root == null)
            return 0;

        result += sumEvenGrandparent(root.left);
        result += sumEvenGrandparent(root.right);
        if(root.val % 2 == 0){
            result += root.left != null ? sumOfGrandChildren(root.left) : 0;
            result += root.right != null ? sumOfGrandChildren(root.right) : 0;
        }
        return result;
    }

    int sumOfGrandChildren(TreeNode n){
        int sum = 0;

        if(n.left != null){
            sum += n.left.val;
        }
        if(n.right != null){
            sum += n.right.val;
        }
        return sum;
    }
}
