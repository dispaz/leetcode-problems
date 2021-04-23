package problems.arrayproblems.largestnumberatleasttwice_747;

public class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0, prev = 0, index = 0;

        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                prev = max;
                max = nums[i];
                index = i;
            } else if(prev < nums[i]){
                prev = nums[i];
            }
        }

        return prev * 2 > max ? -1 : index;
    }
}
