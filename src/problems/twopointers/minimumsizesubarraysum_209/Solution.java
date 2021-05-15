package problems.twopointers.minimumsizesubarraysum_209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE, sum = 0, l = 0, r = 0;
        for(; r < nums.length; r++){
            sum += nums[r];
            while(sum >= target){
                result = Math.min(result, r + 1 - l);
                sum -= nums[l++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
