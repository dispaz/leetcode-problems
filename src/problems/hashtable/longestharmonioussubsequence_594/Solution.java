package problems.hashtable.longestharmonioussubsequence_594;

import java.util.HashMap;

public class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int max = 0;

        for(int key : map.keySet()){
            if(map.containsKey(key + 1)){
                max = Math.max(max, map.get(key) + map.get(key + 1));
            }
        }

        return max;
    }
}
