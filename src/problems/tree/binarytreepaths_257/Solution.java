package problems.tree.binarytreepaths_257;

import problems.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList();
        binaryTreePaths(root, result, "");
        return result;
    }

    private void binaryTreePaths(TreeNode root, List<String> result, String path){
        if(root == null){
            return;
        }

        String newPath = path + (path.isEmpty() ? "" : "->") + root.val;
        if(root.left == null && root.right == null){
            result.add(newPath);
            return;
        }

        binaryTreePaths(root.left, result, newPath);
        binaryTreePaths(root.right, result, newPath);
    }
}
