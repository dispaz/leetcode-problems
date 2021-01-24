package math.isugly_263;

public class Solution {
    public boolean isUgly(int num) {
        if(num == 1 || num == 2 || num == 3 || num == 5) return true;

        if(num == 0) return false;

        boolean result = false;

        if(num % 2 == 0){
            result = result || isUgly(num/2);
        }

        if(num % 3 == 0){
            result = result || isUgly(num/3);
        }

        if(num % 5 == 0){
            result = result || isUgly(num/5);
        }

        return result;
    }
}
