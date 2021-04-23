package problems.tree.binarytreeinordertraversal_94;

import problems.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        addNodes(list, root);
        return list;
    }

    private void addNodes(List<Integer> list, TreeNode n){
        if(n == null) return;
        addNodes(list, n.left);
        list.add(n.val);
        addNodes(list, n.right);
    }
}
