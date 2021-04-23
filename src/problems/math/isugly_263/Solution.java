package problems.math.isugly_263;

public class Solution {
    public boolean isUgly(int num) {
        if(num == 1) return true;

        if(num <= 0) return false;

        boolean result = false;

        if(num % 2 == 0){
            result = result || isUgly(num/2);
        } else if(num % 3 == 0){
            result = result || isUgly(num/3);
        } else if(num % 5 == 0){
            result = result || isUgly(num/5);
        }

        return result;
    }
}
