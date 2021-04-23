package problems.dynamicprogramming.climbstairs_70;

public class Solution {
    // dynamic
    public int climbStairs(int n) {
        int [] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    //brute force
    public int climbStairsBrute(int n ){
        if(n < 2){
            return 1;
        }
        return climbStairsBrute(n - 1) + climbStairsBrute(n - 2);
    }

}
