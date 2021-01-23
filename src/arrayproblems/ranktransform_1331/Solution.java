package arrayproblems.ranktransform_1331;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        int [] ret = Arrays.copyOf(arr, arr.length);
        Arrays.sort(ret);

        for(int x : ret){
            map.putIfAbsent(x, map.size() + 1);
        }

        for(int i = 0; i < ret.length; i++){
            ret[i] = map.get(arr[i]);
        }

        return ret;
    }
}