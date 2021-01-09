package tree.levelordertraversal_107;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            LinkedList<Integer> list = new LinkedList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);

            }
            result.add(0, list);
        }
        return result;
    }

    public List<List<Integer>> levelOrderBottomRecursion(TreeNode root){
        ArrayList<List<Integer>> result = new ArrayList<>();
        addFromLevel(result, 0, root);
        return result;
    }

    private void addFromLevel(ArrayList<List<Integer>> list, int level, TreeNode node){
        if(node == null) return;
        if(list.size() - 1 < level) list.add(0, new ArrayList<Integer>());
        list.get(list.size() - 1 - level).add(node.val);
        addFromLevel(list, level + 1, node.left);
        addFromLevel(list, level + 1, node.right);
    }

}
