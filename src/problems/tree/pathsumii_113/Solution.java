package problems.tree.pathsumii_113;

import problems.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList();
        pathSum(root, result, temp, targetSum);
        return result;
    }

    private void pathSum(TreeNode root, List<List<Integer>> result, List<Integer> tmp, int sum){
        if(root == null){
            return;
        }
        tmp.add(root.val);
        if(root.left == null && root.right == null && sum == root.val){
            result.add(new ArrayList(tmp));
        }

        pathSum(root.left, result, tmp, sum - root.val);
        pathSum(root.right, result, tmp, sum - root.val);
        tmp.remove(tmp.size() - 1);
    }
}
