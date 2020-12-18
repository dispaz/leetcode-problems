package backtracking.combinationsum_40;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        HashSet<List<Integer>> result = new HashSet<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return new ArrayList<>(result);
    }

    public void backtrack(HashSet<List<Integer>> result, List<Integer> tmpList, int[] nums, int remain, int index){
        if(remain == 0){
            result.add(new ArrayList<>(tmpList));
        }
        else if(remain > 0){
            for(int i = index; i < nums.length; i++){
                tmpList.add(nums[i]);
                backtrack(result, tmpList, nums, remain - nums[i], i + 1);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }
}
