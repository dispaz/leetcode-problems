package problems.graph.findtownjudge_997;

import java.util.HashSet;

public class Solution {
    public int findJudge(int N, int[][] trust) {
        HashSet<Integer> set = new HashSet();
        boolean [] notJudge = new boolean[N];
        for(int i = 0; i < trust.length; i++){
            if(!set.contains(trust[i][1])){
                set.add(trust[i][1]);
            }
            notJudge[trust[i][0] - 1] = true;
        }

        for(int index : set){
            if(!notJudge[index - 1])
                return index;
        }
        return -1;
    }
}
