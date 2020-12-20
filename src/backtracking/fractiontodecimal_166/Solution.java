package backtracking.fractiontodecimal_166;

import java.util.HashMap;

public class Solution {
    public static String fractionToDecimal(int nominator, int denominator) {
        if(nominator == 0)
            return "0";
        StringBuilder result = new StringBuilder();
        if((nominator > 0) ^ (denominator > 0))
            result.append('-');
        int n = Math.abs(nominator);
        int d = Math.abs(denominator);

        result.append(n/d);
        n %= d;
        if(n == 0){
            return result.toString();
        }

        result.append(".");

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(n, result.length());

        while(n != 0){
            n *= 10;
            result.append(n/d);
            n %= d;
            if(map.containsKey(n)){
                result.insert(map.get(n), "(");
                result.append(')');
                break;
            }
            else {
                map.put(n, result.length());
            }
        }

        return result.toString();
    }

    public static void main(String [] args){
        fractionToDecimal(32, 13);
    }
}
