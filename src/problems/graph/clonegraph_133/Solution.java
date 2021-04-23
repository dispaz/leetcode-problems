package problems.graph.clonegraph_133;

import problems.graph.Node;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Integer, Node> builded = new HashMap();
        return cloneGraph(builded, node);
    }

    Node cloneGraph(HashMap<Integer, Node> map, Node root) {
        if(root == null) return null;
        Node node = new Node(root.val, new ArrayList<Node>());
        map.put(node.val, node);
        for(int i = 0; i < root.neighbors.size(); i++){
            if(map.containsKey(root.neighbors.get(i).val)){
                node.neighbors.add(map.get(root.neighbors.get(i).val));
            }
            else
            {
                node.neighbors.add(cloneGraph(map, root.neighbors.get(i)));
            }
        }
        return node;
    }
}
