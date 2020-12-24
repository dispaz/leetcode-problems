package hashtable.containsduplicate_219;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> indexes = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(indexes.containsKey(nums[i])){
                int j = indexes.get(nums[i]);
                if(Math.abs(i - j) == k)
                    return true;
                else
                    indexes.remove(nums[i]);
            }
            indexes.put(nums[i], i);
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums, int k){
        HashSet<Integer> values = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i > k){
                values.remove(i - k - 1);
            }
            if(!values.add(nums[i])) return  true;
        }
        return false;
    }
}
