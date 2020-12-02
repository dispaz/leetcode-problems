package bitmanipulation.reversebits_190;

public class Solution {
    public int myReverseBits(int n) {
        int shift = 1, result = 0;
        for(int i = 0; i < 32; i++){
            result <<= 1;
            if((n & shift) != 0){
                result |= 1;
            }
            shift <<= 1;
        }
        return result;
    }

    public int leetCodeReverseBits(int n){
        int power = 31, result = 0;
        for(int i = 0; i < 32; i++){
            result += (n & 1) << power;
            n >>= 1;
            power--;
        }
        return result;
    }
}
