package problems.backtracking.combinationsum_39;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }

    void backtracking(List<List<Integer>> result, List<Integer> tmpList, int[] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0){
            result.add(new ArrayList<>(tmpList));
        }
        else {
            for(int i = start; i < nums.length; i++){
                tmpList.add(nums[i]);
                backtracking(result, tmpList, nums, remain - nums[i], i);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }
}
