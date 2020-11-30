package bitmanipulation.number_of_bits_191;

public class Solution {
    public int hammingWeight(int n) {
        int shift = 1, count = 0;
        for(int i = 0; i < 32; i++){
            int result = n & shift;
            if(result == shift) count++;
            shift <<= 1;
        }
        return count;
    }
}
