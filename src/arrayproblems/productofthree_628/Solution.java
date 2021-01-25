package arrayproblems.productofthree_628;

import java.util.Arrays;

public class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = max1, max3 = max2;
        int min1 = Integer.MAX_VALUE, min2 = min1;

        for(int x : nums){
            if(x <= min1){
                min2 = min1;
                min1 = x;
            } else if(x <= min2){
                min2 = x;
            }

            if(x >= max1){
                max3 = max2;
                max2 = max1;
                max1 = x;
            }
            else if (x >= max2){
                max3 = max2;
                max2 = x;
            }
            else if (x >= max3) {
                max3 = x;
            }
        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

    public int maximumProduct2(int [] nums){
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }

}
