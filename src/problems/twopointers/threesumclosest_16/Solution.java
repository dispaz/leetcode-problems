package problems.twopointers.threesumclosest_16;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 2 && diff != 0; i++){
            int start = i + 1, end = arr.length - 1;
            while(start < end){
                int sum = arr[i] + arr[start] + arr[end];
                if(Math.abs(targetSum - sum) < Math.abs(diff)){
                    diff = targetSum - sum;
                }

                if(sum < targetSum){
                    start++;
                } else {
                    end--;
                }
            }
        }
        return targetSum - diff;
    }
}
