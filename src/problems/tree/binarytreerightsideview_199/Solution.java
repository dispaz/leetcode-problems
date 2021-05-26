package problems.tree.binarytreerightsideview_199;

import problems.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList();

        if(root == null)
            return result;

        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode n = q.peek();

            for(int i = 0; i < size; i++){
                n = q.poll();
                if(n.left != null) q.offer(n.left);
                if(n.right != null) q.offer(n.right);
            }

            result.add(n.val);
        }

        return result;
    }
}
