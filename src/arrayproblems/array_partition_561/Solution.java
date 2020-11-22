package arrayproblems.array_partition_561;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /*
    Given an integer array nums of 2n integers,
    group these integers into n pairs (a1, b1), (a2, b2), ...,
    (an, bn) such that the sum of min(ai, bi)
    for all i is maximized. Return the maximized sum.

    [1,4,3,2] = 4
    [1,2,4,7,3,5,8,6] = 16


     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); //(O(NlogN))!
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}
