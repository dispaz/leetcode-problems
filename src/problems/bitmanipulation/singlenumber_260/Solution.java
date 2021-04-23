package problems.bitmanipulation.singlenumber_260;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for(int x : nums){
            diff ^= x;
        }
        diff &= -diff;

        int [] result = new int[] {0,0};
        for(int x : nums){
            if((x & diff) == 0){
                result[0] ^= x;
            } else {
                result[1] ^=x;
            }
        }

        return result;
    }

    public static void main(String [] args){
        int diff = 7;
//        diff &= -diff;
        System.out.println(Integer.toBinaryString(-diff) + "\n" + Integer.toBinaryString(diff));
    }
}
