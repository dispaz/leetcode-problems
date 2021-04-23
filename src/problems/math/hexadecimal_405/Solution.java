package problems.math.hexadecimal_405;

public class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        StringBuilder str = new StringBuilder();
        while(num != 0){
            int val = (num & 0xf);
            str.insert(0, val >= 10 ? (char) ('a' + (val - 10)) : Integer.toString(val));
            num = num >>> 4;
        }
        return str.toString();
    }
    public static void main(String [] args){
//        System.out.println(toHex(1315));
    }
}


