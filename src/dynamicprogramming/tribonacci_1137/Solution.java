package dynamicprogramming.tribonacci_1137;

public class Solution {
    Integer [] arr;
    public int tribonacci(int n) {
        arr = new Integer[n + 1];
        if(n == 0) return 0;
        arr[0] = 0;
        if(n == 1 || n == 2) return 1;
        arr[1] = 1;
        arr[2] = 1;
        return helper(n);
    }

    int helper(int n){
        if(n < 3) return arr[n];
        if(arr[n] == null)
            arr[n] = helper(n - 1) + helper(n - 2) + helper(n - 3);
        return arr[n];
    }
}
