package binarysearch.sqrt;

public class Solution {
    public int mySqrt(int x) {
        int start = 0, end = 46340, mid = end / 2, result = 0;

        while(end >= start){
            if(mid * mid == x){
                return mid;
            }
            else if(mid * mid > x){
                end = mid - 1;
            }
            else if(mid * mid < x){
                start = mid + 1;
                result = mid;
            }

            mid = (start + end)/2;
        }

        return result;
    }
}
