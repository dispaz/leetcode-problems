package problems.arrayproblems.numberofequivalentdominopairs_1128;

import java.util.HashMap;

public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int[] d : dominoes){
            int k = Math.min(d[0], d[1]) * 10 + Math.max(d[0],d[1]);
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        int res = 0;
        for(int v : map.values()){
            res += v * (v - 1) / 2;
        }
        return res;
    }
}
