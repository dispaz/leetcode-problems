package arrayproblems.maximumaveragesubarray_643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        int result = sum;
        for(int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i-k];
            result = Math.max(result, sum);
        }

        return result/(double)k;
    }
}
