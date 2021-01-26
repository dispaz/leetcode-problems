package tree.minimumdepth_111;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        int depth = 0;
        if(root != null)
            q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                TreeNode n = q.poll();
                if(n.left == null && n.right == null){
                    return depth + 1;
                }
                if(n.left != null)
                    q.add(n.left);
                if(n.right!= null)
                    q.add(n.right);
            }
            depth++;
        }
        return depth;
    }
}
