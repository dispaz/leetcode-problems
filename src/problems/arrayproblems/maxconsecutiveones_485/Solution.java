package problems.arrayproblems.maxconsecutiveones_485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, result = 0;
        for(int num : nums){
            if(num == 0){
                result = Math.max(result, count);
                count = 0;
            }
            else {
                count++;
            }
        }

        return Math.max(result, count);
    }
}
