package arrayproblems.mostvisitedsector_1560;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int m = rounds.length, from = rounds[0], to = rounds[m - 1];
        List<Integer> res = new ArrayList();

        if(from <= to){
            for(int i = from; i <= to; i++){
                res.add(i);
            }
        } else {
            for(int i = 1; i <= to; i++){
                res.add(i);
            }

            for(int i = from; i <= n; i++){
                res.add(i);
            }
        }
        return res;
    }
}
