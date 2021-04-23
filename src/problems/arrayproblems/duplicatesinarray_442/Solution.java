package problems.arrayproblems.duplicatesinarray_442;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                res.add(Math.abs(nums[i]));
            }
            nums[index] = -nums[index];
        }
        return res;
    }
}
