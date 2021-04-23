package problems.tree.narytreelevelordertraversal_429;

import problems.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList();
        if(root == null)
            return res;

        Queue<Node> q = new LinkedList();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> children = new ArrayList();
            while(n > 0){
                Node node = q.poll();
                children.add(node.val);

                for(Node child : node.children){
                    q.add(child);
                }

                n--;
            }

            res.add(new ArrayList(children));
        }

        return res;
    }
}
