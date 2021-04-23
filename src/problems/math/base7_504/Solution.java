package problems.math.base7_504;

public class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder result = new StringBuilder();
        boolean minus = num < 0;
        if(minus){
            num = -num;
        }
        while(num != 0){
            result.insert(0, num % 7);
            num = num / 7;
        }
        if(minus) result.insert(0, '-');
        return result.toString();
    }
}
