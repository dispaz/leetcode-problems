package problems.tree.arraytotree_108;

import problems.tree.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return recursionArrayToTree(nums, 0, nums.length - 1);
    }

    public TreeNode recursionArrayToTree(int [] nums, int f, int l){
        if(f > l){
            return null;
        }

        int index = ( f + l ) / 2;
        TreeNode n = new TreeNode(nums[index]);
        n.left = recursionArrayToTree(nums, f, index - 1);
        n.right = recursionArrayToTree(nums, index + 1, l);
        return n;
    }

}
