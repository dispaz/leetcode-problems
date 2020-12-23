package hashtable.happynumber_202;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int result = n;
        while(result != 1){
            result = 0;
            while(n > 0){
                int curr = n % 10;
                n /= 10;
                result += curr * curr;
            }
            if(set.contains(result)){
                return false;
            }
            set.add(result);
            n = result;
        }
        return true;
    }
    public static void main(String[] args){
        int x = 132;
        int result = 0;
        while(x > 10){
            int curr = x % 10;
            x /= 10;
            result += curr * curr;
        }
    }
}
