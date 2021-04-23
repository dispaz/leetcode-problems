package problems.arrayproblems.pivotindex_724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        for(int num : nums){
            rightSum += num;
        }

        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(rightSum - nums[i] - leftSum == leftSum)
                return i;
            leftSum += nums[i];
        }

        return -1;
    }
}
