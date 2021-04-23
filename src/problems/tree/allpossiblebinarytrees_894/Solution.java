package problems.tree.allpossiblebinarytrees_894;

import problems.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<Integer, List<TreeNode>> map = new HashMap();
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> res = new ArrayList();
        if(N % 2 == 0){
            return res;
        }
        if(N == 1){
            res.add(new TreeNode(0));
            return res;
        }
        if(map.containsKey(N)){
            return map.get(N);
        }

        N--;
        for(int i = 1; i < N; i += 2){
            List<TreeNode> l = allPossibleFBT(i);
            List<TreeNode> r = allPossibleFBT(N-i);
            for(TreeNode nl : l){
                for(TreeNode nr : r){
                    TreeNode n = new TreeNode(0);
                    n.right = nr;
                    n.left = nl;
                    res.add(n);
                }
            }
        }
        map.put(N + 1, res);
        return res;
    }
}
